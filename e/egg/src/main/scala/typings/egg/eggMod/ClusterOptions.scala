package typings.egg.eggMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions
  extends /* prop */ StringDictionary[js.Any] {
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[String] = js.undefined
  /** ssl cert */
  var cert: js.UndefOr[String] = js.undefined
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[String] = js.undefined
  /** https or not */
  var https: js.UndefOr[Boolean] = js.undefined
  /** ssl key */
  var key: js.UndefOr[String] = js.undefined
  /** customized plugins, for unittest */
  var plugins: js.UndefOr[js.Object | Null] = js.undefined
  /** listening port, default to 7001(http) or 8443(https) */
  var port: js.UndefOr[Double] = js.undefined
  /** numbers of app workers, default to `os.cpus().length` */
  var workers: js.UndefOr[Double] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    baseDir: String = null,
    cert: String = null,
    framework: String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    plugins: js.Object = null,
    port: Int | Double = null,
    workers: Int | Double = null
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

