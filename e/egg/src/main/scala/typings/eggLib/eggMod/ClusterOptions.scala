package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions
  extends   // ssl cert
// typescript?: boolean;
/* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
   // specify framework that can be absolute path or npm package
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
   //ssl key
  var cert: js.UndefOr[java.lang.String] = js.undefined
  var framework: js.UndefOr[java.lang.String] = js.undefined
    // listening port, default to 7001(http) or 8443(https)
  var https: js.UndefOr[scala.Boolean] = js.undefined
    // https or not
  var key: js.UndefOr[java.lang.String] = js.undefined
   // directory of application, default to `process.cwd()`
  var plugins: js.UndefOr[js.Object | scala.Null] = js.undefined
   // numbers of app workers, default to `os.cpus().length`
  var port: js.UndefOr[scala.Double] = js.undefined
   // customized plugins, for unittest
  var workers: js.UndefOr[scala.Double] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    StringDictionary:   // ssl cert
  // typescript?: boolean;
  /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    baseDir: java.lang.String = null,
    cert: java.lang.String = null,
    framework: java.lang.String = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    plugins: js.Object = null,
    port: scala.Int | scala.Double = null,
    workers: scala.Int | scala.Double = null
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (key != null) __obj.updateDynamic("key")(key)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

