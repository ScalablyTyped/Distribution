package typings.fsDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashPromiseMod {
  import typings.fsDashPromise.JsonReplacerArray

  type JsonReplacer = JsonReplacerArray | JsonReplacerFunction
  type JsonReplacerFunction = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
