package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GESun extends StObject {
  
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  def getVisibility(): Boolean
  
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  def setVisibility(visibility: Boolean): Unit
}
object GESun {
  
  inline def apply(getVisibility: () => Boolean, setVisibility: Boolean => Unit): GESun = {
    val __obj = js.Dynamic.literal(getVisibility = js.Any.fromFunction0(getVisibility), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[GESun]
  }
  
  extension [Self <: GESun](x: Self) {
    
    inline def setGetVisibility(value: () => Boolean): Self = StObject.set(x, "getVisibility", js.Any.fromFunction0(value))
    
    inline def setSetVisibility(value: Boolean => Unit): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
  }
}
