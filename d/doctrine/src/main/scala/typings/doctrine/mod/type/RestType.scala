package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestType extends Type_ {
  
  var expression: js.UndefOr[Type_] = js.native
  
  var `type`: typings.doctrine.doctrineStrings.RestType = js.native
}
object RestType {
  
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.RestType): RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestType]
  }
  
  @scala.inline
  implicit class RestTypeMutableBuilder[Self <: RestType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.RestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
