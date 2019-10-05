package typings.esprima.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima", "tokenize")
@js.native
object tokenize extends js.Object {
  def apply(input: String): js.Array[Token] = js.native
  def apply(input: String, config: TokenizeOptions): js.Array[Token] = js.native
}

