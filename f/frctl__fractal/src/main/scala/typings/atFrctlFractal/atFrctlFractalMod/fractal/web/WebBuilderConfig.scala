package typings.atFrctlFractal.atFrctlFractalMod.fractal.web

import typings.atFrctlFractal.atFrctlFractalMod.WebTheme
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
    concurrency: Int | Double = null,
    dest: String = null,
    ext: String = null,
    theme: WebTheme | String = null,
    urls: WebBuilderUrls = null
  ): WebBuilderConfig = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[WebBuilderConfig]
  }
}

