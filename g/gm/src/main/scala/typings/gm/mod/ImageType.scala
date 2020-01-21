package typings.gm.mod

import typings.gm.gmStrings.Grayscale_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.Bilevel
  - typings.gm.gmStrings.Grayscale_
  - typings.gm.gmStrings.Palette
  - typings.gm.gmStrings.PaletteMatte
  - typings.gm.gmStrings.TrueColor
  - typings.gm.gmStrings.TrueColorMatte
  - typings.gm.gmStrings.ColorSeparation
  - typings.gm.gmStrings.ColorSeparationMatte
  - typings.gm.gmStrings.Optimize
*/
trait ImageType extends js.Object

object ImageType {
  @scala.inline
  def Bilevel: typings.gm.gmStrings.Bilevel = this.cast("Bilevel")
  @scala.inline
  def ColorSeparation: typings.gm.gmStrings.ColorSeparation = this.cast("ColorSeparation")
  @scala.inline
  def ColorSeparationMatte: typings.gm.gmStrings.ColorSeparationMatte = this.cast("ColorSeparationMatte")
  @scala.inline
  def Grayscale: Grayscale_ = this.cast("Grayscale")
  @scala.inline
  def Optimize: typings.gm.gmStrings.Optimize = this.cast("Optimize")
  @scala.inline
  def Palette: typings.gm.gmStrings.Palette = this.cast("Palette")
  @scala.inline
  def PaletteMatte: typings.gm.gmStrings.PaletteMatte = this.cast("PaletteMatte")
  @scala.inline
  def TrueColor: typings.gm.gmStrings.TrueColor = this.cast("TrueColor")
  @scala.inline
  def TrueColorMatte: typings.gm.gmStrings.TrueColorMatte = this.cast("TrueColorMatte")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

