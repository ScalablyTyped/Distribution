package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    equals: KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getFeatures = js.Any.fromFunction0(getFeatures), getGroundAltitude = js.Any.fromFunction2(getGroundAltitude), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[GEGlobe]
  }
  @scala.inline
  implicit class GEGlobeOps[Self <: GEGlobe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetFeatures(value: () => GEFeatureContainer): Self = this.set("getFeatures", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGroundAltitude(value: (Double, Double) => Double): Self = this.set("getGroundAltitude", js.Any.fromFunction2(value))
  }
  
}

