package typings.dexie.dexieMod.default

import typings.dexie.dexieMod.Dexie.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Promise")
@js.native
class PromiseCls[T] protected () extends Promise[T] {
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}

