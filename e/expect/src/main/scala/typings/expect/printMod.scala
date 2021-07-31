package typings.expect

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printMod {
  
  @JSImport("expect/build/print", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def printCloseTo(receivedDiff: Double, expectedDiff: Double, precision: Double, isNot: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printCloseTo")(receivedDiff.asInstanceOf[js.Any], expectedDiff.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], isNot.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printExpectedConstructorName(label: String, expected: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printExpectedConstructorName")(label.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printExpectedConstructorNameNot(label: String, expected: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printExpectedConstructorNameNot")(label.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printReceivedArrayContainExpectedItem(received: js.Array[js.Any], index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printReceivedArrayContainExpectedItem")(received.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printReceivedConstructorName(label: String, received: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printReceivedConstructorName")(label.asInstanceOf[js.Any], received.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printReceivedConstructorNameNot(label: String, received: js.Function, expected: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printReceivedConstructorNameNot")(label.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printReceivedStringContainExpectedResult(received: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printReceivedStringContainExpectedResult")(received.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def printReceivedStringContainExpectedResult(received: String, result: RegExpExecArray): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printReceivedStringContainExpectedResult")(received.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printReceivedStringContainExpectedSubstring(received: String, start: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printReceivedStringContainExpectedSubstring")(received.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
}
