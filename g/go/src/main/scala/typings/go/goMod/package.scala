package typings.go

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object goMod {
  import org.scalablytyped.runtime.Instantiable1

  /** A string in place of a Brush object is treated as a Solid Brush of that color. */
  type BrushLike = Brush | String
  /** A constructor */
  type Constructor = Instantiable1[/* args (repeated) */ js.Any, js.Object]
  /** A Key is the type of the unique identifier managed by Models for each node data object. */
  type Key = String | Double
  /** A number in place of a Margin object is treated as a uniform Margin with that thickness */
  type MarginLike = Margin | Double
  /** Either name a property or get the value of a property from an object. */
  type PropertyAccessor = String | (js.Function2[/* data */ js.Any, /* newval */ js.Any, js.Any])
}
