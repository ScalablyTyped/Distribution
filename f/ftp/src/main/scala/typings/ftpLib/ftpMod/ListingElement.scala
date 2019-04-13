package typings
package ftpLib.ftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingElement extends js.Object {
  /**
    * The last modified date of the entry
    */
  var date: stdLib.Date
  /**
    * The group name or ID that this entry belongs to **(*NIX only)**.
    */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the entry
    */
  var name: java.lang.String
  /**
    * The user name or ID that this entry belongs to **(*NIX only)**.
    */
  var owner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The various permissions for this entry **(*NIX only)**
    */
  var rights: js.UndefOr[ftpLib.Anon_Group] = js.undefined
  /**
    * The size of the entry in bytes
    */
  var size: java.lang.String
  /**
    * True if the sticky bit is set for this entry **(*NIX only)**.
    */
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For symlink entries, this is the symlink's target **(*NIX only)**.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A single character denoting the entry type: 'd' for directory, '-' for file (or 'l' for symlink on **\*NIX only**).
    */
  var `type`: java.lang.String
}

object ListingElement {
  @scala.inline
  def apply(
    date: stdLib.Date,
    name: java.lang.String,
    size: java.lang.String,
    `type`: java.lang.String,
    group: java.lang.String = null,
    owner: java.lang.String = null,
    rights: ftpLib.Anon_Group = null,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null
  ): ListingElement = {
    val __obj = js.Dynamic.literal(date = date, name = name, size = size)
    __obj.updateDynamic("type")(`type`)
    if (group != null) __obj.updateDynamic("group")(group)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (rights != null) __obj.updateDynamic("rights")(rights)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ListingElement]
  }
}

