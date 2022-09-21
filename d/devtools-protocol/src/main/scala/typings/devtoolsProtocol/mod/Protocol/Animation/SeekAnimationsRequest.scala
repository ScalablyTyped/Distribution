package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeekAnimationsRequest extends StObject {
  
  /**
    * List of animation ids to seek.
    */
  var animations: js.Array[String]
  
  /**
    * Set the current time of each animation.
    */
  var currentTime: Double
}
object SeekAnimationsRequest {
  
  inline def apply(animations: js.Array[String], currentTime: Double): SeekAnimationsRequest = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekAnimationsRequest]
  }
  
  extension [Self <: SeekAnimationsRequest](x: Self) {
    
    inline def setAnimations(value: js.Array[String]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsVarargs(value: String*): Self = StObject.set(x, "animations", js.Array(value*))
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
  }
}
