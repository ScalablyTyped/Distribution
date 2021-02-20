package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalType extends Type_ {
  
  var expression: Type_ = js.native
  
  var `type`: typings.doctrine.doctrineStrings.OptionalType = js.native
}
object OptionalType {
  
  @scala.inline
  def apply(expression: Type_, `type`: typings.doctrine.doctrineStrings.OptionalType): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalType]
  }
  
  @scala.inline
  implicit class OptionalTypeMutableBuilder[Self <: OptionalType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.OptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
