package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlAbstractView extends KmlObject {
  /**
    * Creates a new KmlCamera object that matches this KmlAbstractView.
    *
    * If this view is already a KmlCamera, this function returns a new KmlCamera representing the same view.
    */
  def copyAsCamera(): KmlCamera
  /**
    * Creates a new KmlLookAt object that matches as closely as possible this KmlAbstractView. 
    * KmlLookAt is unable to represent roll, so roll values in the current view will not be passed to the new KmlLookAt object.
    *
    * If this view is already a KmlLookAt, this function returns a new KmlLookAt representing the same view.
    */
  def copyAsLookAt(): KmlLookAt
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this view.
    */
  def getTimePrimitive(): KmlTimePrimitive
  /**
    * Returns the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  def getViewerOptions(): KmlViewerOptions
  /**
    * Associate a KmlTimeStamp or KmlTimeSpan object with this view.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit
  /**
    * Sets the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  def setViewerOptions(viewerOptions: KmlViewerOptions): Unit
}

object KmlAbstractView {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    copyAsCamera: () => KmlCamera,
    copyAsLookAt: () => KmlLookAt,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getTimePrimitive: () => KmlTimePrimitive,
    getType: () => String,
    getUrl: () => String,
    getViewerOptions: () => KmlViewerOptions,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setViewerOptions: KmlViewerOptions => Unit
  ): KmlAbstractView = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), copyAsCamera = js.Any.fromFunction0(copyAsCamera), copyAsLookAt = js.Any.fromFunction0(copyAsLookAt), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewerOptions = js.Any.fromFunction0(getViewerOptions), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setViewerOptions = js.Any.fromFunction1(setViewerOptions))
    __obj.asInstanceOf[KmlAbstractView]
  }
}

