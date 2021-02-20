package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilationCacheProducedEvent extends StObject {
  
  /**
    * Base64-encoded data
    */
  var data: String = js.native
  
  var url: String = js.native
}
object CompilationCacheProducedEvent {
  
  @scala.inline
  def apply(data: String, url: String): CompilationCacheProducedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationCacheProducedEvent]
  }
  
  @scala.inline
  implicit class CompilationCacheProducedEventMutableBuilder[Self <: CompilationCacheProducedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
