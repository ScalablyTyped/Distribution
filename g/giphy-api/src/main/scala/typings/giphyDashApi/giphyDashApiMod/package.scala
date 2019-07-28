package typings.giphyDashApi

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object giphyDashApiMod {
  type Callback[TResponse] = js.Function2[/* err */ Error, /* res */ TResponse, Unit]
}
