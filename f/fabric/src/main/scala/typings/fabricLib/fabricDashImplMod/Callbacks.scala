package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  /** Invoked on every step of animation */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /** Invoked on completion */
  var onComplete: js.UndefOr[js.Function] = js.undefined
}

