package typings.ember.mod.default

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a container for an assortment of testing related functionality
  */
object Test {
  
  @JSImport("ember", "default.Test.Adapter")
  @js.native
  class Adapter_ ()
    extends typings.ember.mod.Ember.Test.Adapter_
  
  @JSImport("ember", "default.Test.Promise")
  @js.native
  class Promise_[T] protected ()
    extends typings.ember.mod.Ember.Test.Promise_[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  
  /**
    * This class implements the methods defined by Ember.Test.Adapter for the
    * QUnit testing framework.
    */
  @JSImport("ember", "default.Test.QUnitAdapter")
  @js.native
  class QUnitAdapter ()
    extends typings.ember.mod.Ember.Test.QUnitAdapter
  
  /**
    * Used to allow ember-testing to communicate with a specific testing
    * framework.
    */
  @JSImport("ember", "default.Test.adapter")
  @js.native
  val adapter: typings.emberTest.adapterMod.default = js.native
  
  /**
    * Iterates through each registered test waiter, and invokes
    * its callback. If any waiter returns false, this method will return
    * true indicating that the waiters have not settled yet.
    */
  @JSImport("ember", "default.Test.checkWaiters")
  @js.native
  def checkWaiters(): Boolean = js.native
  
  /**
    * Used to register callbacks to be fired whenever `App.injectTestHelpers`
    * is called.
    */
  @JSImport("ember", "default.Test.onInjectHelpers")
  @js.native
  def onInjectHelpers(callback: js.Function1[/* app */ typings.ember.mod.Ember.Application, Unit]): Unit = js.native
  
  /**
    * This returns a thenable tailored for testing.  It catches failed
    * `onSuccess` callbacks and invokes the `Ember.Test.adapter.exception`
    * callback in the last chained then.
    */
  @JSImport("ember", "default.Test.promise")
  @js.native
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  @JSImport("ember", "default.Test.promise")
  @js.native
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    label: java.lang.String
  ): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  
  /* was `typeof EmberTestNs.registerAsyncHelper` */
  @JSImport("ember", "default.Test.registerAsyncHelper")
  @js.native
  def registerAsyncHelper(
    name: java.lang.String,
    helperMethod: js.Function2[/* app */ typings.emberApplication.mod.default, /* repeated */ js.Any, _]
  ): Unit = js.native
  
  /* was `typeof EmberTestNs.registerHelper` */
  @JSImport("ember", "default.Test.registerHelper")
  @js.native
  def registerHelper(
    name: java.lang.String,
    helperMethod: js.Function2[/* app */ typings.emberApplication.mod.default, /* repeated */ js.Any, _]
  ): js.Any = js.native
  /* was `typeof EmberTestNs.registerHelper` */
  @JSImport("ember", "default.Test.registerHelper")
  @js.native
  def registerHelper(
    name: java.lang.String,
    helperMethod: js.Function2[/* app */ typings.emberApplication.mod.default, /* repeated */ js.Any, _],
    options: js.Object
  ): js.Any = js.native
  
  /* was `typeof EmberTestNs.registerWaiter` */
  @JSImport("ember", "default.Test.registerWaiter")
  @js.native
  def registerWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  /* was `typeof EmberTestNs.registerWaiter` */
  @JSImport("ember", "default.Test.registerWaiter")
  @js.native
  def registerWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
  
  /**
    * Replacement for `Ember.RSVP.resolve`
    * The only difference is this uses
    * an instance of `Ember.Test.Promise`
    */
  @JSImport("ember", "default.Test.resolve")
  @js.native
  def resolve[T](): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  @JSImport("ember", "default.Test.resolve")
  @js.native
  def resolve[T](value: T): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  @JSImport("ember", "default.Test.resolve")
  @js.native
  def resolve[T](value: T, label: java.lang.String): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  @JSImport("ember", "default.Test.resolve")
  @js.native
  def resolve[T](value: js.UndefOr[scala.Nothing], label: java.lang.String): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  @JSImport("ember", "default.Test.resolve")
  @js.native
  def resolve[T](value: js.Thenable[T]): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  @JSImport("ember", "default.Test.resolve")
  @js.native
  def resolve[T](value: js.Thenable[T], label: java.lang.String): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  
  /* was `typeof EmberTestNs.unregisterHelper` */
  @JSImport("ember", "default.Test.unregisterHelper")
  @js.native
  def unregisterHelper(name: java.lang.String): Unit = js.native
  
  /* was `typeof EmberTestNs.unregisterWaiter` */
  @JSImport("ember", "default.Test.unregisterWaiter")
  @js.native
  def unregisterWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  /* was `typeof EmberTestNs.unregisterWaiter` */
  @JSImport("ember", "default.Test.unregisterWaiter")
  @js.native
  def unregisterWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
}
