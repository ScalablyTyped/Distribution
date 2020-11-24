package typings.gherkin.astNodeMod

import typings.gherkin.parserMod.RuleType
import typings.gherkin.parserMod.TokenType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstNode extends js.Object {
  
  def add(`type`: js.Any, obj: js.Any): Unit = js.native
  
  def getItems(ruleType: RuleType): js.Array[_] = js.native
  
  def getSingle(ruleType: RuleType): js.Any = js.native
  
  def getToken(tokenType: TokenType): js.Any = js.native
  
  def getTokens(tokenType: TokenType): js.Array[typings.gherkin.tokenMod.default] = js.native
  
  val ruleType: RuleType = js.native
  
  val subItems: js.Any = js.native
}
object AstNode {
  
  @scala.inline
  def apply(
    add: (js.Any, js.Any) => Unit,
    getItems: RuleType => js.Array[_],
    getSingle: RuleType => js.Any,
    getToken: TokenType => js.Any,
    getTokens: TokenType => js.Array[typings.gherkin.tokenMod.default],
    ruleType: RuleType,
    subItems: js.Any
  ): AstNode = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getItems = js.Any.fromFunction1(getItems), getSingle = js.Any.fromFunction1(getSingle), getToken = js.Any.fromFunction1(getToken), getTokens = js.Any.fromFunction1(getTokens), ruleType = ruleType.asInstanceOf[js.Any], subItems = subItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  
  @scala.inline
  implicit class AstNodeOps[Self <: AstNode] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (js.Any, js.Any) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItems(value: RuleType => js.Array[_]): Self = this.set("getItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSingle(value: RuleType => js.Any): Self = this.set("getSingle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetToken(value: TokenType => js.Any): Self = this.set("getToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTokens(value: TokenType => js.Array[typings.gherkin.tokenMod.default]): Self = this.set("getTokens", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRuleType(value: RuleType): Self = this.set("ruleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubItems(value: js.Any): Self = this.set("subItems", value.asInstanceOf[js.Any])
  }
}
