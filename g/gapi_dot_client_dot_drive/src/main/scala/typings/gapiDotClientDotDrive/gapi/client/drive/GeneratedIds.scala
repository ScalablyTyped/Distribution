package typings.gapiDotClientDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedIds extends js.Object {
  /** The IDs generated for the requesting user in the specified space. */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#generatedIds". */
  var kind: js.UndefOr[String] = js.undefined
  /** The type of file that can be created with these IDs. */
  var space: js.UndefOr[String] = js.undefined
}

object GeneratedIds {
  @scala.inline
  def apply(ids: js.Array[String] = null, kind: String = null, space: String = null): GeneratedIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedIds]
  }
}

