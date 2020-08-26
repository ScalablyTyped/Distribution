package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerDialogModel extends js.Object {
  var popupButtons: js.Array[_] = js.native
  def getUrl(): String = js.native
  def onShow(tab: ASPxDesignerNavigateTab): Unit = js.native
  def setUrl(url: String): Unit = js.native
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
  @scala.inline
  implicit class ASPxDesignerDialogModelOps[Self <: ASPxDesignerDialogModel] (val x: Self) extends AnyVal {
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
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setOnShow(value: ASPxDesignerNavigateTab => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def setPopupButtonsVarargs(value: js.Any*): Self = this.set("popupButtons", js.Array(value :_*))
    @scala.inline
    def setPopupButtons(value: js.Array[_]): Self = this.set("popupButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetUrl(value: String => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
  }
  
}

