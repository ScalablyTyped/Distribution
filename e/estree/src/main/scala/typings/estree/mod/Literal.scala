package typings.estree.mod

import typings.estree.anon.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.SimpleLiteral
  - typings.estree.mod.RegExpLiteral
  - typings.estree.mod.BigIntLiteral
*/
trait Literal extends StObject
object Literal {
  
  inline def BigIntLiteral(bigint: String): typings.estree.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.BigIntLiteral]
  }
  
  inline def RegExpLiteral(regex: Flags): typings.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.RegExpLiteral]
  }
  
  inline def SimpleLiteral(): typings.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.SimpleLiteral]
  }
}
