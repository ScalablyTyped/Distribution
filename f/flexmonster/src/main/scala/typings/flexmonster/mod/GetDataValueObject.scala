package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataValueObject extends StObject {
  
  var data: js.Array[js.Object] = js.native
  
  var meta: js.Object = js.native
}
object GetDataValueObject {
  
  @scala.inline
  def apply(data: js.Array[js.Object], meta: js.Object): GetDataValueObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataValueObject]
  }
  
  @scala.inline
  implicit class GetDataValueObjectMutableBuilder[Self <: GetDataValueObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
