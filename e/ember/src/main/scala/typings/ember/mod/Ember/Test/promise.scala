package typings.ember.mod.Ember.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "Ember.Test.promise")
@js.native
object promise extends js.Object {
  
  /**
    * This returns a thenable tailored for testing.  It catches failed
    * `onSuccess` callbacks and invokes the `Ember.Test.adapter.exception`
    * callback in the last chained then.
    */
  def apply[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Promise_[T] = js.native
  def apply[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    label: String
  ): Promise_[T] = js.native
}
