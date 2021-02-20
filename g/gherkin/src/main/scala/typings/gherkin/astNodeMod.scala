package typings.gherkin

import typings.gherkin.parserMod.RuleType
import typings.gherkin.parserMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astNodeMod {
  
  @JSImport("gherkin/dist/src/AstNode", JSImport.Default)
  @js.native
  class default protected () extends AstNode {
    def this(ruleType: RuleType) = this()
  }
  
  @js.native
  trait AstNode extends StObject {
    
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
    implicit class AstNodeMutableBuilder[Self <: AstNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItems(value: RuleType => js.Array[_]): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSingle(value: RuleType => js.Any): Self = StObject.set(x, "getSingle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetToken(value: TokenType => js.Any): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTokens(value: TokenType => js.Array[typings.gherkin.tokenMod.default]): Self = StObject.set(x, "getTokens", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuleType(value: RuleType): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubItems(value: js.Any): Self = StObject.set(x, "subItems", value.asInstanceOf[js.Any])
    }
  }
}
