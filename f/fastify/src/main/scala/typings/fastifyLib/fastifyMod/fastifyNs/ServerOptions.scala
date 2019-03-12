package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var bodyLimit: js.UndefOr[scala.Double] = js.undefined
  var ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var maxParamLength: js.UndefOr[scala.Double] = js.undefined
  var onProtoPoisoning: js.UndefOr[
    fastifyLib.fastifyLibStrings.error | fastifyLib.fastifyLibStrings.remove | fastifyLib.fastifyLibStrings.ignore
  ] = js.undefined
  var querystringParser: js.UndefOr[
    js.Function1[
      /* str */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
    ]
  ] = js.undefined
  var trustProxy: js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String] | TrustProxyFunction
  ] = js.undefined
  var versioning: js.UndefOr[fastifyLib.Anon_Ctx] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    bodyLimit: scala.Int | scala.Double = null,
    ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    logger: js.Any = null,
    maxParamLength: scala.Int | scala.Double = null,
    onProtoPoisoning: fastifyLib.fastifyLibStrings.error | fastifyLib.fastifyLibStrings.remove | fastifyLib.fastifyLibStrings.ignore = null,
    querystringParser: /* str */ java.lang.String => org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    trustProxy: java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String] | TrustProxyFunction = null,
    versioning: fastifyLib.Anon_Ctx = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxParamLength != null) __obj.updateDynamic("maxParamLength")(maxParamLength.asInstanceOf[js.Any])
    if (onProtoPoisoning != null) __obj.updateDynamic("onProtoPoisoning")(onProtoPoisoning.asInstanceOf[js.Any])
    if (querystringParser != null) __obj.updateDynamic("querystringParser")(js.Any.fromFunction1(querystringParser))
    if (trustProxy != null) __obj.updateDynamic("trustProxy")(trustProxy.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    __obj.asInstanceOf[ServerOptions]
  }
}

