package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components

import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.EntityCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentCollection extends EntityCollection[Component] {
  def components(): this.type = js.native
  def variants(): this.type = js.native
}

