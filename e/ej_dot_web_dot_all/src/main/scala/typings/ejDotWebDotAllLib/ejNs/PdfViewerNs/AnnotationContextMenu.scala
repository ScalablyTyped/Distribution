package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationContextMenu extends js.Object {
  /** Enables/disables the delete menu in the annotation context menu.
    */
  var isDeleteEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the annotation context menu.
    */
  var isEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the popup menu in the annotation context menu.
    */
  var isPopupEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the properties menu in the annotation context menu.
    */
  var isPropertiesEnable: js.UndefOr[scala.Boolean] = js.undefined
}

object AnnotationContextMenu {
  @scala.inline
  def apply(
    isDeleteEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isPopupEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isPropertiesEnable: js.UndefOr[scala.Boolean] = js.undefined
  ): AnnotationContextMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleteEnable)) __obj.updateDynamic("isDeleteEnable")(isDeleteEnable)
    if (!js.isUndefined(isEnable)) __obj.updateDynamic("isEnable")(isEnable)
    if (!js.isUndefined(isPopupEnable)) __obj.updateDynamic("isPopupEnable")(isPopupEnable)
    if (!js.isUndefined(isPropertiesEnable)) __obj.updateDynamic("isPropertiesEnable")(isPropertiesEnable)
    __obj.asInstanceOf[AnnotationContextMenu]
  }
}

