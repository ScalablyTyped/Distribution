package typings.easyXHeaders

import typings.easyXHeaders.anon.Actual
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): Unit = js.native
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "AssertionError")
  @js.native
  class AssertionError () extends Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    var operator: String = js.native
  }
  
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: RegExp): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, error: RegExp, message: String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function, message: String): Unit = js.native
  
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "fail")
  @js.native
  def fail(): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: String,
    operator: String
  ): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
  
  @JSImport("assert", "ifError")
  @js.native
  def ifError(value: js.Any): Unit = js.native
  
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any): Unit = js.native
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, error: js.Function, message: String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, error: RegExp): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, error: RegExp, message: String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function, message: String): Unit = js.native
}
