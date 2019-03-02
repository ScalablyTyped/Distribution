package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object giphyDashApiLib {
  type Callback[TResponse] = js.Function2[/* err */ stdLib.Error, /* res */ TResponse, scala.Unit]
}
