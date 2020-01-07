package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an upload session reference. This reference is created via
  * upload method. Updating of item content may refer to this uploaded content
  * via contentDataRef.
  */
@js.native
trait Schema$UploadItemRef extends js.Object {
  /**
    * Name of the content reference. The maximum length is 2048 characters.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$UploadItemRef {
  @scala.inline
  def apply(name: String = null): Schema$UploadItemRef = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UploadItemRef]
  }
}

