package typings.ecmarkup

import typings.ecmarkup.libBiblioMod.Type
import typings.std.Error
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypeParserMod {
  
  @JSImport("ecmarkup/lib/type-parser", "ParseError")
  @js.native
  open class ParseError protected ()
    extends StObject
       with Error {
    def this(message: String, offset: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var offset: Double = js.native
  }
  
  @JSImport("ecmarkup/lib/type-parser", "TypeParser")
  @js.native
  open class TypeParser protected () extends StObject {
    def this(input: String) = this()
    
    var allowParensInOpaque: Boolean = js.native
    
    def eat(regexp: js.RegExp): RegExpMatchArray | Null = js.native
    
    def eatUntil(regexp: js.RegExp): String = js.native
    
    def eatWs(): Unit = js.native
    
    def expect(regexp: js.RegExp): RegExpMatchArray = js.native
    
    var input: String = js.native
    
    var offset: Double = js.native
    
    def parse(): Type = js.native
    
    /* private */ var parseType: Any = js.native
    
    /* private */ var parseTypePossiblyWithUnmarkedUnion: Any = js.native
    
    var remainder: String = js.native
  }
  /* static members */
  object TypeParser {
    
    @JSImport("ecmarkup/lib/type-parser", "TypeParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(input: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Type]
  }
}
