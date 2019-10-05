package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gapi {
  type CallbackOrConfig = LoadConfig | LoadCallback
  type LoadCallback = js.Function1[/* repeated */ js.Any, Unit]
}
