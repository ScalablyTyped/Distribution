package typings.esquery.mod

import typings.esquery.esqueryStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericLiteral
  extends LiteralAtom
     with Literal {
  
  @JSName("value")
  var value_NumericLiteral: Double = js.native
}
object NumericLiteral {
  
  @scala.inline
  def apply(`type`: literal, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
  
  @scala.inline
  implicit class NumericLiteralMutableBuilder[Self <: NumericLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
