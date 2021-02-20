package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cardinal extends StObject {
  
  var cardinal: js.Array[String] = js.native
  
  var ordinal: js.Array[String] = js.native
}
object Cardinal {
  
  @scala.inline
  def apply(cardinal: js.Array[String], ordinal: js.Array[String]): Cardinal = {
    val __obj = js.Dynamic.literal(cardinal = cardinal.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardinal]
  }
  
  @scala.inline
  implicit class CardinalMutableBuilder[Self <: Cardinal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardinal(value: js.Array[String]): Self = StObject.set(x, "cardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalVarargs(value: String*): Self = StObject.set(x, "cardinal", js.Array(value :_*))
    
    @scala.inline
    def setOrdinal(value: js.Array[String]): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinalVarargs(value: String*): Self = StObject.set(x, "ordinal", js.Array(value :_*))
  }
}
