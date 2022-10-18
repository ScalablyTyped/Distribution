package typings.gherkin

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ILocation
import typings.gherkin.distSrcParserMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenMod {
  
  @JSImport("gherkin/dist/src/Token", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Token {
    def this(line: typings.gherkin.distSrcGherkinLineMod.default, location: ILocation) = this()
    
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /* CompleteClass */
    override def getTokenValue(): String = js.native
    
    /* CompleteClass */
    var isEof: Boolean = js.native
    
    /* CompleteClass */
    override val line: typings.gherkin.distSrcGherkinLineMod.default = js.native
    
    /* CompleteClass */
    override val location: ILocation = js.native
    
    /* CompleteClass */
    var matchedGherkinDialect: String = js.native
    
    /* CompleteClass */
    var matchedIndent: Double = js.native
    
    /* CompleteClass */
    var matchedItems: js.Array[typings.gherkin.distSrcGherkinLineMod.default] = js.native
    
    /* CompleteClass */
    var matchedKeyword: String = js.native
    
    /* CompleteClass */
    var matchedType: TokenType = js.native
  }
  
  trait Token extends StObject {
    
    def detach(): Unit
    
    def getTokenValue(): String
    
    var isEof: Boolean
    
    val line: typings.gherkin.distSrcGherkinLineMod.default
    
    val location: ILocation
    
    var matchedGherkinDialect: String
    
    var matchedIndent: Double
    
    var matchedItems: js.Array[typings.gherkin.distSrcGherkinLineMod.default]
    
    var matchedKeyword: String
    
    var matchedText: js.UndefOr[String] = js.undefined
    
    var matchedType: TokenType
  }
  object Token {
    
    inline def apply(
      detach: () => Unit,
      getTokenValue: () => String,
      isEof: Boolean,
      line: typings.gherkin.distSrcGherkinLineMod.default,
      location: ILocation,
      matchedGherkinDialect: String,
      matchedIndent: Double,
      matchedItems: js.Array[typings.gherkin.distSrcGherkinLineMod.default],
      matchedKeyword: String,
      matchedType: TokenType
    ): Token = {
      val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getTokenValue = js.Any.fromFunction0(getTokenValue), isEof = isEof.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchedGherkinDialect = matchedGherkinDialect.asInstanceOf[js.Any], matchedIndent = matchedIndent.asInstanceOf[js.Any], matchedItems = matchedItems.asInstanceOf[js.Any], matchedKeyword = matchedKeyword.asInstanceOf[js.Any], matchedType = matchedType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      inline def setGetTokenValue(value: () => String): Self = StObject.set(x, "getTokenValue", js.Any.fromFunction0(value))
      
      inline def setIsEof(value: Boolean): Self = StObject.set(x, "isEof", value.asInstanceOf[js.Any])
      
      inline def setLine(value: typings.gherkin.distSrcGherkinLineMod.default): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatchedGherkinDialect(value: String): Self = StObject.set(x, "matchedGherkinDialect", value.asInstanceOf[js.Any])
      
      inline def setMatchedIndent(value: Double): Self = StObject.set(x, "matchedIndent", value.asInstanceOf[js.Any])
      
      inline def setMatchedItems(value: js.Array[typings.gherkin.distSrcGherkinLineMod.default]): Self = StObject.set(x, "matchedItems", value.asInstanceOf[js.Any])
      
      inline def setMatchedItemsVarargs(value: typings.gherkin.distSrcGherkinLineMod.default*): Self = StObject.set(x, "matchedItems", js.Array(value*))
      
      inline def setMatchedKeyword(value: String): Self = StObject.set(x, "matchedKeyword", value.asInstanceOf[js.Any])
      
      inline def setMatchedText(value: String): Self = StObject.set(x, "matchedText", value.asInstanceOf[js.Any])
      
      inline def setMatchedTextUndefined: Self = StObject.set(x, "matchedText", js.undefined)
      
      inline def setMatchedType(value: TokenType): Self = StObject.set(x, "matchedType", value.asInstanceOf[js.Any])
    }
  }
}
