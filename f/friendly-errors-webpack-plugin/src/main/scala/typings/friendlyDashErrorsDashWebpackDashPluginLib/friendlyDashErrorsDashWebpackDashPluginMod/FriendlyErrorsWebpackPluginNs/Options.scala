package typings
package friendlyDashErrorsDashWebpackDashPluginLib.friendlyDashErrorsDashWebpackDashPluginMod.FriendlyErrorsWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var additionalFormatters: js.UndefOr[
    js.Array[
      js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[java.lang.String]]
    ]
  ] = js.undefined
  var additionalTransformers: js.UndefOr[js.Array[js.Function1[/* error */ _, _]]] = js.undefined
  var clearConsole: js.UndefOr[scala.Boolean] = js.undefined
  var compilationSuccessInfo: js.UndefOr[friendlyDashErrorsDashWebpackDashPluginLib.Anon_Messages] = js.undefined
  var onErrors: js.UndefOr[js.Function2[/* severity */ Severity, /* errors */ java.lang.String, scala.Unit]] = js.undefined
}

