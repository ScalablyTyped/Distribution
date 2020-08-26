package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationContextMenu extends js.Object {
  /** Enables/disables the delete menu in the annotation context menu.
    */
  var isDeleteEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the annotation context menu.
    */
  var isEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the popup menu in the annotation context menu.
    */
  var isPopupEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the properties menu in the annotation context menu.
    */
  var isPropertiesEnable: js.UndefOr[Boolean] = js.native
}

object AnnotationContextMenu {
  @scala.inline
  def apply(): AnnotationContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationContextMenu]
  }
  @scala.inline
  implicit class AnnotationContextMenuOps[Self <: AnnotationContextMenu] (val x: Self) extends AnyVal {
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
    def setIsDeleteEnable(value: Boolean): Self = this.set("isDeleteEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeleteEnable: Self = this.set("isDeleteEnable", js.undefined)
    @scala.inline
    def setIsEnable(value: Boolean): Self = this.set("isEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnable: Self = this.set("isEnable", js.undefined)
    @scala.inline
    def setIsPopupEnable(value: Boolean): Self = this.set("isPopupEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPopupEnable: Self = this.set("isPopupEnable", js.undefined)
    @scala.inline
    def setIsPropertiesEnable(value: Boolean): Self = this.set("isPropertiesEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPropertiesEnable: Self = this.set("isPropertiesEnable", js.undefined)
  }
  
}

