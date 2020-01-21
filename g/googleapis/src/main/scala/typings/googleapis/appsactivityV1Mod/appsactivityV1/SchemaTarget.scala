package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the object modified by the event.
  */
@js.native
trait SchemaTarget extends js.Object {
  /**
    * The ID of the target. For example, in Google Drive, this is the file or
    * folder ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The MIME type of the target.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The name of the target. For example, in Google Drive, this is the title
    * of the file.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaTarget {
  @scala.inline
  def apply(id: String = null, mimeType: String = null, name: String = null): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTarget]
  }
}

