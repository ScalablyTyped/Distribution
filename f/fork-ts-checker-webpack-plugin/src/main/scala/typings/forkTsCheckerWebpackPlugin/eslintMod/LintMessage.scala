package typings.forkTsCheckerWebpackPlugin.eslintMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintMessage
  extends /* key */ StringDictionary[js.Any] {
  
  var column: Double = js.native
  
  var endColumn: js.UndefOr[Double] = js.native
  
  var endLine: js.UndefOr[Double] = js.native
  
  var line: Double = js.native
  
  var message: String = js.native
  
  var ruleId: String | Null = js.native
  
  var severity: Double = js.native
}
object LintMessage {
  
  @scala.inline
  def apply(column: Double, line: Double, message: String, severity: Double): LintMessage = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintMessage]
  }
  
  @scala.inline
  implicit class LintMessageOps[Self <: LintMessage] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: Double): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdNull: Self = this.set("ruleId", null)
  }
}
