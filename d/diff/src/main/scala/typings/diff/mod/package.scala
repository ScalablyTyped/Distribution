package typings.diff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* err */ js.UndefOr[scala.Nothing], 
    /* value */ js.UndefOr[js.Array[typings.diff.mod.Change]], 
    scala.Unit
  ]
}
