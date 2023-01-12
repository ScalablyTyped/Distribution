package typings.gherkin

import typings.gherkin.distSrcParserMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenFormatterBuilderMod {
  
  @JSImport("gherkin/dist/src/TokenFormatterBuilder", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TokenFormatterBuilder {
    
    /* CompleteClass */
    override def build(token: typings.gherkin.distSrcTokenMod.default): Unit = js.native
    
    /* CompleteClass */
    override def endRule(ruleType: RuleType): Unit = js.native
    
    /* CompleteClass */
    override def formatToken(token: typings.gherkin.distSrcTokenMod.default): String = js.native
    
    /* CompleteClass */
    override def getResult(): String = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def startRule(ruleType: RuleType): Unit = js.native
    
    /* private */ /* CompleteClass */
    var tokensText: Any = js.native
  }
  
  trait TokenFormatterBuilder extends StObject {
    
    def build(token: typings.gherkin.distSrcTokenMod.default): Unit
    
    def endRule(ruleType: RuleType): Unit
    
    def formatToken(token: typings.gherkin.distSrcTokenMod.default): String
    
    def getResult(): String
    
    def reset(): Unit
    
    def startRule(ruleType: RuleType): Unit
    
    /* private */ var tokensText: Any
  }
  object TokenFormatterBuilder {
    
    inline def apply(
      build: typings.gherkin.distSrcTokenMod.default => Unit,
      endRule: RuleType => Unit,
      formatToken: typings.gherkin.distSrcTokenMod.default => String,
      getResult: () => String,
      reset: () => Unit,
      startRule: RuleType => Unit,
      tokensText: Any
    ): TokenFormatterBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), endRule = js.Any.fromFunction1(endRule), formatToken = js.Any.fromFunction1(formatToken), getResult = js.Any.fromFunction0(getResult), reset = js.Any.fromFunction0(reset), startRule = js.Any.fromFunction1(startRule), tokensText = tokensText.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenFormatterBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenFormatterBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: typings.gherkin.distSrcTokenMod.default => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
      
      inline def setEndRule(value: RuleType => Unit): Self = StObject.set(x, "endRule", js.Any.fromFunction1(value))
      
      inline def setFormatToken(value: typings.gherkin.distSrcTokenMod.default => String): Self = StObject.set(x, "formatToken", js.Any.fromFunction1(value))
      
      inline def setGetResult(value: () => String): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStartRule(value: RuleType => Unit): Self = StObject.set(x, "startRule", js.Any.fromFunction1(value))
      
      inline def setTokensText(value: Any): Self = StObject.set(x, "tokensText", value.asInstanceOf[js.Any])
    }
  }
}
