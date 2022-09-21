package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Backtrace returned by `Java.backtrace()`.
  */
trait Backtrace extends StObject {
  
  /**
    * Stack frames.
    */
  var frames: js.Array[Frame]
  
  /**
    * ID that can be used for deduplicating identical backtraces.
    */
  var id: String
}
object Backtrace {
  
  inline def apply(frames: js.Array[Frame], id: String): Backtrace = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backtrace]
  }
  
  extension [Self <: Backtrace](x: Self) {
    
    inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
