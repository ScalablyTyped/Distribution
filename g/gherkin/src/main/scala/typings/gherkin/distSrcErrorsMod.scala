package typings.gherkin

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ILocation
import typings.gherkin.distSrcTokenMod.default
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("gherkin/dist/src/Errors", "AstBuilderException")
  @js.native
  open class AstBuilderException ()
    extends StObject
       with GherkinException {
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var location: ILocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object AstBuilderException {
    
    @JSImport("gherkin/dist/src/Errors", "AstBuilderException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(message: String, location: ILocation): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("gherkin/dist/src/Errors", "CompositeParserException")
  @js.native
  open class CompositeParserException ()
    extends StObject
       with GherkinException {
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var location: ILocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object CompositeParserException {
    
    @JSImport("gherkin/dist/src/Errors", "CompositeParserException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(errors: js.Array[js.Error]): CompositeParserException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(errors.asInstanceOf[js.Any]).asInstanceOf[CompositeParserException]
  }
  
  @JSImport("gherkin/dist/src/Errors", "NoSuchLanguageException")
  @js.native
  open class NoSuchLanguageException ()
    extends StObject
       with GherkinException {
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var location: ILocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object NoSuchLanguageException {
    
    @JSImport("gherkin/dist/src/Errors", "NoSuchLanguageException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(language: String, location: ILocation): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("gherkin/dist/src/Errors", "ParserException")
  @js.native
  open class ParserException ()
    extends StObject
       with GherkinException {
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var location: ILocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("gherkin/dist/src/Errors", "UnexpectedEOFException")
  @js.native
  open class UnexpectedEOFException ()
    extends StObject
       with GherkinException {
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var location: ILocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object UnexpectedEOFException {
    
    @JSImport("gherkin/dist/src/Errors", "UnexpectedEOFException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(token: default, expectedTokenTypes: js.Array[String], stateComment: String): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any], expectedTokenTypes.asInstanceOf[js.Any], stateComment.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("gherkin/dist/src/Errors", "UnexpectedTokenException")
  @js.native
  open class UnexpectedTokenException ()
    extends StObject
       with GherkinException {
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var location: ILocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object UnexpectedTokenException {
    
    @JSImport("gherkin/dist/src/Errors", "UnexpectedTokenException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(token: default, expectedTokenTypes: js.Array[String], stateComment: String): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any], expectedTokenTypes.asInstanceOf[js.Any], stateComment.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  trait GherkinException
    extends StObject
       with Error {
    
    var errors: js.Array[js.Error]
    
    var location: ILocation
  }
  object GherkinException {
    
    inline def apply(errors: js.Array[js.Error], location: ILocation, message: String, name: String): GherkinException = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GherkinException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GherkinException] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
