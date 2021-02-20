package typings.expect

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printMod {
  
  @JSImport("expect/build/print", "printCloseTo")
  @js.native
  def printCloseTo(receivedDiff: Double, expectedDiff: Double, precision: Double, isNot: Boolean): String = js.native
  
  @JSImport("expect/build/print", "printExpectedConstructorName")
  @js.native
  def printExpectedConstructorName(label: String, expected: js.Function): String = js.native
  
  @JSImport("expect/build/print", "printExpectedConstructorNameNot")
  @js.native
  def printExpectedConstructorNameNot(label: String, expected: js.Function): String = js.native
  
  @JSImport("expect/build/print", "printReceivedArrayContainExpectedItem")
  @js.native
  def printReceivedArrayContainExpectedItem(received: js.Array[_], index: Double): String = js.native
  
  @JSImport("expect/build/print", "printReceivedConstructorName")
  @js.native
  def printReceivedConstructorName(label: String, received: js.Function): String = js.native
  
  @JSImport("expect/build/print", "printReceivedConstructorNameNot")
  @js.native
  def printReceivedConstructorNameNot(label: String, received: js.Function, expected: js.Function): String = js.native
  
  @JSImport("expect/build/print", "printReceivedStringContainExpectedResult")
  @js.native
  def printReceivedStringContainExpectedResult(received: String): String = js.native
  @JSImport("expect/build/print", "printReceivedStringContainExpectedResult")
  @js.native
  def printReceivedStringContainExpectedResult(received: String, result: RegExpExecArray): String = js.native
  
  @JSImport("expect/build/print", "printReceivedStringContainExpectedSubstring")
  @js.native
  def printReceivedStringContainExpectedSubstring(received: String, start: Double, length: Double): String = js.native
}
