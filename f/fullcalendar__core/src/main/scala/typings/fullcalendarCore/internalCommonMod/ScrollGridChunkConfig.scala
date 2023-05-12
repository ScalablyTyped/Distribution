package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollGridChunkConfig
  extends StObject
     with ChunkConfig {
  
  var key: String
}
object ScrollGridChunkConfig {
  
  inline def apply(key: String): ScrollGridChunkConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollGridChunkConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollGridChunkConfig] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
