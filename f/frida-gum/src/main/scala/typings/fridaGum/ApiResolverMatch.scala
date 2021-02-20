package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiResolverMatch extends StObject {
  
  /**
    * Memory address that the given function is loaded at.
    */
  var address: NativePointer = js.native
  
  /**
    * Canonical name of the function that was found.
    */
  var name: String = js.native
}
object ApiResolverMatch {
  
  @scala.inline
  def apply(address: NativePointer, name: String): ApiResolverMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResolverMatch]
  }
  
  @scala.inline
  implicit class ApiResolverMatchMutableBuilder[Self <: ApiResolverMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
