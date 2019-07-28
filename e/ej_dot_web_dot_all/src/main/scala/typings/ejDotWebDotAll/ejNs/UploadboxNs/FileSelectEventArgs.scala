package typings.ejDotWebDotAll.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSelectEventArgs extends js.Object {
  /** returns Selected FileList objects
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object FileSelectEventArgs {
  @scala.inline
  def apply(files: js.Any = null, model: js.Any = null, `type`: String = null): FileSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileSelectEventArgs]
  }
}

