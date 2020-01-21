package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.StaticGray
  - typings.gm.gmStrings.GrayScale
  - typings.gm.gmStrings.StaticColor
  - typings.gm.gmStrings.PseudoColor
  - typings.gm.gmStrings.TrueColor
  - typings.gm.gmStrings.DirectColor
  - typings.gm.gmStrings.default
*/
trait VisualType extends js.Object

object VisualType {
  @scala.inline
  def DirectColor: typings.gm.gmStrings.DirectColor = this.cast("DirectColor")
  @scala.inline
  def GrayScale: typings.gm.gmStrings.GrayScale = this.cast("GrayScale")
  @scala.inline
  def PseudoColor: typings.gm.gmStrings.PseudoColor = this.cast("PseudoColor")
  @scala.inline
  def StaticColor: typings.gm.gmStrings.StaticColor = this.cast("StaticColor")
  @scala.inline
  def StaticGray: typings.gm.gmStrings.StaticGray = this.cast("StaticGray")
  @scala.inline
  def TrueColor: typings.gm.gmStrings.TrueColor = this.cast("TrueColor")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.gm.gmStrings.default = this.cast("default")
}

