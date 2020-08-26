package typings.dirtyChai.mod

import typings.chaiAsPromised.Chai.Eventually
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Chai extends js.Object {
    @js.native
    trait Assertion extends js.Object {
      @JSName("ensure")
      var ensure_Original: Assertion = js.native
      def apply(): Assertion = js.native
      def apply(message: String): Assertion = js.native
      def ensure(): Assertion = js.native
      def ensure(message: String): Assertion = js.native
    }
    
    @js.native
    trait LanguageChains extends js.Object {
      @JSName("always")
      var always_Original: Assertion = js.native
      def always(): Assertion = js.native
      def always(message: String): Assertion = js.native
    }
    
    @js.native
    trait PromisedAssertion
      extends js.Thenable[js.Any]
         with Eventually {
      @JSName("ensure")
      var ensure_Original: PromisedAssertion = js.native
      def apply(): PromisedAssertion = js.native
      def ensure(): PromisedAssertion = js.native
      def ensure(message: String): PromisedAssertion = js.native
      def ensure(`type`: String, message: String): typings.chaiAsPromised.Chai.PromisedAssertion = js.native
      @JSName("ensure")
      def ensure_PromisedAssertion(`type`: String): typings.chaiAsPromised.Chai.PromisedAssertion = js.native
    }
    
  }
  
}

