package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/Token", "Token")
  @js.native
  class Token protected () extends StObject {
    def this(tokenArgs: TokenArgs) = this()
    
    val endCursor: Double = js.native
    
    val startCursor: Double = js.native
    
    val token: String = js.native
  }
  /* static members */
  object Token {
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token.isTokenCarriageReturn")
    @js.native
    def isTokenCarriageReturn(token: Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token.isTokenComment")
    @js.native
    def isTokenComment(token: Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token.isTokenDelimiter")
    @js.native
    def isTokenDelimiter(token: Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token.isTokenEscapeCharacter")
    @js.native
    def isTokenEscapeCharacter(token: Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token.isTokenQuote")
    @js.native
    def isTokenQuote(token: Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Token", "Token.isTokenRowDelimiter")
    @js.native
    def isTokenRowDelimiter(token: Token): Boolean = js.native
  }
  
  type MaybeToken = Token | Null
  
  @js.native
  trait TokenArgs extends StObject {
    
    var endCursor: Double = js.native
    
    var startCursor: Double = js.native
    
    var token: String = js.native
  }
  object TokenArgs {
    
    @scala.inline
    def apply(endCursor: Double, startCursor: Double, token: String): TokenArgs = {
      val __obj = js.Dynamic.literal(endCursor = endCursor.asInstanceOf[js.Any], startCursor = startCursor.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenArgs]
    }
    
    @scala.inline
    implicit class TokenArgsMutableBuilder[Self <: TokenArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndCursor(value: Double): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCursor(value: Double): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
