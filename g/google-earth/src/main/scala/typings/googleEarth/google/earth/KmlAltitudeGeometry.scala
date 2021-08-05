package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlAltitudeGeometry
  extends StObject
     with KmlObject {
  
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum
  
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit
}
object KmlAltitudeGeometry {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit
  ): KmlAltitudeGeometry = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlAltitudeGeometry]
  }
  
  extension [Self <: KmlAltitudeGeometry](x: Self) {
    
    inline def setGetAltitudeMode(value: () => KmlAltitudeModeEnum): Self = StObject.set(x, "getAltitudeMode", js.Any.fromFunction0(value))
    
    inline def setSetAltitudeMode(value: KmlAltitudeModeEnum => Unit): Self = StObject.set(x, "setAltitudeMode", js.Any.fromFunction1(value))
  }
}
