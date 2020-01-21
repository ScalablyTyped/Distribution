package typings.fsExtra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CopyFilterAsync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, js.Promise[scala.Boolean]]
  type CopyFilterSync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Boolean]
}
