package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePropertiesChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current color of the signature.
    */
  var currentColor: js.UndefOr[String] = js.native
  /** Returns the current opacity of the signature.
    */
  var currentOpacity: js.UndefOr[Double] = js.native
  /** Specifies that the color of the signature is changed.
    */
  var isColorChange: js.UndefOr[Boolean] = js.native
  /** Specifies that the opacity of the signature is changed.
    */
  var isOpacityChange: js.UndefOr[Boolean] = js.native
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the page number in which the signature properties is changed.
    */
  var pageID: js.UndefOr[Double] = js.native
  /** Returns the previous color of the signature.
    */
  var previousColor: js.UndefOr[String] = js.native
  /** Returns the previous opacity of the signature.
    */
  var previousOpacity: js.UndefOr[Double] = js.native
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object SignaturePropertiesChangeEventArgs {
  @scala.inline
  def apply(): SignaturePropertiesChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaturePropertiesChangeEventArgs]
  }
  @scala.inline
  implicit class SignaturePropertiesChangeEventArgsOps[Self <: SignaturePropertiesChangeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCurrentColor(value: String): Self = this.set("currentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentColor: Self = this.set("currentColor", js.undefined)
    @scala.inline
    def setCurrentOpacity(value: Double): Self = this.set("currentOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentOpacity: Self = this.set("currentOpacity", js.undefined)
    @scala.inline
    def setIsColorChange(value: Boolean): Self = this.set("isColorChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsColorChange: Self = this.set("isColorChange", js.undefined)
    @scala.inline
    def setIsOpacityChange(value: Boolean): Self = this.set("isOpacityChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpacityChange: Self = this.set("isOpacityChange", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPageID(value: Double): Self = this.set("pageID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageID: Self = this.set("pageID", js.undefined)
    @scala.inline
    def setPreviousColor(value: String): Self = this.set("previousColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousColor: Self = this.set("previousColor", js.undefined)
    @scala.inline
    def setPreviousOpacity(value: Double): Self = this.set("previousOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousOpacity: Self = this.set("previousOpacity", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

