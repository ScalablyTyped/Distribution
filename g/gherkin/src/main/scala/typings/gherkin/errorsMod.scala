package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typings.gherkin.tokenMod.default
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("gherkin/dist/src/Errors", "AstBuilderException")
  @js.native
  class AstBuilderException () extends GherkinException
  /* static members */
  object AstBuilderException {
    
    @JSImport("gherkin/dist/src/Errors", "AstBuilderException.create")
    @js.native
    def create(message: String, location: ILocation): GherkinException = js.native
  }
  
  @JSImport("gherkin/dist/src/Errors", "CompositeParserException")
  @js.native
  class CompositeParserException () extends GherkinException
  /* static members */
  object CompositeParserException {
    
    @JSImport("gherkin/dist/src/Errors", "CompositeParserException.create")
    @js.native
    def create(errors: js.Array[Error]): CompositeParserException = js.native
  }
  
  @JSImport("gherkin/dist/src/Errors", "NoSuchLanguageException")
  @js.native
  class NoSuchLanguageException () extends GherkinException
  /* static members */
  object NoSuchLanguageException {
    
    @JSImport("gherkin/dist/src/Errors", "NoSuchLanguageException.create")
    @js.native
    def create(language: String, location: ILocation): GherkinException = js.native
  }
  
  @JSImport("gherkin/dist/src/Errors", "ParserException")
  @js.native
  class ParserException () extends GherkinException
  
  @JSImport("gherkin/dist/src/Errors", "UnexpectedEOFException")
  @js.native
  class UnexpectedEOFException () extends GherkinException
  /* static members */
  object UnexpectedEOFException {
    
    @JSImport("gherkin/dist/src/Errors", "UnexpectedEOFException.create")
    @js.native
    def create(token: default, expectedTokenTypes: js.Array[String], stateComment: String): GherkinException = js.native
  }
  
  @JSImport("gherkin/dist/src/Errors", "UnexpectedTokenException")
  @js.native
  class UnexpectedTokenException () extends GherkinException
  /* static members */
  object UnexpectedTokenException {
    
    @JSImport("gherkin/dist/src/Errors", "UnexpectedTokenException.create")
    @js.native
    def create(token: default, expectedTokenTypes: js.Array[String], stateComment: String): GherkinException = js.native
  }
  
  @js.native
  trait GherkinException extends Error {
    
    var errors: js.Array[Error] = js.native
    
    var location: ILocation = js.native
  }
  object GherkinException {
    
    @scala.inline
    def apply(errors: js.Array[Error], location: ILocation, message: String, name: String): GherkinException = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GherkinException]
    }
    
    @scala.inline
    implicit class GherkinExceptionMutableBuilder[Self <: GherkinException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
