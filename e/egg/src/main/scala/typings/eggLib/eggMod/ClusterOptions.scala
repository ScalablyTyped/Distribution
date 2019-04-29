package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  /** ssl cert */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[java.lang.String] = js.undefined
  /** https or not */
  var https: js.UndefOr[scala.Boolean] = js.undefined
  /** ssl key */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** customized plugins, for unittest */
  var plugins: js.UndefOr[js.Object | scala.Null] = js.undefined
  /** listening port, default to 7001(http) or 8443(https) */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** numbers of app workers, default to `os.cpus().length` */
  var workers: js.UndefOr[scala.Double] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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

