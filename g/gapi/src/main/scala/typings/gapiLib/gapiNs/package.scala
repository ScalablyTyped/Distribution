package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gapiNs {
  type CallbackOrConfig = LoadConfig | LoadCallback
  type LoadCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
}
