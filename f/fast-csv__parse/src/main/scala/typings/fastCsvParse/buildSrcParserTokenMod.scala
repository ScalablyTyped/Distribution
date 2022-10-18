package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserTokenMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/Token", "Token")
  @js.native
  open class Token protected () extends StObject {
    def this(tokenArgs: TokenArgs) = this()
    
    val endCursor: Double = js.native
    
    val startCursor: Double = js.native
    
    val token: String = js.native
  }
  /* static members */
  object Token {
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTokenCarriageReturn(token: Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenCarriageReturn")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenComment(token: Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenComment")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenDelimiter(token: Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenDelimiter")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenEscapeCharacter(token: Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenEscapeCharacter")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenQuote(token: Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenQuote")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenRowDelimiter(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenRowDelimiter")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  type MaybeToken = Token | Null
  
  trait TokenArgs extends StObject {
    
    var endCursor: Double
    
    var startCursor: Double
    
    var token: String
  }
  object TokenArgs {
    
    inline def apply(endCursor: Double, startCursor: Double, token: String): TokenArgs = {
      val __obj = js.Dynamic.literal(endCursor = endCursor.asInstanceOf[js.Any], startCursor = startCursor.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenArgs]
    }
    
    extension [Self <: TokenArgs](x: Self) {
      
      inline def setEndCursor(value: Double): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
      
      inline def setStartCursor(value: Double): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
