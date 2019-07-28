package typings.formstate

import org.scalablytyped.runtime.StringDictionary
import typings.formstate.libCoreTypesMod.ComposibleValidatable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreFormStateMod {
  type ValidatableMapOrArray = StringDictionary[ComposibleValidatable[js.Any]] | js.Array[ComposibleValidatable[js.Any]] | (Map[js.Any, ComposibleValidatable[js.Any]])
}
