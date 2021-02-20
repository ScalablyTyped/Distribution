package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typings.gherkin.parserMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("gherkin/dist/src/Token", JSImport.Default)
  @js.native
  class default protected () extends Token {
    def this(line: typings.gherkin.gherkinLineMod.default, location: ILocation) = this()
  }
  
  @js.native
  trait Token extends StObject {
    
    def detach(): Unit = js.native
    
    def getTokenValue(): String = js.native
    
    var isEof: Boolean = js.native
    
    val line: typings.gherkin.gherkinLineMod.default = js.native
    
    val location: ILocation = js.native
    
    var matchedGherkinDialect: String = js.native
    
    var matchedIndent: Double = js.native
    
    var matchedItems: js.Array[typings.gherkin.gherkinLineMod.default] = js.native
    
    var matchedKeyword: String = js.native
    
    var matchedText: js.UndefOr[String] = js.native
    
    var matchedType: TokenType = js.native
  }
  object Token {
    
    @scala.inline
    def apply(
      detach: () => Unit,
      getTokenValue: () => String,
      isEof: Boolean,
      line: typings.gherkin.gherkinLineMod.default,
      location: ILocation,
      matchedGherkinDialect: String,
      matchedIndent: Double,
      matchedItems: js.Array[typings.gherkin.gherkinLineMod.default],
      matchedKeyword: String,
      matchedType: TokenType
    ): Token = {
      val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getTokenValue = js.Any.fromFunction0(getTokenValue), isEof = isEof.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchedGherkinDialect = matchedGherkinDialect.asInstanceOf[js.Any], matchedIndent = matchedIndent.asInstanceOf[js.Any], matchedItems = matchedItems.asInstanceOf[js.Any], matchedKeyword = matchedKeyword.asInstanceOf[js.Any], matchedType = matchedType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTokenValue(value: () => String): Self = StObject.set(x, "getTokenValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEof(value: Boolean): Self = StObject.set(x, "isEof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: typings.gherkin.gherkinLineMod.default): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedGherkinDialect(value: String): Self = StObject.set(x, "matchedGherkinDialect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedIndent(value: Double): Self = StObject.set(x, "matchedIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedItems(value: js.Array[typings.gherkin.gherkinLineMod.default]): Self = StObject.set(x, "matchedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedItemsVarargs(value: typings.gherkin.gherkinLineMod.default*): Self = StObject.set(x, "matchedItems", js.Array(value :_*))
      
      @scala.inline
      def setMatchedKeyword(value: String): Self = StObject.set(x, "matchedKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedText(value: String): Self = StObject.set(x, "matchedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedTextUndefined: Self = StObject.set(x, "matchedText", js.undefined)
      
      @scala.inline
      def setMatchedType(value: TokenType): Self = StObject.set(x, "matchedType", value.asInstanceOf[js.Any])
    }
  }
}
