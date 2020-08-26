package typings.fitvids.mod

import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fitvids", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The module exports a single function.
    * Just call it, and it'll wrap video embeds from Youtube, Vimeo, and Kickstarter in a responsive container.
    * Other video players can be supported by passing a custom selector via the options.
    *
    * To wrap videos that have been added to the page dynamically, just call the function again.
    * Fitvids is smart enough to only wrap the new videos.
    */
  def apply(): Unit = js.native
  def apply(options: Options): Unit = js.native
  def apply(parentSelector: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(parentSelector: String): Unit = js.native
  def apply(parentSelector: String, options: Options): Unit = js.native
  def apply(parentSelector: Null, options: Options): Unit = js.native
  def apply(parentSelector: Element): Unit = js.native
  def apply(parentSelector: Element, options: Options): Unit = js.native
  def apply(parentSelector: NodeListOf[Element]): Unit = js.native
  def apply(parentSelector: NodeListOf[Element], options: Options): Unit = js.native
}

