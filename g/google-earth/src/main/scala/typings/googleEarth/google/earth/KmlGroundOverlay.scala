package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlGroundOverlay extends KmlOverlay {
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): Double = js.native
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * The bounding box of the ground overlay.
    */
  def getLatLonBox(): KmlLatLonBox = js.native
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * The bounding box of the ground overlay.
    */
  def setLatLonBox(latLonBox: KmlLatLonBox): Unit = js.native
}

object KmlGroundOverlay {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getAltitude: () => Double,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getColor: () => KmlColor,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getDrawOrder: () => Double,
    getIcon: () => KmlIcon,
    getId: () => String,
    getKml: () => String,
    getLatLonBox: () => KmlLatLonBox,
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
    setAltitude: Double => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setDescription: String => Unit,
    setDrawOrder: Double => Unit,
    setIcon: KmlIcon => Unit,
    setLatLonBox: KmlLatLonBox => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlGroundOverlay = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getAltitude = js.Any.fromFunction0(getAltitude), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getColor = js.Any.fromFunction0(getColor), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getDrawOrder = js.Any.fromFunction0(getDrawOrder), getIcon = js.Any.fromFunction0(getIcon), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getLatLonBox = js.Any.fromFunction0(getLatLonBox), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setAltitude = js.Any.fromFunction1(setAltitude), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setDescription = js.Any.fromFunction1(setDescription), setDrawOrder = js.Any.fromFunction1(setDrawOrder), setIcon = js.Any.fromFunction1(setIcon), setLatLonBox = js.Any.fromFunction1(setLatLonBox), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[KmlGroundOverlay]
  }
  @scala.inline
  implicit class KmlGroundOverlayOps[Self <: KmlGroundOverlay] (val x: Self) extends AnyVal {
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
    def setGetAltitude(value: () => Double): Self = this.set("getAltitude", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAltitudeMode(value: () => KmlAltitudeModeEnum): Self = this.set("getAltitudeMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLatLonBox(value: () => KmlLatLonBox): Self = this.set("getLatLonBox", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = this.set("setAltitude", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAltitudeMode(value: KmlAltitudeModeEnum => Unit): Self = this.set("setAltitudeMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLatLonBox(value: KmlLatLonBox => Unit): Self = this.set("setLatLonBox", js.Any.fromFunction1(value))
  }
  
}

