package typings.evaluatex

import typings.evaluatex.mod.Constants
import typings.evaluatex.mod.Options
import typings.evaluatex.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLexerMod {
  
  inline def apply(expression: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply(expression.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def apply(expression: String, constants: Unit, options: Options): js.Array[Token] = (^.asInstanceOf[js.Dynamic].apply(expression.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  inline def apply(expression: String, constants: Constants): js.Array[Token] = (^.asInstanceOf[js.Dynamic].apply(expression.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  inline def apply(expression: String, constants: Constants, options: Options): js.Array[Token] = (^.asInstanceOf[js.Dynamic].apply(expression.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  @JSImport("evaluatex/dist/lexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
