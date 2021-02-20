package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPProtocol extends StObject {
  
  var IPProtocol: js.UndefOr[String] = js.native
  
  var ports: js.UndefOr[js.Array[String]] = js.native
}
object IPProtocol {
  
  @scala.inline
  def apply(): IPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPProtocol]
  }
  
  @scala.inline
  implicit class IPProtocolMutableBuilder[Self <: IPProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPProtocol(value: String): Self = StObject.set(x, "IPProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPProtocolUndefined: Self = StObject.set(x, "IPProtocol", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
