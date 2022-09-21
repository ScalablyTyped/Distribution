package typings.expectations

import typings.expectations.Expectations.IAssertions
import typings.expectations.Expectations.IExpectations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Expectations {
    
    @JSGlobal("Expectations.Expect")
    @js.native
    open class Expect protected ()
      extends StObject
         with typings.expectations.Expectations.Expect {
      def this(value: Any) = this()
      def this(value: Any, assertions: IAssertions) = this()
      def this(value: Any, assertions: Unit, expr: Any) = this()
      def this(value: Any, assertions: IAssertions, expr: Any) = this()
      def this(value: Any, assertions: Unit, expr: Any, parent: typings.expectations.Expectations.Expect) = this()
      def this(value: Any, assertions: Unit, expr: Unit, parent: typings.expectations.Expectations.Expect) = this()
      def this(value: Any, assertions: IAssertions, expr: Any, parent: typings.expectations.Expectations.Expect) = this()
      def this(value: Any, assertions: IAssertions, expr: Unit, parent: typings.expectations.Expectations.Expect) = this()
    }
  }
  
  @JSGlobal("expect")
  @js.native
  def expect: IExpectations = js.native
  inline def expect_=(x: IExpectations): Unit = js.Dynamic.global.updateDynamic("expect")(x.asInstanceOf[js.Any])
}
