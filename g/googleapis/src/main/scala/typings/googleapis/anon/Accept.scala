package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accept extends StObject {
  
  var accept: js.UndefOr[js.Array[String]] = js.native
  
  var maxSize: js.UndefOr[String] = js.native
  
  var protocols: js.UndefOr[Resumable] = js.native
}
object Accept {
  
  @scala.inline
  def apply(): Accept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accept]
  }
  
  @scala.inline
  implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
    
    @scala.inline
    def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setProtocols(value: Resumable): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
  }
}
