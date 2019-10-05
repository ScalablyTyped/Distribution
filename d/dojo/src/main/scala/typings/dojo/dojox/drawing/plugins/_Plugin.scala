package typings.dojo.dojox.drawing.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/_Plugin.html
  *
  * Base class for plugins.
  * When creating a plugin, use this class as the
  * base to ensure full functionality.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.plugins._Plugin")
@js.native
class _Plugin protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    *
    */
  var anchors: js.Object = js.native
  /**
    *
    */
  var button: js.Object = js.native
  /**
    *
    */
  var canvas: js.Object = js.native
  /**
    *
    */
  var drawing: js.Object = js.native
  /**
    *
    */
  var keys: js.Object = js.native
  /**
    *
    */
  var mouse: js.Object = js.native
  /**
    *
    */
  var node: js.Object = js.native
  /**
    *
    */
  var stencils: js.Object = js.native
  /**
    *
    */
  var `type`: String = js.native
  /**
    *
    */
  var util: js.Object = js.native
  /**
    *
    */
  def connect(): Unit = js.native
  /**
    * Removes connections based on passed
    * handles arguments
    *
    * @param handles
    */
  def disconnect(handles: js.Array[_]): Unit = js.native
  /**
    * Removes connections based on passed
    * handles arguments
    *
    * @param handles
    */
  def disconnect(handles: js.Object): Unit = js.native
}

