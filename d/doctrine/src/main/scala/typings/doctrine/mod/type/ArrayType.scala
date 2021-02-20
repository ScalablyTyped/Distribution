package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayType extends Type_ {
  
  var elements: js.Array[Type_] = js.native
  
  var `type`: typings.doctrine.doctrineStrings.ArrayType = js.native
}
object ArrayType {
  
  @scala.inline
  def apply(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.ArrayType): ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
  
  @scala.inline
  implicit class ArrayTypeMutableBuilder[Self <: ArrayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Type_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: Type_ *): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.ArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
