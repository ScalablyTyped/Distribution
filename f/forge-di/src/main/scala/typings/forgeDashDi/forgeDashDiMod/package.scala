package typings.forgeDashDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forgeDashDiMod {
  import org.scalablytyped.runtime.StringDictionary

  /**
    * Represents arguments to help with resolving a binding.
    */
  type IBindingArguments = StringDictionary[js.Any]
  /** Represents a binding map. */
  type IBindingMap = /** Gets a binding by name. */
  StringDictionary[js.Array[IBinding]]
  /** Represents a predicate. */
  type IPredicate = js.Function1[/* hint */ String, Boolean]
}
