package typings.emberMocha

import typings.ember.mod.default.Resolver
import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.mocha.Mocha.AsyncFunc
import typings.mocha.Mocha.Func
import typings.mocha.Mocha.TestFunction
import typings.mocha.mod.Suite_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ember-mocha", "describeComponent")
  @js.native
  val describeComponent: ContextDefinition = js.native
  
  @JSImport("ember-mocha", "describeModel")
  @js.native
  val describeModel: ContextDefinition = js.native
  
  @JSImport("ember-mocha", "describeModule")
  @js.native
  val describeModule: ContextDefinition = js.native
  
  @JSImport("ember-mocha", "it")
  @js.native
  val it: TestFunction = js.native
  
  @JSImport("ember-mocha", "setResolver")
  @js.native
  def setResolver(resolver: Resolver): Unit = js.native
  
  @JSImport("ember-mocha", "setupAcceptanceTest")
  @js.native
  val setupAcceptanceTest: SetupTest_ = js.native
  
  @JSImport("ember-mocha", "setupApplicationTest")
  @js.native
  val setupApplicationTest: NewSetupTest = js.native
  
  @JSImport("ember-mocha", "setupComponentTest")
  @js.native
  val setupComponentTest: SetupTest_ = js.native
  
  @JSImport("ember-mocha", "setupModelTest")
  @js.native
  val setupModelTest: SetupTest_ = js.native
  
  @JSImport("ember-mocha", "setupRenderingTest")
  @js.native
  val setupRenderingTest: NewSetupTest = js.native
  
  @JSImport("ember-mocha", "setupTest")
  @js.native
  val setupTest: NewSetupTest with SetupTest_ = js.native
  
  @js.native
  trait ContextDefinition extends ContextDefinitionFunction {
    
    def only(name: String, callbacks: ModuleCallbacks, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    def only(
      name: String,
      description: String,
      callbacks: ModuleCallbacks,
      tests: js.ThisFunction0[/* this */ Suite_, Unit]
    ): Unit = js.native
    def only(name: String, description: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    def only(name: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    @JSName("only")
    var only_Original: ContextDefinitionFunction = js.native
    
    def skip(name: String, callbacks: ModuleCallbacks, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    def skip(
      name: String,
      description: String,
      callbacks: ModuleCallbacks,
      tests: js.ThisFunction0[/* this */ Suite_, Unit]
    ): Unit = js.native
    def skip(name: String, description: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    def skip(name: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    @JSName("skip")
    var skip_Original: ContextDefinitionFunction = js.native
  }
  
  @js.native
  trait ContextDefinitionFunction extends StObject {
    
    def apply(name: String, callbacks: ModuleCallbacks, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    def apply(
      name: String,
      description: String,
      callbacks: ModuleCallbacks,
      tests: js.ThisFunction0[/* this */ Suite_, Unit]
    ): Unit = js.native
    def apply(name: String, description: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
    def apply(name: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  }
  
  type NewSetupTest = js.Function1[/* options */ js.UndefOr[SetupOptions], TestHooks]
  
  @js.native
  trait SetupOptions extends StObject {
    
    var resolver: Resolver = js.native
  }
  object SetupOptions {
    
    @scala.inline
    def apply(resolver: Resolver): SetupOptions = {
      val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetupOptions]
    }
    
    @scala.inline
    implicit class SetupOptionsMutableBuilder[Self <: SetupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetupTest_ extends StObject {
    
    def apply(): Unit = js.native
    def apply(callbacks: ModuleCallbacks): Unit = js.native
    def apply(name: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks): Unit = js.native
    def apply(name: String): Unit = js.native
    def apply(name: String, callbacks: ModuleCallbacks): Unit = js.native
  }
  
  @js.native
  trait TestHooks extends StObject {
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def afterEach(fn: AsyncFunc): Unit = js.native
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def afterEach(fn: Func): Unit = js.native
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def afterEach(name: String): Unit = js.native
    def afterEach(name: String, fn: AsyncFunc): Unit = js.native
    def afterEach(name: String, fn: Func): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: mochaAfterEach = js.native
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def beforeEach(fn: AsyncFunc): Unit = js.native
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def beforeEach(fn: Func): Unit = js.native
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def beforeEach(name: String): Unit = js.native
    def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
    def beforeEach(name: String, fn: Func): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: mochaBeforeEach = js.native
  }
}
