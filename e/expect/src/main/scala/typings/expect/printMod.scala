package typings.expect

import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/print", JSImport.Namespace)
@js.native
object printMod extends js.Object {
  def printExpectedConstructorName(label: String, expected: js.Function): String = js.native
  def printExpectedConstructorNameNot(label: String, expected: js.Function): String = js.native
  def printReceivedArrayContainExpectedItem(received: js.Array[_], index: Double): String = js.native
  def printReceivedConstructorName(label: String, received: js.Function): String = js.native
  def printReceivedConstructorNameNot(label: String, received: js.Function, expected: js.Function): String = js.native
  def printReceivedStringContainExpectedResult(received: String): String = js.native
  def printReceivedStringContainExpectedResult(received: String, result: RegExpExecArray): String = js.native
  def printReceivedStringContainExpectedSubstring(received: String, start: Double, length: Double): String = js.native
}

