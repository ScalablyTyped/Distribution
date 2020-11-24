package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlAbstractView extends KmlObject {
  
  /**
    * Creates a new KmlCamera object that matches this KmlAbstractView.
    *
    * If this view is already a KmlCamera, this function returns a new KmlCamera representing the same view.
    */
  def copyAsCamera(): KmlCamera = js.native
  
  /**
    * Creates a new KmlLookAt object that matches as closely as possible this KmlAbstractView. 
    * KmlLookAt is unable to represent roll, so roll values in the current view will not be passed to the new KmlLookAt object.
    *
    * If this view is already a KmlLookAt, this function returns a new KmlLookAt representing the same view.
    */
  def copyAsLookAt(): KmlLookAt = js.native
  
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this view.
    */
  def getTimePrimitive(): KmlTimePrimitive = js.native
  
  /**
    * Returns the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  def getViewerOptions(): KmlViewerOptions = js.native
  
  /**
    * Associate a KmlTimeStamp or KmlTimeSpan object with this view.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit = js.native
  
  /**
    * Sets the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  def setViewerOptions(viewerOptions: KmlViewerOptions): Unit = js.native
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
  
  @scala.inline
  implicit class KmlAbstractViewOps[Self <: KmlAbstractView] (val x: Self) extends AnyVal {
    
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
    def setCopyAsCamera(value: () => KmlCamera): Self = this.set("copyAsCamera", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyAsLookAt(value: () => KmlLookAt): Self = this.set("copyAsLookAt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimePrimitive(value: () => KmlTimePrimitive): Self = this.set("getTimePrimitive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewerOptions(value: () => KmlViewerOptions): Self = this.set("getViewerOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTimePrimitive(value: KmlTimePrimitive => Unit): Self = this.set("setTimePrimitive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetViewerOptions(value: KmlViewerOptions => Unit): Self = this.set("setViewerOptions", js.Any.fromFunction1(value))
  }
}
