package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableType extends Type_ {
  
  var expression: Type_ = js.native
  
  var prefix: Boolean = js.native
  
  var `type`: typings.doctrine.doctrineStrings.NullableType = js.native
}
object NullableType {
  
  @scala.inline
  def apply(expression: Type_, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NullableType): NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableType]
  }
  
  @scala.inline
  implicit class NullableTypeMutableBuilder[Self <: NullableType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.NullableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
