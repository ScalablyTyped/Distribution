package typings.gettextParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTextTranslation extends js.Object {
  
  var comments: js.UndefOr[GetTextComment] = js.native
  
  var msgctxt: js.UndefOr[String] = js.native
  
  var msgid: String = js.native
  
  var msgid_plural: js.UndefOr[js.Any] = js.native
  
  var msgstr: js.Array[String] = js.native
}
object GetTextTranslation {
  
  @scala.inline
  def apply(msgid: String, msgstr: js.Array[String]): GetTextTranslation = {
    val __obj = js.Dynamic.literal(msgid = msgid.asInstanceOf[js.Any], msgstr = msgstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextTranslation]
  }
  
  @scala.inline
  implicit class GetTextTranslationOps[Self <: GetTextTranslation] (val x: Self) extends AnyVal {
    
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
    def setMsgid(value: String): Self = this.set("msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgstrVarargs(value: String*): Self = this.set("msgstr", js.Array(value :_*))
    
    @scala.inline
    def setMsgstr(value: js.Array[String]): Self = this.set("msgstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: GetTextComment): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setMsgctxt(value: String): Self = this.set("msgctxt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgctxt: Self = this.set("msgctxt", js.undefined)
    
    @scala.inline
    def setMsgid_plural(value: js.Any): Self = this.set("msgid_plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgid_plural: Self = this.set("msgid_plural", js.undefined)
  }
}
