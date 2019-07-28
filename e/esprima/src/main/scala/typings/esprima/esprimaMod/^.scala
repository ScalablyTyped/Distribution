package typings.esprima.esprimaMod

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def parseModule(input: String): Program = js.native
  def parseModule(input: String, config: ParseOptions): Program = js.native
  def parseModule(
    input: String,
    config: ParseOptions,
    delegate: js.Function2[/* node */ Node, /* meta */ js.Any, Unit]
  ): Program = js.native
  def parseScript(input: String): Program = js.native
  def parseScript(input: String, config: ParseOptions): Program = js.native
  def parseScript(
    input: String,
    config: ParseOptions,
    delegate: js.Function2[/* node */ Node, /* meta */ js.Any, Unit]
  ): Program = js.native
  def tokenize(input: String): js.Array[Token] = js.native
  def tokenize(input: String, config: TokenizeOptions): js.Array[Token] = js.native
}

