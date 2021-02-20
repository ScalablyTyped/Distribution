package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLineString extends KmlExtrudableGeometry {
  
  /**
    * Returns the altitudeOffset, or 0 if not set.
    */
  def getAltitudeOffset(): Double = js.native
  
  /**
    * Two or more coordinate tuples, each consisting of floating point values for longitude, latitude, and altitude.
    * The altitude component is optional.
    */
  def getCoordinates(): KmlCoordArray = js.native
  
  /**
    * Added to the altitude values for all points on the line string.
    * Adjusts the altitude of the feature as a whole, without the need to update each coordinate set.
    */
  def setAltitudeOffset(altitudeOffset: Double): Unit = js.native
}
object KmlLineString {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getAltitudeOffset: () => Double,
    getCoordinates: () => KmlCoordArray,
    getExtrude: () => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getTessellate: () => Boolean,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setAltitudeOffset: Double => Unit,
    setExtrude: Boolean => Unit,
    setTessellate: Boolean => Unit
  ): KmlLineString = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getAltitudeOffset = js.Any.fromFunction0(getAltitudeOffset), getCoordinates = js.Any.fromFunction0(getCoordinates), getExtrude = js.Any.fromFunction0(getExtrude), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTessellate = js.Any.fromFunction0(getTessellate), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setAltitudeOffset = js.Any.fromFunction1(setAltitudeOffset), setExtrude = js.Any.fromFunction1(setExtrude), setTessellate = js.Any.fromFunction1(setTessellate))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLineString]
  }
  
  @scala.inline
  implicit class KmlLineStringMutableBuilder[Self <: KmlLineString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAltitudeOffset(value: () => Double): Self = StObject.set(x, "getAltitudeOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCoordinates(value: () => KmlCoordArray): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAltitudeOffset(value: Double => Unit): Self = StObject.set(x, "setAltitudeOffset", js.Any.fromFunction1(value))
  }
}
