package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationContextMenu extends js.Object {
  /** Enables/disables the delete menu in the annotation context menu.
    */
  var isDeleteEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the annotation context menu.
    */
  var isEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the popup menu in the annotation context menu.
    */
  var isPopupEnable: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the properties menu in the annotation context menu.
    */
  var isPropertiesEnable: js.UndefOr[Boolean] = js.undefined
}

object AnnotationContextMenu {
  @scala.inline
  def apply(
    isDeleteEnable: js.UndefOr[Boolean] = js.undefined,
    isEnable: js.UndefOr[Boolean] = js.undefined,
    isPopupEnable: js.UndefOr[Boolean] = js.undefined,
    isPropertiesEnable: js.UndefOr[Boolean] = js.undefined
  ): AnnotationContextMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleteEnable)) __obj.updateDynamic("isDeleteEnable")(isDeleteEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnable)) __obj.updateDynamic("isEnable")(isEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPopupEnable)) __obj.updateDynamic("isPopupEnable")(isPopupEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPropertiesEnable)) __obj.updateDynamic("isPropertiesEnable")(isPropertiesEnable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationContextMenu]
  }
}

