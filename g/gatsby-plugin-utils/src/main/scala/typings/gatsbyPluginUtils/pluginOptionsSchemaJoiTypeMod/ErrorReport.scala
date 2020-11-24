package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorReport extends Error {
  
  var code: String = js.native
  
  var flags: Record[String, ExtensionFlag] = js.native
  
  var messages: LanguageMessages = js.native
  
  var path: js.Array[String] = js.native
  
  var prefs: ErrorValidationOptions = js.native
  
  var state: State = js.native
  
  var value: js.Any = js.native
}
object ErrorReport {
  
  @scala.inline
  def apply(
    code: String,
    flags: Record[String, ExtensionFlag],
    message: String,
    messages: LanguageMessages,
    name: String,
    path: js.Array[String],
    prefs: ErrorValidationOptions,
    state: State,
    value: js.Any
  ): ErrorReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefs = prefs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReport]
  }
  
  @scala.inline
  implicit class ErrorReportOps[Self <: ErrorReport] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Record[String, ExtensionFlag]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: LanguageMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefs(value: ErrorValidationOptions): Self = this.set("prefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
