package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogText extends js.Object {
  /** Sets the uploaded fileâ€™s Name (header text) to the Dialog popup.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the upload file Size (header text) to the dialog popup.
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the upload file Status (header text) to the dialog popup.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the title text of the dialog popup.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DialogText {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    size: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null
  ): DialogText = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DialogText]
  }
}

