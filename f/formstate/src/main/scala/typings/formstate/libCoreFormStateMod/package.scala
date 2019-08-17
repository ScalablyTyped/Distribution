package typings.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreFormStateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.formstate.libCoreTypesMod.ComposibleValidatable
  import typings.std.Map

  type ValidatableMapOrArray = StringDictionary[ComposibleValidatable[js.Any]] | js.Array[ComposibleValidatable[js.Any]] | (Map[js.Any, ComposibleValidatable[js.Any]])
}
