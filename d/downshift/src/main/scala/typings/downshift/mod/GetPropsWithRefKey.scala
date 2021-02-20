package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPropsWithRefKey extends StObject {
  
  var refKey: js.UndefOr[String] = js.native
}
object GetPropsWithRefKey {
  
  @scala.inline
  def apply(): GetPropsWithRefKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropsWithRefKey]
  }
  
  @scala.inline
  implicit class GetPropsWithRefKeyMutableBuilder[Self <: GetPropsWithRefKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
  }
}
