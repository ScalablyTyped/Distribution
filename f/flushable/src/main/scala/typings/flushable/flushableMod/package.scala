package typings.flushable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object flushableMod {
  type FlushableOnCompleteHandler = js.Function1[/* flushed */ Boolean, js.Any]
}
