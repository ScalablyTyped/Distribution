package typings.ftp.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingElement extends js.Object {
  /**
    * The last modified date of the entry
    */
  var date: Date
  /**
    * The group name or ID that this entry belongs to **(*NIX only)**.
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * The name of the entry
    */
  var name: String
  /**
    * The user name or ID that this entry belongs to **(*NIX only)**.
    */
  var owner: js.UndefOr[String] = js.undefined
  /**
    * The various permissions for this entry **(*NIX only)**
    */
  var rights: js.UndefOr[FilePermissions] = js.undefined
  /**
    * The size of the entry in bytes
    */
  var size: Double
  /**
    * True if the sticky bit is set for this entry **(*NIX only)**.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
  /**
    * For symlink entries, this is the symlink's target **(*NIX only)**.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * A single character denoting the entry type: 'd' for directory, '-' for file (or 'l' for symlink on **\*NIX only**).
    */
  var `type`: String
}

object ListingElement {
  @scala.inline
  def apply(
    date: Date,
    name: String,
    size: Double,
    `type`: String,
    group: String = null,
    owner: String = null,
    rights: FilePermissions = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): ListingElement = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (rights != null) __obj.updateDynamic("rights")(rights.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListingElement]
  }
}

