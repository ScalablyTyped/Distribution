package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlNetworkLink extends KmlFeature {
  /**
    * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
    */
  def getFlyToView(): Boolean = js.native
  /**
    * Specifies the location of any of the following:
    *
    * * KML files fetched by network links
    * * Image files used by icons in icon styles, ground overlays, and screen overlays
    * * Model files used in the Model object
    */
  def getLink(): KmlLink = js.native
  /**
    * A value of 0 leaves the visibility of features within the control of the Google Earth user.
    * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
    * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
    * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
    * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
    */
  def getRefreshVisibility(): Boolean = js.native
  /**
    * Sets the link, refreshVisibility, and flyToView for the network link.
    */
  def set(link: KmlLink, refreshVisibility: Boolean, flyToView: Boolean): Unit = js.native
  /**
    * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
    */
  def setFlyToView(flyToView: Boolean): Unit = js.native
  /**
    * Specifies the location of any of the following:
    *
    * * KML files fetched by network links
    * * Image files used by icons in icon styles, ground overlays, and screen overlays
    * * Model files used in the Model object
    */
  def setLink(link: KmlLink): Unit = js.native
  /**
    * A value of 0 leaves the visibility of features within the control of the Google Earth user.
    * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
    * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
    * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
    * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
    */
  def setRefreshVisibility(refreshVisibility: Boolean): Unit = js.native
}

object KmlNetworkLink {
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
    getFlyToView: () => Boolean,
    getId: () => String,
    getKml: () => String,
    getLink: () => KmlLink,
    getName: () => String,
    getNextSibling: () => KmlFeature,
    getOpacity: () => Double,
    getOpen: () => Boolean,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPreviousSibling: () => KmlFeature,
    getRefreshVisibility: () => Boolean,
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
    set: (KmlLink, Boolean, Boolean) => Unit,
    setAbstractView: KmlAbstractView => Unit,
    setAddress: String => Unit,
    setDescription: String => Unit,
    setFlyToView: Boolean => Unit,
    setLink: KmlLink => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRefreshVisibility: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlNetworkLink = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getFlyToView = js.Any.fromFunction0(getFlyToView), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getLink = js.Any.fromFunction0(getLink), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRefreshVisibility = js.Any.fromFunction0(getRefreshVisibility), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction3(set), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setFlyToView = js.Any.fromFunction1(setFlyToView), setLink = js.Any.fromFunction1(setLink), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRefreshVisibility = js.Any.fromFunction1(setRefreshVisibility), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[KmlNetworkLink]
  }
  @scala.inline
  implicit class KmlNetworkLinkOps[Self <: KmlNetworkLink] (val x: Self) extends AnyVal {
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
    def setGetFlyToView(value: () => Boolean): Self = this.set("getFlyToView", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLink(value: () => KmlLink): Self = this.set("getLink", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRefreshVisibility(value: () => Boolean): Self = this.set("getRefreshVisibility", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (KmlLink, Boolean, Boolean) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFlyToView(value: Boolean => Unit): Self = this.set("setFlyToView", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLink(value: KmlLink => Unit): Self = this.set("setLink", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRefreshVisibility(value: Boolean => Unit): Self = this.set("setRefreshVisibility", js.Any.fromFunction1(value))
  }
  
}

