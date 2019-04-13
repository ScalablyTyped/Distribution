package typings
package forgeDashDiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forgeDashDiMod {
  /**
    * Represents arguments to help with resolving a binding.
    */
  type IBindingArguments = org.scalablytyped.runtime.StringDictionary[js.Any]
  /** Represents a binding map. */
  type IBindingMap = /** Gets a binding by name. */
  org.scalablytyped.runtime.StringDictionary[js.Array[IBinding]]
  /** Represents a predicate. */
  type IPredicate = js.Function1[/* hint */ java.lang.String, scala.Boolean]
}
