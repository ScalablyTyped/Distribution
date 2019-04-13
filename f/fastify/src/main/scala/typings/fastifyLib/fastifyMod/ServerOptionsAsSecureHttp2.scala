package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fastifyLib.fastifyMod.ServerOptionsAsSecure because var conflicts: bodyLimit, ignoreTrailingSlash, logger, maxParamLength, modifyCoreObjects, onProtoPoisoning, pluginTimeout, querystringParser, trustProxy, versioning. Inlined https */ trait ServerOptionsAsSecureHttp2 extends ServerOptionsAsHttp2 {
  var https: nodeLib.http2Mod.SecureServerOptions
}

object ServerOptionsAsSecureHttp2 {
  @scala.inline
  def apply(
    http2: fastifyLib.fastifyLibNumbers.`true`,
    https: nodeLib.http2Mod.SecureServerOptions,
    bodyLimit: scala.Int | scala.Double = null,
    ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    logger: js.Any = null,
    maxParamLength: scala.Int | scala.Double = null,
    modifyCoreObjects: js.UndefOr[scala.Boolean] = js.undefined,
    onProtoPoisoning: fastifyLib.fastifyLibStrings.error | fastifyLib.fastifyLibStrings.remove | fastifyLib.fastifyLibStrings.ignore = null,
    pluginTimeout: scala.Int | scala.Double = null,
    querystringParser: /* str */ java.lang.String => org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    trustProxy: java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String] | TrustProxyFunction = null,
    versioning: fastifyLib.Anon_Ctx = null
  ): ServerOptionsAsSecureHttp2 = {
    val __obj = js.Dynamic.literal(http2 = http2, https = https)
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxParamLength != null) __obj.updateDynamic("maxParamLength")(maxParamLength.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyCoreObjects)) __obj.updateDynamic("modifyCoreObjects")(modifyCoreObjects)
    if (onProtoPoisoning != null) __obj.updateDynamic("onProtoPoisoning")(onProtoPoisoning.asInstanceOf[js.Any])
    if (pluginTimeout != null) __obj.updateDynamic("pluginTimeout")(pluginTimeout.asInstanceOf[js.Any])
    if (querystringParser != null) __obj.updateDynamic("querystringParser")(js.Any.fromFunction1(querystringParser))
    if (trustProxy != null) __obj.updateDynamic("trustProxy")(trustProxy.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    __obj.asInstanceOf[ServerOptionsAsSecureHttp2]
  }
}

