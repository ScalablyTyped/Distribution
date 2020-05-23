package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlScreenOverlay extends KmlOverlay {
  /**
    * Specifies a point relative to the screen origin that the overlay image is mapped to.
    * The x and y values can be specified in three different ways: as pixels ("pixels"), as fractions of the screen ("fraction"), or as inset pixels ("insetPixels"), which is an offset in pixels from the upper right corner of the screen.
    * The x and y positions can be specified in different ways - for example, x can be in pixels and y can be a fraction.
    * The origin of the coordinate system is in the lower left corner of the screen.
    *
    * Note: 
    *
    *  screenXY and overlayXY behave opposite to their corresponding behaviors in KML.
    *  This is due to a bug in the Earth API that will intentionally remain unfixed until a major version change.
    */
  def getOverlayXY(): KmlVec2
  /**
    * Adjusts how the image is placed inside the field of view.
    * This element is useful if your image has been rotated and deviates slightly from a desired horizontal view.
    */
  def getRotation(): Double
  /**
    * Point relative to the screen about which the screen overlay is rotated.
    */
  def getRotationXY(): KmlVec2
  /**
    * Specifies a point on (or outside of) the overlay image that is mapped to the screen coordinate.
    * It requires x and y values, and the units for those values.
    *
    * Note: 
    *
    *  screenXY and overlayXY behave opposite to their corresponding behaviors in KML.
    *  This is due to a bug in the Earth API that will intentionally remain unfixed until a major version change.
    */
  def getScreenXY(): KmlVec2
  /**
    * Specifies the size of the image for the screen overlay, as follows:
    *
    * * A value of -1 indicates to use the native dimension
    * * A value of 0 indicates to maintain the aspect ratio
    * * A value of n sets the value of the dimension
    */
  def getSize(): KmlVec2
  /**
    * Adjusts how the image is placed inside the field of view.
    * This element is useful if your image has been rotated and deviates slightly from a desired horizontal view.
    */
  def setRotation(rotation: Double): Unit
}

object KmlScreenOverlay {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getColor: () => KmlColor,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getDrawOrder: () => Double,
    getIcon: () => KmlIcon,
    getId: () => String,
    getKml: () => String,
    getName: () => String,
    getNextSibling: () => KmlFeature,
    getOpacity: () => Double,
    getOpen: () => Boolean,
    getOverlayXY: () => KmlVec2,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPreviousSibling: () => KmlFeature,
    getRegion: () => KmlRegion,
    getRotation: () => Double,
    getRotationXY: () => KmlVec2,
    getScreenXY: () => KmlVec2,
    getSize: () => KmlVec2,
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
    setDrawOrder: Double => Unit,
    setIcon: KmlIcon => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setRotation: Double => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlScreenOverlay = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getColor = js.Any.fromFunction0(getColor), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getDrawOrder = js.Any.fromFunction0(getDrawOrder), getIcon = js.Any.fromFunction0(getIcon), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOverlayXY = js.Any.fromFunction0(getOverlayXY), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getRotation = js.Any.fromFunction0(getRotation), getRotationXY = js.Any.fromFunction0(getRotationXY), getScreenXY = js.Any.fromFunction0(getScreenXY), getSize = js.Any.fromFunction0(getSize), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setDrawOrder = js.Any.fromFunction1(setDrawOrder), setIcon = js.Any.fromFunction1(setIcon), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setRotation = js.Any.fromFunction1(setRotation), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[KmlScreenOverlay]
  }
}

