package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlMultiGeometry
  extends StObject
     with KmlObject {
  
  /**
    * The collection of geometries that are children of this multi-geometry.
    */
  def getGeometries(): GEGeometryContainer
}
object KmlMultiGeometry {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getGeometries: () => GEGeometryContainer,
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
    release: () => Unit
  ): KmlMultiGeometry = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getGeometries = js.Any.fromFunction0(getGeometries), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlMultiGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlMultiGeometry] (val x: Self) extends AnyVal {
    
    inline def setGetGeometries(value: () => GEGeometryContainer): Self = StObject.set(x, "getGeometries", js.Any.fromFunction0(value))
  }
}
