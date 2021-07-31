package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.StringLiteral
  - typings.esquery.mod.NumericLiteral
*/
trait Literal extends StObject
object Literal {
  
  @scala.inline
  def NumericLiteral(value: Double): typings.esquery.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typings.esquery.mod.NumericLiteral]
  }
  
  @scala.inline
  def StringLiteral(value: String): typings.esquery.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typings.esquery.mod.StringLiteral]
  }
}
