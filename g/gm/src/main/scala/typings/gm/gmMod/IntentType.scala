package typings.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.Absolute
  - typings.gm.gmStrings.Perceptual
  - typings.gm.gmStrings.Relative
  - typings.gm.gmStrings.Saturation
*/
trait IntentType extends js.Object

object IntentType {
  @scala.inline
  def Absolute: typings.gm.gmStrings.Absolute = this.cast("Absolute")
  @scala.inline
  def Perceptual: typings.gm.gmStrings.Perceptual = this.cast("Perceptual")
  @scala.inline
  def Relative: typings.gm.gmStrings.Relative = this.cast("Relative")
  @scala.inline
  def Saturation: typings.gm.gmStrings.Saturation = this.cast("Saturation")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

