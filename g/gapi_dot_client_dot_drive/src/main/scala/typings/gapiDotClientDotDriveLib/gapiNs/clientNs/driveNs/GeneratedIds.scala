package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedIds extends js.Object {
  /** The IDs generated for the requesting user in the specified space. */
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#generatedIds". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The type of file that can be created with these IDs. */
  var space: js.UndefOr[java.lang.String] = js.undefined
}

object GeneratedIds {
  @scala.inline
  def apply(
    ids: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    space: java.lang.String = null
  ): GeneratedIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[GeneratedIds]
  }
}

