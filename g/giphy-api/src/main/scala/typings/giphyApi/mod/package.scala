package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[TResponse] = js.Function2[/* err */ typings.std.Error, /* res */ TResponse, scala.Unit]
}
