package typings.fsDashExtra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashExtraMod {
  type CopyFilterAsync = js.Function2[/* src */ String, /* dest */ String, js.Promise[Boolean]]
  type CopyFilterSync = js.Function2[/* src */ String, /* dest */ String, Boolean]
}
