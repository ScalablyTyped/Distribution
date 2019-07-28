package typings.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callbackMod {
  type Callback = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
}
