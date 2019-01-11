package typings
package esprimaLib.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Syntax: esprimaLib.Anon_ArrayExpression = js.native
  val version: java.lang.String = js.native
  def parseModule(input: java.lang.String): esprimaLib.esprimaMod.Program = js.native
  def parseModule(input: java.lang.String, config: esprimaLib.esprimaMod.ParseOptions): esprimaLib.esprimaMod.Program = js.native
  def parseModule(
    input: java.lang.String,
    config: esprimaLib.esprimaMod.ParseOptions,
    delegate: js.Function2[/* node */ estreeLib.estreeMod.Node, /* meta */ js.Any, scala.Unit]
  ): esprimaLib.esprimaMod.Program = js.native
  def parseScript(input: java.lang.String): esprimaLib.esprimaMod.Program = js.native
  def parseScript(input: java.lang.String, config: esprimaLib.esprimaMod.ParseOptions): esprimaLib.esprimaMod.Program = js.native
  def parseScript(
    input: java.lang.String,
    config: esprimaLib.esprimaMod.ParseOptions,
    delegate: js.Function2[/* node */ estreeLib.estreeMod.Node, /* meta */ js.Any, scala.Unit]
  ): esprimaLib.esprimaMod.Program = js.native
  def tokenize(input: java.lang.String): js.Array[esprimaLib.esprimaMod.Token] = js.native
  def tokenize(input: java.lang.String, config: esprimaLib.esprimaMod.TokenizeOptions): js.Array[esprimaLib.esprimaMod.Token] = js.native
}

