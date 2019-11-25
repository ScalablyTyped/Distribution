package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fancybox.fancyboxNumbers.`false`
  - typings.fancybox.fancyboxStrings.close
  - typings.fancybox.fancyboxStrings.next
  - typings.fancybox.fancyboxStrings.nextOrClose
  - typings.fancybox.fancyboxStrings.toggleControls
  - typings.fancybox.fancyboxStrings.zoom
*/
trait FancyBoxInteractionTypes extends js.Object

object FancyBoxInteractionTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typings.fancybox.fancyboxStrings.close = this.cast("close")
  @scala.inline
  def `false`: typings.fancybox.fancyboxNumbers.`false` = this.cast(false)
  @scala.inline
  def next: typings.fancybox.fancyboxStrings.next = this.cast("next")
  @scala.inline
  def nextOrClose: typings.fancybox.fancyboxStrings.nextOrClose = this.cast("nextOrClose")
  @scala.inline
  def toggleControls: typings.fancybox.fancyboxStrings.toggleControls = this.cast("toggleControls")
  @scala.inline
  def zoom: typings.fancybox.fancyboxStrings.zoom = this.cast("zoom")
}

