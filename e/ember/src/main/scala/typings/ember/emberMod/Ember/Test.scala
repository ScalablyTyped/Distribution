package typings.ember.emberMod.Ember

import typings.ember.emberMod.Ember.Test.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a container for an assortment of testing related functionality
  */
@JSImport("ember", "Ember.Test")
@js.native
object Test extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberTestAdapter * / any */ @js.native
  class Adapter () extends js.Object
  
  @js.native
  class Promise[T] protected ()
    extends typings.rsvp.rsvpMod.default.Promise[T] {
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
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberTestAdapter * / any */ @js.native
  class QUnitAdapter () extends js.Object
  
  /**
    * Used to allow ember-testing to communicate with a specific testing
    * framework.
    */
  val adapter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EmberTestAdapter */ js.Any = js.native
  val registerAsyncHelper: js.Function2[
    /* name */ java.lang.String, 
    /* helperMethod */ js.Function2[
      /* app */ typings.atEmberApplication.atEmberApplicationMod.default, 
      /* repeated */ js.Any, 
      js.Any
    ], 
    Unit
  ] = js.native
  val unregisterHelper: js.Function1[/* name */ java.lang.String, Unit] = js.native
  /**
    * Iterates through each registered test waiter, and invokes
    * its callback. If any waiter returns false, this method will return
    * true indicating that the waiters have not settled yet.
    */
  def checkWaiters(): Boolean = js.native
  /**
    * Used to register callbacks to be fired whenever `App.injectTestHelpers`
    * is called.
    */
  def onInjectHelpers(callback: js.Function1[/* app */ Application, Unit]): Unit = js.native
  /**
    * This returns a thenable tailored for testing.  It catches failed
    * `onSuccess` callbacks and invokes the `Ember.Test.adapter.exception`
    * callback in the last chained then.
    */
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Promise[T] = js.native
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    label: java.lang.String
  ): Promise[T] = js.native
  /**
    * Replacement for `Ember.RSVP.resolve`
    * The only difference is this uses
    * an instance of `Ember.Test.Promise`
    */
  def resolve[T](): Promise[T] = js.native
  def resolve[T](value: T): Promise[T] = js.native
  def resolve[T](value: T, label: java.lang.String): Promise[T] = js.native
  def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
  def resolve[T](value: js.Thenable[T], label: java.lang.String): Promise[T] = js.native
  @js.native
  object registerHelper extends js.Object {
    def apply(
      name: java.lang.String,
      helperMethod: js.Function2[
          /* app */ typings.atEmberApplication.atEmberApplicationMod.default, 
          /* repeated */ js.Any, 
          _
        ]
    ): js.Any = js.native
    def apply(
      name: java.lang.String,
      helperMethod: js.Function2[
          /* app */ typings.atEmberApplication.atEmberApplicationMod.default, 
          /* repeated */ js.Any, 
          _
        ],
      options: js.Object
    ): js.Any = js.native
  }
  
  @js.native
  object registerWaiter extends js.Object {
    def apply(callback: js.Function0[Boolean]): js.Any = js.native
    def apply[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
  }
  
  @js.native
  object unregisterWaiter extends js.Object {
    def apply(callback: js.Function0[Boolean]): js.Any = js.native
    def apply[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
  }
  
}

