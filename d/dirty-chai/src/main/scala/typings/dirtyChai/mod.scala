package typings.dirtyChai

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiAsPromised.Chai.Eventually
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dirty-chai", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        def apply(): Assertion = js.native
        def apply(message: String): Assertion = js.native
        
        def ensure(): Assertion = js.native
        def ensure(message: String): Assertion = js.native
        @JSName("ensure")
        var ensure_Original: Assertion = js.native
      }
      
      @js.native
      trait LanguageChains extends StObject {
        
        def always(): Assertion = js.native
        def always(message: String): Assertion = js.native
        @JSName("always")
        var always_Original: Assertion = js.native
      }
      
      @js.native
      trait PromisedAssertion
        extends Eventually
           with PromiseLike[js.Any] {
        
        def apply(): PromisedAssertion = js.native
        
        def ensure(): PromisedAssertion = js.native
        def ensure(message: String): PromisedAssertion = js.native
        def ensure(`type`: String, message: String): typings.chaiAsPromised.Chai.PromisedAssertion = js.native
        @JSName("ensure")
        var ensure_Original: PromisedAssertion = js.native
        @JSName("ensure")
        def ensure_PromisedAssertion(`type`: String): typings.chaiAsPromised.Chai.PromisedAssertion = js.native
      }
    }
  }
}
