package typings.flat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FlatTypes {
  type Unflatten = js.Function2[
    /* target */ js.Any, 
    /* options */ js.UndefOr[typings.flat.mod.FlatTypes.UnflattenOptions], 
    js.Any
  ]
}
