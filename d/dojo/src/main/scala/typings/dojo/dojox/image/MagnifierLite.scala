package typings.dojo.dojox.image

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.Widget
import typings.dojo.dojoStrings.glassSize
import typings.dojo.dojoStrings.scale
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/MagnifierLite.html
  *
  * Adds magnification on a portion of an image element
  * An unobtrusive way to add an unstyled overlay
  * above the srcNode image element. The overlay/glass is a
  * scaled version of the src image (so larger images sized down
  * are clearer).
  *
  * The logic behind requiring the src image to be large is
  * "it's going to be downloaded, anyway" so this method avoids
  * having to make thumbnails and 2 http requests among other things.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.image.MagnifierLite")
@js.native
class MagnifierLite () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * the width and height of the bounding box
    *
    */
  var glassSize: Double = js.native
  /**
    * the multiplier of the Mangification.
    *
    */
  var scale: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_MagnifierLite: String = js.native
  /**
    *
    * @param finalize
    */
  def destroy(finalize: js.Any): Unit = js.native
  @JSName("get")
  def get_glassSize(property: glassSize): Double = js.native
  @JSName("get")
  def get_scale(property: scale): js.Object = js.native
  @JSName("set")
  def set_glassSize(property: glassSize, value: Double): Unit = js.native
  @JSName("set")
  def set_scale(property: scale, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_glassSize(
    property: glassSize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scale(
    property: scale,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

