package typings.dojo.dojox.drawing.plugins.tools

import typings.dojo.dojox.drawing.plugins.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/tools/Zoom.html
  *
  *
  */
trait Zoom extends js.Object {
  /**
    *
    */
  def Zoom100(): Unit
  /**
    *
    */
  def ZoomIn(): Unit
  /**
    *
    */
  def ZoomOut(): Unit
}

@JSGlobal("dojox.drawing.plugins.tools.Zoom")
@js.native
object Zoom extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/tools/Zoom.Zoom100.html
    *
    *
    * @param options
    */
  @js.native
  class Zoom100 protected () extends Plugin {
    def this(options: js.Any) = this()
    /**
      *
      */
    var setup: js.Object = js.native
    /**
      *
      */
    def onClick(): Unit = js.native
    /**
      * Zooms to 100%
      *
      */
    def onZoom100(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/tools/Zoom.ZoomIn.html
    *
    *
    * @param options
    */
  @js.native
  class ZoomIn protected () extends Plugin {
    def this(options: js.Any) = this()
    /**
      *
      */
    var setup: js.Object = js.native
    /**
      *
      */
    def onClick(): Unit = js.native
    /**
      * Handles zoom in.
      *
      */
    def onZoomIn(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/tools/Zoom.ZoomOut.html
    *
    *
    * @param options
    */
  @js.native
  class ZoomOut protected () extends Plugin {
    def this(options: js.Any) = this()
    /**
      *
      */
    var setup: js.Object = js.native
    /**
      *
      */
    def onClick(): Unit = js.native
    /**
      * Handles zoom out.
      *
      */
    def onZoomOut(): Unit = js.native
  }
  
}

