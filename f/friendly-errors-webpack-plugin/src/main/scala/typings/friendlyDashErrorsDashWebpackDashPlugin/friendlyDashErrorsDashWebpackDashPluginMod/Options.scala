package typings.friendlyDashErrorsDashWebpackDashPlugin.friendlyDashErrorsDashWebpackDashPluginMod

import typings.friendlyDashErrorsDashWebpackDashPlugin.Anon_Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var additionalFormatters: js.UndefOr[
    js.Array[
      js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
    ]
  ] = js.undefined
  var additionalTransformers: js.UndefOr[js.Array[js.Function1[/* error */ _, _]]] = js.undefined
  var clearConsole: js.UndefOr[Boolean] = js.undefined
  var compilationSuccessInfo: js.UndefOr[Anon_Messages] = js.undefined
  var onErrors: js.UndefOr[js.Function2[/* severity */ Severity, /* errors */ String, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalFormatters: js.Array[
      js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
    ] = null,
    additionalTransformers: js.Array[js.Function1[/* error */ _, _]] = null,
    clearConsole: js.UndefOr[Boolean] = js.undefined,
    compilationSuccessInfo: Anon_Messages = null,
    onErrors: (/* severity */ Severity, /* errors */ String) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalFormatters != null) __obj.updateDynamic("additionalFormatters")(additionalFormatters)
    if (additionalTransformers != null) __obj.updateDynamic("additionalTransformers")(additionalTransformers)
    if (!js.isUndefined(clearConsole)) __obj.updateDynamic("clearConsole")(clearConsole)
    if (compilationSuccessInfo != null) __obj.updateDynamic("compilationSuccessInfo")(compilationSuccessInfo)
    if (onErrors != null) __obj.updateDynamic("onErrors")(js.Any.fromFunction2(onErrors))
    __obj.asInstanceOf[Options]
  }
}

