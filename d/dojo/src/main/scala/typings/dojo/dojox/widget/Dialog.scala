package typings.dojo.dojox.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Dialog.html
  *
  * A Lightbox-like Modal-dialog for HTML Content
  * An HTML-capable Dialog widget with advanced sizing
  * options, animated show/hide and other useful options.
  *
  * This Dialog is also very easy to apply custom styles to.
  *
  * It works identically to a dijit.Dialog with several
  * additional parameters.
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.widget.Dialog")
@js.native
class Dialog protected () extends js.Object {
  def this(props: js.Any, node: js.Any) = this()
  /**
    * A two-element array of [width,height] to animate the Dialog to if sizeToViewport="false"
    * Defaults to [300,300]
    *
    */
  var dimensions: js.Array[_] = js.native
  /**
    * Make the pane draggable. Differs from dijit.Dialog by setting default to false
    *
    */
  var draggable: Boolean = js.native
  /**
    * An easing function to apply to the sizing animation.
    *
    */
  var easing: js.Object = js.native
  /**
    * If true, this Dialog instance will be truly modal and prevent closing until
    * explicitly told to by calling hide() - Defaults to false to preserve previous
    * behaviors.
    *
    */
  var modal: Boolean = js.native
  /**
    * Toogle to show or hide the Title area. Can only be set at startup.
    *
    */
  var showTitle: Boolean = js.native
  /**
    * Time (in ms) to use in the Animation for sizing.
    *
    */
  var sizeDuration: Double = js.native
  /**
    * To be passed to dojox.fx.sizeTo, one of "chain" or "combine" to effect
    * the animation sequence.
    *
    */
  var sizeMethod: String = js.native
  /**
    * If true, fix the size of the dialog to the Viewport based on
    * viewportPadding value rather than the calculated or natural
    * style. If false, base the size on a passed dimension attribute.
    * Either way, the viewportPadding value is used if the the content
    * extends beyond the viewport size for whatever reason.
    *
    */
  var sizeToViewport: Boolean = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    * If sizeToViewport="true", this is the amount of padding in pixels to leave
    * between the dialog border and the viewport edge.
    * This value is also used when sizeToViewport="false" and dimensions exceeded
    * by dialog content to ensure dialog does not go outside viewport boundary
    *
    */
  var viewportPadding: Double = js.native
  /**
    *
    * @param e
    */
  def layout(e: js.Any): Unit = js.native
  /**
    *
    */
  def show(): Unit = js.native
}

