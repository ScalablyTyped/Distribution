package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expand extends StObject {
  
  var expand: js.UndefOr[String | js.Array[String]] = js.native
  
  var select: js.UndefOr[String | js.Array[String]] = js.native
}
object Expand {
  
  @scala.inline
  def apply(): Expand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand]
  }
  
  @scala.inline
  implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: String | js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: String | js.Array[String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value :_*))
  }
}
