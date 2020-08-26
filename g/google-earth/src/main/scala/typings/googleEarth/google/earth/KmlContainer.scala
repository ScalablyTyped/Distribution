package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlContainer extends KmlFeature {
  /**
    * Get an element by ID.
    * This is functionally equivalent to getElementByUrl with an unspecified base URL.
    *
    * For example: getElementByUrl('#foo').
    *
    * Usage is when finding objects created with JavaScript, which have unspecified base URLs.
    * The object must be a descendant of the container before it can be found.
    */
  def getElementById(id: String): KmlObject = js.native
  /**
    * Get an element by URL. A URL consists of the base address and ID, joined with the # character. 
    *
    * For example: http://www.google.com/bar.kml#here_be_monsters 
    *
    * This applies to objects that are fetched.
    * In the case of plugin created objects, the URL is simply #foo.
    * The object must be a descendant of the container before it can be found.
    */
  def getElementByUrl(url: String): KmlObject = js.native
  /**
    * Get an element by type.
    */
  def getElementsByType(`type`: String): KmlObjectList[KmlObject] = js.native
  /**
    * A collection of features, such as name, description, and so on.
    */
  def getFeatures(): GEFeatureContainer = js.native
}

object KmlContainer {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getElementById: String => KmlObject,
    getElementByUrl: String => KmlObject,
    getElementsByType: String => KmlObjectList[KmlObject],
    getFeatures: () => GEFeatureContainer,
    getId: () => String,
    getKml: () => String,
    getName: () => String,
    getNextSibling: () => KmlFeature,
    getOpacity: () => Double,
    getOpen: () => Boolean,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPreviousSibling: () => KmlFeature,
    getRegion: () => KmlRegion,
    getSnippet: () => String,
    getStyleSelector: () => KmlStyleSelector,
    getStyleUrl: () => String,
    getTimePrimitive: () => KmlTimePrimitive,
    getType: () => String,
    getUrl: () => String,
    getVisibility: () => Boolean,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAbstractView: KmlAbstractView => Unit,
    setAddress: String => Unit,
    setDescription: String => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlContainer = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getElementById = js.Any.fromFunction1(getElementById), getElementByUrl = js.Any.fromFunction1(getElementByUrl), getElementsByType = js.Any.fromFunction1(getElementsByType), getFeatures = js.Any.fromFunction0(getFeatures), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[KmlContainer]
  }
  @scala.inline
  implicit class KmlContainerOps[Self <: KmlContainer] (val x: Self) extends AnyVal {
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
    def setGetElementById(value: String => KmlObject): Self = this.set("getElementById", js.Any.fromFunction1(value))
    @scala.inline
    def setGetElementByUrl(value: String => KmlObject): Self = this.set("getElementByUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetElementsByType(value: String => KmlObjectList[KmlObject]): Self = this.set("getElementsByType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFeatures(value: () => GEFeatureContainer): Self = this.set("getFeatures", js.Any.fromFunction0(value))
  }
  
}

