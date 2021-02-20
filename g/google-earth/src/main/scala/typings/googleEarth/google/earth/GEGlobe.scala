package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GEGlobe extends KmlObject {
  
  /**
    * The top-level features currently in the Earth instance.
    */
  def getFeatures(): GEFeatureContainer = js.native
  
  /**
    * Returns the altitude for a given location on the globe.
    * If the altitude data for the location has not yet been loaded, the return value is 0.
    */
  def getGroundAltitude(lat: Double, lon: Double): Double = js.native
}
object GEGlobe {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getFeatures: () => GEFeatureContainer,
    getGroundAltitude: (Double, Double) => Double,
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
  ): GEGlobe = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getFeatures = js.Any.fromFunction0(getFeatures), getGroundAltitude = js.Any.fromFunction2(getGroundAltitude), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[GEGlobe]
  }
  
  @scala.inline
  implicit class GEGlobeMutableBuilder[Self <: GEGlobe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFeatures(value: () => GEFeatureContainer): Self = StObject.set(x, "getFeatures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroundAltitude(value: (Double, Double) => Double): Self = StObject.set(x, "getGroundAltitude", js.Any.fromFunction2(value))
  }
}
