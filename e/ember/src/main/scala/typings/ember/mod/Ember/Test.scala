package typings.ember.mod.Ember

import typings.emberTest.adapterMod.default
import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a container for an assortment of testing related functionality
  */
object Test {
  
  @JSImport("ember", "Ember.Test.Adapter")
  @js.native
  class Adapter_ () extends default
  
  @JSImport("ember", "Ember.Test.Promise")
  @js.native
  class Promise_[T] protected () extends Promise[T] {
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
  @JSImport("ember", "Ember.Test.QUnitAdapter")
  @js.native
  class QUnitAdapter () extends default
  
  /**
    * Used to allow ember-testing to communicate with a specific testing
    * framework.
    */
  @JSImport("ember", "Ember.Test.adapter")
  @js.native
  val adapter: default = js.native
  
  /**
    * Iterates through each registered test waiter, and invokes
    * its callback. If any waiter returns false, this method will return
    * true indicating that the waiters have not settled yet.
    */
  @JSImport("ember", "Ember.Test.checkWaiters")
  @js.native
  def checkWaiters(): Boolean = js.native
  
  /**
    * Used to register callbacks to be fired whenever `App.injectTestHelpers`
    * is called.
    */
  @JSImport("ember", "Ember.Test.onInjectHelpers")
  @js.native
  def onInjectHelpers(callback: js.Function1[/* app */ Application, Unit]): Unit = js.native
  
  /**
    * This returns a thenable tailored for testing.  It catches failed
    * `onSuccess` callbacks and invokes the `Ember.Test.adapter.exception`
    * callback in the last chained then.
    */
  @JSImport("ember", "Ember.Test.promise")
  @js.native
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Promise_[T] = js.native
  @JSImport("ember", "Ember.Test.promise")
  @js.native
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    label: java.lang.String
  ): Promise_[T] = js.native
  
  /* was `typeof EmberTestNs.registerAsyncHelper` */
  @JSImport("ember", "Ember.Test.registerAsyncHelper")
  @js.native
  def registerAsyncHelper(
    name: java.lang.String,
    helperMethod: js.Function2[/* app */ typings.emberApplication.mod.default, /* repeated */ js.Any, _]
  ): Unit = js.native
  
  /* was `typeof EmberTestNs.registerHelper` */
  @JSImport("ember", "Ember.Test.registerHelper")
  @js.native
  def registerHelper(
    name: java.lang.String,
    helperMethod: js.Function2[/* app */ typings.emberApplication.mod.default, /* repeated */ js.Any, _]
  ): js.Any = js.native
  /* was `typeof EmberTestNs.registerHelper` */
  @JSImport("ember", "Ember.Test.registerHelper")
  @js.native
  def registerHelper(
    name: java.lang.String,
    helperMethod: js.Function2[/* app */ typings.emberApplication.mod.default, /* repeated */ js.Any, _],
    options: js.Object
  ): js.Any = js.native
  
  /* was `typeof EmberTestNs.registerWaiter` */
  @JSImport("ember", "Ember.Test.registerWaiter")
  @js.native
  def registerWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  /* was `typeof EmberTestNs.registerWaiter` */
  @JSImport("ember", "Ember.Test.registerWaiter")
  @js.native
  def registerWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
  
  /**
    * Replacement for `Ember.RSVP.resolve`
    * The only difference is this uses
    * an instance of `Ember.Test.Promise`
    */
  @JSImport("ember", "Ember.Test.resolve")
  @js.native
  def resolve[T](): Promise_[T] = js.native
  @JSImport("ember", "Ember.Test.resolve")
  @js.native
  def resolve[T](value: T): Promise_[T] = js.native
  @JSImport("ember", "Ember.Test.resolve")
  @js.native
  def resolve[T](value: T, label: java.lang.String): Promise_[T] = js.native
  @JSImport("ember", "Ember.Test.resolve")
  @js.native
  def resolve[T](value: js.UndefOr[scala.Nothing], label: java.lang.String): Promise_[T] = js.native
  @JSImport("ember", "Ember.Test.resolve")
  @js.native
  def resolve[T](value: js.Thenable[T]): Promise_[T] = js.native
  @JSImport("ember", "Ember.Test.resolve")
  @js.native
  def resolve[T](value: js.Thenable[T], label: java.lang.String): Promise_[T] = js.native
  
  /* was `typeof EmberTestNs.unregisterHelper` */
  @JSImport("ember", "Ember.Test.unregisterHelper")
  @js.native
  def unregisterHelper(name: java.lang.String): Unit = js.native
  
  /* was `typeof EmberTestNs.unregisterWaiter` */
  @JSImport("ember", "Ember.Test.unregisterWaiter")
  @js.native
  def unregisterWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  /* was `typeof EmberTestNs.unregisterWaiter` */
  @JSImport("ember", "Ember.Test.unregisterWaiter")
  @js.native
  def unregisterWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
}
