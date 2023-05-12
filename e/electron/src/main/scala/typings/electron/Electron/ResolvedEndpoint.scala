package typings.electron.Electron

import typings.electron.electronStrings.ipv4
import typings.electron.electronStrings.ipv6
import typings.electron.electronStrings.unspec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedEndpoint extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/resolved-endpoint
  var address: String
  
  /**
    * One of the following:
    */
  var family: ipv4 | ipv6 | unspec
}
object ResolvedEndpoint {
  
  inline def apply(address: String, family: ipv4 | ipv6 | unspec): ResolvedEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedEndpoint] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: ipv4 | ipv6 | unspec): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
  }
}
