package typings
package diffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diffMod {
  type Callback = js.Function2[
    /* err */ js.UndefOr[scala.Nothing], 
    /* value */ js.UndefOr[js.Array[Change]], 
    scala.Unit
  ]
}
