package typings
package globDashExpandLib.globDashExpandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[
    java.lang.String | (js.Function1[/* filePath */ java.lang.String, scala.Boolean])
  ] = js.undefined
}

