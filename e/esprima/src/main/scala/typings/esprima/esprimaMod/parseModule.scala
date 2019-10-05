package typings.esprima.esprimaMod

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima", "parseModule")
@js.native
object parseModule extends js.Object {
  def apply(input: String): Program = js.native
  def apply(input: String, config: ParseOptions): Program = js.native
  def apply(
    input: String,
    config: ParseOptions,
    delegate: js.Function2[/* node */ Node, /* meta */ js.Any, Unit]
  ): Program = js.native
}

