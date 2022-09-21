package typings.fullcalendarCommon.mod

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
  
  extension [Self <: ScrollGridChunkConfig](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
