package typings.fluxxor.mod

import typings.fluxxor.anon.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluxMixin extends js.Object {
  def getFlux(): Flux = js.native
}

@JSImport("fluxxor", "FluxMixin")
@js.native
object FluxMixin extends js.Object {
  def apply(react: TypeofReact): FluxMixin = js.native
}

