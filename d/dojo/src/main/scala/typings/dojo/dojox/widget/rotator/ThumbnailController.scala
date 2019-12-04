package typings.dojo.dojox.widget.rotator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/ThumbnailController.html
  *
  * A rotator controller that displays thumbnails of each rotator pane.
  * The ThumbnailController will look at each of the rotator's panes and
  * only if the node is an <img> tag, then it will create an thumbnail of
  * the pane's image using the <img> tag's "thumbsrc" or "src" attribute.
  *
  * The size of the thumbnails and the style of the selected thumbnail is
  * controlled using CSS.
  *
  * @param params
  * @param node
  */
@JSGlobal("dojox.widget.rotator.ThumbnailController")
@js.native
class ThumbnailController protected () extends js.Object {
  def this(params: js.Object, node: HTMLElement) = this()
  /**
    * An instance of a Rotator widget.
    *
    */
  var rotator: js.Object = js.native
  /**
    * Disconnect from the rotator.
    *
    */
  def destroy(): Unit = js.native
}

