package typings.fluxxor.mod

import typings.fluxxor.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxMixin extends js.Object {
  def getFlux(): Flux
}

@JSImport("fluxxor", "FluxMixin")
@js.native
object FluxMixin extends js.Object {
  def apply(react: TypeofReact): FluxMixin = js.native
}

