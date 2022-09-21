package typings.forgeViewer.anon

import typings.forgeViewer.THREE.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: Vector3
  
  var target: Vector3
}
object Position {
  
  inline def apply(position: Vector3, target: Vector3): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Vector3): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
