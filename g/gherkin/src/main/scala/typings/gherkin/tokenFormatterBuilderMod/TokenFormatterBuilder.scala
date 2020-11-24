package typings.gherkin.tokenFormatterBuilderMod

import typings.gherkin.parserMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenFormatterBuilder extends js.Object {
  
  def build(token: typings.gherkin.tokenMod.default): Unit = js.native
  
  def endRule(ruleType: RuleType): Unit = js.native
  
  def formatToken(token: typings.gherkin.tokenMod.default): String = js.native
  
  def getResult(): String = js.native
  
  def reset(): Unit = js.native
  
  def startRule(ruleType: RuleType): Unit = js.native
  
  var tokensText: js.Any = js.native
}
object TokenFormatterBuilder {
  
  @scala.inline
  def apply(
    build: typings.gherkin.tokenMod.default => Unit,
    endRule: RuleType => Unit,
    formatToken: typings.gherkin.tokenMod.default => String,
    getResult: () => String,
    reset: () => Unit,
    startRule: RuleType => Unit,
    tokensText: js.Any
  ): TokenFormatterBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), endRule = js.Any.fromFunction1(endRule), formatToken = js.Any.fromFunction1(formatToken), getResult = js.Any.fromFunction0(getResult), reset = js.Any.fromFunction0(reset), startRule = js.Any.fromFunction1(startRule), tokensText = tokensText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenFormatterBuilder]
  }
  
  @scala.inline
  implicit class TokenFormatterBuilderOps[Self <: TokenFormatterBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: typings.gherkin.tokenMod.default => Unit): Self = this.set("build", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndRule(value: RuleType => Unit): Self = this.set("endRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatToken(value: typings.gherkin.tokenMod.default => String): Self = this.set("formatToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetResult(value: () => String): Self = this.set("getResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartRule(value: RuleType => Unit): Self = this.set("startRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokensText(value: js.Any): Self = this.set("tokensText", value.asInstanceOf[js.Any])
  }
}
