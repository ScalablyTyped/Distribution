package typings.dingtalkRobotSender.anon

import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.`0`
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BtnOrientation extends js.Object {
  
  var btnOrientation: `0` | `1` = js.native
  
  var btns: js.UndefOr[js.Array[ActionURL]] = js.native
  
  var hideAvatar: `0` | `1` = js.native
  
  var singleTitle: js.UndefOr[String] = js.native
  
  var singleURL: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var title: String = js.native
}
object BtnOrientation {
  
  @scala.inline
  def apply(btnOrientation: `0` | `1`, hideAvatar: `0` | `1`, text: String, title: String): BtnOrientation = {
    val __obj = js.Dynamic.literal(btnOrientation = btnOrientation.asInstanceOf[js.Any], hideAvatar = hideAvatar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BtnOrientation]
  }
  
  @scala.inline
  implicit class BtnOrientationOps[Self <: BtnOrientation] (val x: Self) extends AnyVal {
    
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
    def setBtnOrientation(value: `0` | `1`): Self = this.set("btnOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAvatar(value: `0` | `1`): Self = this.set("hideAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnsVarargs(value: ActionURL*): Self = this.set("btns", js.Array(value :_*))
    
    @scala.inline
    def setBtns(value: js.Array[ActionURL]): Self = this.set("btns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtns: Self = this.set("btns", js.undefined)
    
    @scala.inline
    def setSingleTitle(value: String): Self = this.set("singleTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleTitle: Self = this.set("singleTitle", js.undefined)
    
    @scala.inline
    def setSingleURL(value: String): Self = this.set("singleURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleURL: Self = this.set("singleURL", js.undefined)
  }
}
