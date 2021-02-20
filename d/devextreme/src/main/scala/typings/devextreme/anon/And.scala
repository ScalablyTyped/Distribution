package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends StObject {
  
  var and: js.UndefOr[String] = js.native
  
  var notAnd: js.UndefOr[String] = js.native
  
  var notOr: js.UndefOr[String] = js.native
  
  var or: js.UndefOr[String] = js.native
}
object And {
  
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndMutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: String): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    @scala.inline
    def setNotAnd(value: String): Self = StObject.set(x, "notAnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAndUndefined: Self = StObject.set(x, "notAnd", js.undefined)
    
    @scala.inline
    def setNotOr(value: String): Self = StObject.set(x, "notOr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotOrUndefined: Self = StObject.set(x, "notOr", js.undefined)
    
    @scala.inline
    def setOr(value: String): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
  }
}
