package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapType
  extends StObject
     with MVCObject
     with MapType {
  
  /**
    * Returns the opacity level (<code>0</code> (transparent) to
    * <code>1.0</code>) of the <code>ImageMapType</code> tiles.
    */
  def getOpacity(): Double = js.native
  
  /**
    * Sets the opacity level (<code>0</code> (transparent) to <code>1.0</code>)
    * of the <code>ImageMapType</code> tiles.
    * @param opacity The new opacity.
    */
  def setOpacity(opacity: Double): Unit = js.native
}
