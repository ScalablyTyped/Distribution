package typings.elasticlunr.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticlunr", "tokenizer")
@js.native
object tokenizer extends js.Object {
  val defaultSeperator: RegExp = js.native
  val seperator: RegExp = js.native
  def apply(): js.Array[String] = js.native
  def apply(str: String): js.Array[String] = js.native
  def getSeperator(): RegExp = js.native
  def resetSeperator(): Unit = js.native
  def setSeperator(sep: RegExp): Unit = js.native
}

