package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotation extends StObject {
  
  var rotation: js.UndefOr[Double] = js.undefined
}
object Rotation {
  
  inline def apply(): Rotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
