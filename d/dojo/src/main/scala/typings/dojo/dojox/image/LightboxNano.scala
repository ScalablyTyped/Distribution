package typings.dojo.dojox.image

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/LightboxNano.html
  *
  * A simple "nano" version of the lightbox.
  * Very lightweight lightbox which only displays a larger image.  There is
  * no support for a caption or description.  The lightbox can be closed by
  * clicking any where or pressing any key.  This widget is intended to be
  * used on <a> and <img> tags.  Upon creation, if the domNode is <img> tag,
  * then it is wrapped in an <a> tag, then a <div class="enlarge"> is placed
  * inside the <a> and can be styled to display an icon that the original
  * can be enlarged.
  *
  * @param p       Optional
  * @param n       Optional
  */
@JSGlobal("dojox.image.LightboxNano")
@js.native
class LightboxNano () extends js.Object {
  def this(p: js.Object) = this()
  def this(p: js.Object, n: HTMLElement) = this()
  /**
    * The delay in milliseconds of the LightboxNano open and close animation.
    *
    */
  var duration: Double = js.native
  /**
    * URL to the large image to show in the lightbox.
    *
    */
  var href: String = js.native
  /**
    * The delay in milliseconds after the LightboxNano is created before preloading the larger image.
    *
    */
  var preloadDelay: Double = js.native
  /**
    * Destroys the LightboxNano and it's DOM node
    *
    */
  def destroy(): Unit = js.native
  /**
    * Shows this LightboxNano programatically. Allows passing a new href and
    * a programmatic origin.
    *
    * @param args               OptionalAn object with optional members of href and origin.origin can be be a String|Id of a DomNode to use whenanimating the opening of the image (the 'box' effect startsfrom this origin point. eg: { origin: e.target })If there's no origin, it will use the center of the viewport.The href member is a string URL for the image to bedisplayed. Omitting either of these members will revert tothe default href (which could be absent in some cases) andthe original srcNodeRef for the widget.
    */
  def show(args: js.Object): Unit = js.native
}

