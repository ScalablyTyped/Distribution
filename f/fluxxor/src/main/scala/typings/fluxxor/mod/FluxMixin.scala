package typings.fluxxor.mod

import typings.fluxxor.anon.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluxMixin extends js.Object {
  
  def getFlux(): Flux = js.native
}
@JSImport("fluxxor", "FluxMixin")
@js.native
object FluxMixin extends js.Object {
  
  def apply(react: TypeofReact): FluxMixin = js.native
}
