package typings.giphyDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object giphyDashApiMod {
  import typings.std.Error

  type Callback[TResponse] = js.Function2[/* err */ Error, /* res */ TResponse, Unit]
}
