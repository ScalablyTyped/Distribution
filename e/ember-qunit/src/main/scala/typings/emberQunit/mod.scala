package typings.emberQunit

import typings.ember.mod.default.Resolver
import typings.ember.mod.default.Test.Adapter_
import typings.emberQunit.mod.global.NestedHooks
import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.emberTestHelpers.mod.TestContext
import typings.qunit.mod.global.Assert
import typings.qunit.mod.global.Hooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ember-qunit", "QUnitAdapter")
  @js.native
  class QUnitAdapter () extends Adapter_
  
  @JSImport("ember-qunit", "moduleFor")
  @js.native
  def moduleFor(fullName: String): Unit = js.native
  @JSImport("ember-qunit", "moduleFor")
  @js.native
  def moduleFor(fullName: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  @JSImport("ember-qunit", "moduleFor")
  @js.native
  def moduleFor(fullName: String, description: String): Unit = js.native
  @JSImport("ember-qunit", "moduleFor")
  @js.native
  def moduleFor(fullName: String, description: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  
  @JSImport("ember-qunit", "moduleForComponent")
  @js.native
  def moduleForComponent(fullName: String): Unit = js.native
  @JSImport("ember-qunit", "moduleForComponent")
  @js.native
  def moduleForComponent(fullName: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  @JSImport("ember-qunit", "moduleForComponent")
  @js.native
  def moduleForComponent(fullName: String, description: String): Unit = js.native
  @JSImport("ember-qunit", "moduleForComponent")
  @js.native
  def moduleForComponent(fullName: String, description: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  
  @JSImport("ember-qunit", "moduleForModel")
  @js.native
  def moduleForModel(fullName: String): Unit = js.native
  @JSImport("ember-qunit", "moduleForModel")
  @js.native
  def moduleForModel(fullName: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  @JSImport("ember-qunit", "moduleForModel")
  @js.native
  def moduleForModel(fullName: String, description: String): Unit = js.native
  @JSImport("ember-qunit", "moduleForModel")
  @js.native
  def moduleForModel(fullName: String, description: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  
  @JSImport("ember-qunit", "setResolver")
  @js.native
  def setResolver(resolver: Resolver): Unit = js.native
  
  @JSImport("ember-qunit", "setupApplicationTest")
  @js.native
  def setupApplicationTest(hooks: NestedHooks): Unit = js.native
  @JSImport("ember-qunit", "setupApplicationTest")
  @js.native
  def setupApplicationTest(hooks: NestedHooks, options: SetupTestOptions): Unit = js.native
  
  @JSImport("ember-qunit", "setupRenderingTest")
  @js.native
  def setupRenderingTest(hooks: NestedHooks): Unit = js.native
  @JSImport("ember-qunit", "setupRenderingTest")
  @js.native
  def setupRenderingTest(hooks: NestedHooks, options: SetupTestOptions): Unit = js.native
  
  @JSImport("ember-qunit", "setupTest")
  @js.native
  def setupTest(hooks: NestedHooks): Unit = js.native
  @JSImport("ember-qunit", "setupTest")
  @js.native
  def setupTest(hooks: NestedHooks, options: SetupTestOptions): Unit = js.native
  
  @JSImport("ember-qunit", "start")
  @js.native
  def start(): Unit = js.native
  @JSImport("ember-qunit", "start")
  @js.native
  def start(options: QUnitStartOptions): Unit = js.native
  
  @js.native
  trait QUnitModuleCallbacks
    extends ModuleCallbacks
       with Hooks {
    
    @JSName("afterTeardown")
    var afterTeardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
    
    @JSName("beforeSetup")
    var beforeSetup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
    
    @JSName("setup")
    var setup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
    
    @JSName("teardown")
    var teardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  }
  object QUnitModuleCallbacks {
    
    @scala.inline
    def apply(): QUnitModuleCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QUnitModuleCallbacks]
    }
    
    @scala.inline
    implicit class QUnitModuleCallbacksMutableBuilder[Self <: QUnitModuleCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterTeardown(value: /* assert */ Assert => Unit): Self = StObject.set(x, "afterTeardown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterTeardownUndefined: Self = StObject.set(x, "afterTeardown", js.undefined)
      
      @scala.inline
      def setBeforeSetup(value: /* assert */ Assert => Unit): Self = StObject.set(x, "beforeSetup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSetupUndefined: Self = StObject.set(x, "beforeSetup", js.undefined)
      
      @scala.inline
      def setSetup(value: /* assert */ Assert => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setTeardown(value: /* assert */ Assert => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    }
  }
  
  @js.native
  trait QUnitStartOptions extends StObject {
    
    /**
      * If `false` tests will not be loaded automatically.
      */
    var loadTests: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false` validation of `Ember.onerror` will be disabled.
      */
    var setupEmberOnerrorValidation: js.UndefOr[Boolean] = js.native
    
    /**
      * `false` opts out of the default behavior of setting `Ember.testing`
      * to `true` before all tests and back to `false` after each test will.
      */
    var setupEmberTesting: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false` the default Ember.Test adapter will not be updated.
      */
    var setupTestAdapter: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false` the test container will not be setup based on `devmode`,
      * `dockcontainer`, or `nocontainer` URL params.
      */
    var setupTestContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false` test isolation validation will be disabled.
      */
    var setupTestIsolationValidation: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false` tests will not be automatically started (you must run
      * `QUnit.start()` to kick them off).
      */
    var startTests: js.UndefOr[Boolean] = js.native
  }
  object QUnitStartOptions {
    
    @scala.inline
    def apply(): QUnitStartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QUnitStartOptions]
    }
    
    @scala.inline
    implicit class QUnitStartOptionsMutableBuilder[Self <: QUnitStartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadTests(value: Boolean): Self = StObject.set(x, "loadTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadTestsUndefined: Self = StObject.set(x, "loadTests", js.undefined)
      
      @scala.inline
      def setSetupEmberOnerrorValidation(value: Boolean): Self = StObject.set(x, "setupEmberOnerrorValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupEmberOnerrorValidationUndefined: Self = StObject.set(x, "setupEmberOnerrorValidation", js.undefined)
      
      @scala.inline
      def setSetupEmberTesting(value: Boolean): Self = StObject.set(x, "setupEmberTesting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupEmberTestingUndefined: Self = StObject.set(x, "setupEmberTesting", js.undefined)
      
      @scala.inline
      def setSetupTestAdapter(value: Boolean): Self = StObject.set(x, "setupTestAdapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupTestAdapterUndefined: Self = StObject.set(x, "setupTestAdapter", js.undefined)
      
      @scala.inline
      def setSetupTestContainer(value: Boolean): Self = StObject.set(x, "setupTestContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupTestContainerUndefined: Self = StObject.set(x, "setupTestContainer", js.undefined)
      
      @scala.inline
      def setSetupTestIsolationValidation(value: Boolean): Self = StObject.set(x, "setupTestIsolationValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupTestIsolationValidationUndefined: Self = StObject.set(x, "setupTestIsolationValidation", js.undefined)
      
      @scala.inline
      def setStartTests(value: Boolean): Self = StObject.set(x, "startTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTestsUndefined: Self = StObject.set(x, "startTests", js.undefined)
    }
  }
  
  @js.native
  trait SetupTestOptions extends StObject {
    
    /**
      * The resolver to use when instantiating container-managed entities in the test.
      */
    var resolver: js.UndefOr[Resolver] = js.native
  }
  object SetupTestOptions {
    
    @scala.inline
    def apply(): SetupTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetupTestOptions]
    }
    
    @scala.inline
    implicit class SetupTestOptionsMutableBuilder[Self <: SetupTestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait NestedHooks extends StObject {
      
      /**
        * Runs after the last test. If additional tests are defined after the
        * module's queue has emptied, it will not run this hook again.
        */
      def after(fn: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
      
      /**
        * Runs after each test.
        */
      def afterEach(fn: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
      
      /**
        * Runs before the first test.
        */
      def before(fn: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
      
      /**
        * Runs before each test.
        */
      def beforeEach(fn: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
    }
    object NestedHooks {
      
      @scala.inline
      def apply(
        after: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
        afterEach: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
        before: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
        beforeEach: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit
      ): NestedHooks = {
        val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), afterEach = js.Any.fromFunction1(afterEach), before = js.Any.fromFunction1(before), beforeEach = js.Any.fromFunction1(beforeEach))
        __obj.asInstanceOf[NestedHooks]
      }
      
      @scala.inline
      implicit class NestedHooksMutableBuilder[Self <: NestedHooks] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAfter(
          value: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit
        ): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAfterEach(
          value: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit
        ): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBefore(
          value: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit
        ): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBeforeEach(
          value: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]] => Unit
        ): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait QUnit extends StObject {
      
      /**
        * Adds a test to exclusively run, preventing all other tests from running.
        *
        * Use this method to focus your test suite on a specific test. QUnit.only
        * will cause any other tests in your suite to be ignored.
        *
        * Note, that if more than one QUnit.only is present only the first instance
        * will run.
        *
        * This is an alternative to filtering tests to run in the HTML reporter. It
        * is especially useful when you use a console reporter or in a codebase
        * with a large set of long running tests.
        *
        * @param name Title of unit being tested
        * @param callback Function to close over assertions
        */
      def only(
        name: String,
        callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
      ): Unit = js.native
      
      /**
        * Adds a test like object to be skipped.
        *
        * Use this method to replace QUnit.test() instead of commenting out entire
        * tests.
        *
        * This test's prototype will be listed on the suite as a skipped test,
        * ignoring the callback argument and the respective global and module's
        * hooks.
        *
        * @param name Title of unit being tested
        * @param callback Function to close over assertions
        */
      def skip(name: String): Unit = js.native
      def skip(
        name: String,
        callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
      ): Unit = js.native
      
      /**
        * Add a test to run.
        *
        * Add a test to run using `QUnit.test()`.
        *
        * The `assert` argument to the callback contains all of QUnit's assertion
        * methods. Use this argument to call your test assertions.
        *
        * `QUnit.test()` can automatically handle the asynchronous resolution of a
        * Promise on your behalf if you return a thenable Promise as the result of
        * your callback function.
        *
        * @param name Title of unit being tested
        * @param callback Function to close over assertions
        */
      def test(
        name: String,
        callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
      ): Unit = js.native
      
      /**
        * Use this method to test a unit of code which is still under development (in a “todo” state).
        * The test will pass as long as one failing assertion is present.
        *
        * If all assertions pass, then the test will fail signaling that `QUnit.todo` should
        * be replaced by `QUnit.test`.
        *
        * @param name Title of unit being tested
        * @param callback Function to close over assertions
        */
      def todo(
        name: String,
        callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
      ): Unit = js.native
    }
  }
}
