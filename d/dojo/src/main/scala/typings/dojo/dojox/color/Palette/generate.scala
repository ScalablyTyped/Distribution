package typings.dojo.dojox.color.Palette

import typings.dojo.dojo._base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generate a new Palette using any of the named functions in
  * dojox.color.Palette.generators or an optional function definition.  Current
  * generators include "analogous", "monochromatic", "triadic", "complementary",
  * "splitComplementary", and "shades".
  *
  * @param base
  * @param type
  */
@js.native
trait generate extends js.Object {
  def apply(base: String, `type`: String): js.Any = js.native
  def apply(base: String, `type`: js.Function): js.Any = js.native
  def apply(base: Color, `type`: String): js.Any = js.native
  def apply(base: Color, `type`: js.Function): js.Any = js.native
}

