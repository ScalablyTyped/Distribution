package typings
package esprimaLib.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def parseModule(input: java.lang.String): Program = js.native
  def parseModule(input: java.lang.String, config: ParseOptions): Program = js.native
  def parseModule(
    input: java.lang.String,
    config: ParseOptions,
    delegate: js.Function2[/* node */ estreeLib.estreeMod.Node, /* meta */ js.Any, scala.Unit]
  ): Program = js.native
  def parseScript(input: java.lang.String): Program = js.native
  def parseScript(input: java.lang.String, config: ParseOptions): Program = js.native
  def parseScript(
    input: java.lang.String,
    config: ParseOptions,
    delegate: js.Function2[/* node */ estreeLib.estreeMod.Node, /* meta */ js.Any, scala.Unit]
  ): Program = js.native
  def tokenize(input: java.lang.String): js.Array[Token] = js.native
  def tokenize(input: java.lang.String, config: TokenizeOptions): js.Array[Token] = js.native
}

