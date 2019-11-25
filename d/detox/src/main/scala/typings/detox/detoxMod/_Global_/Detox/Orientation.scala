package typings.detox.detoxMod._Global_.Detox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.detox.detoxStrings.portrait
  - typings.detox.detoxStrings.landscape
*/
trait Orientation extends js.Object

object Orientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typings.detox.detoxStrings.landscape = this.cast("landscape")
  @scala.inline
  def portrait: typings.detox.detoxStrings.portrait = this.cast("portrait")
}

