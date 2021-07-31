package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Actual
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("assert", "AssertionError")
  @js.native
  class AssertionError ()
    extends StObject
       with Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var operator: String = js.native
  }
  
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doesNotThrow(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, error: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, error: RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def equal(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fail(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Unit, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: String, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: Unit, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: String, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: Unit, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: String, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: Unit, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ifError(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(acutal.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(acutal.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ok(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def ok(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def strictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def throws(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, error: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, error: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, error: RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
