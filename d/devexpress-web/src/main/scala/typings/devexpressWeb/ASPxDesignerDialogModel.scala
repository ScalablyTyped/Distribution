package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerDialogModel extends js.Object {
  var popupButtons: js.Array[_]
  def getUrl(): String
  def onShow(tab: ASPxDesignerNavigateTab): Unit
  def setUrl(url: String): Unit
}

object ASPxDesignerDialogModel {
  @scala.inline
  def apply(
    getUrl: () => String,
    onShow: ASPxDesignerNavigateTab => Unit,
    popupButtons: js.Array[_],
    setUrl: String => Unit
  ): ASPxDesignerDialogModel = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction0(getUrl), onShow = js.Any.fromFunction1(onShow), popupButtons = popupButtons.asInstanceOf[js.Any], setUrl = js.Any.fromFunction1(setUrl))
    __obj.asInstanceOf[ASPxDesignerDialogModel]
  }
}

