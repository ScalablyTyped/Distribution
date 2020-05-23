package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBuilderConfig extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[WebTheme | String] = js.undefined
  var urls: js.UndefOr[WebBuilderUrls] = js.undefined
}

object WebBuilderConfig {
  @scala.inline
  def apply(
    concurrency: js.UndefOr[Double] = js.undefined,
    dest: String = null,
    ext: String = null,
    theme: WebTheme | String = null,
    urls: WebBuilderUrls = null
  ): WebBuilderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBuilderConfig]
  }
}

