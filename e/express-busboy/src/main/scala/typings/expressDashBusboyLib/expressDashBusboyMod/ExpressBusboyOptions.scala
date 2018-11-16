package typings
package expressDashBusboyLib.expressDashBusboyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExpressBusboyOptions
  extends connectDashBusboyLib.connectDashBusboyMod.connectBusboyNs.ConnectBusboyOptions {
  var allowedPath: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var mimeTypeLimit: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var restrictMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var upload: js.UndefOr[scala.Double] = js.undefined
}

