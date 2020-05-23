package typings.dotenvWebpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Adds support for dotenv-defaults. If set to `true`, uses `./.env.defaults`. If a `string`, uses that location for a defaults file.
    * Read more at https://www.npmjs.com/package/dotenv-defaults. Default: `false`.
    */
  var defaults: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Allows your variables to be "expanded" for reusability within your .env file. Default: `false`.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  /**
    * The path to your environment variables. Default: `'./.env'`.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * If `false` ignore safe-mode, if `true` load `'./.env.example'`, if a `string` load that file as the sample. Default: `false`.
    */
  var safe: js.UndefOr[Boolean | String] = js.undefined
  /**
    * If `true`, all warnings will be surpressed. Default: `false`.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` if you would rather load all system variables as well (useful for CI purposes). Default: `false`.
    */
  var systemvars: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaults: Boolean | String = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    safe: Boolean | String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    systemvars: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(systemvars)) __obj.updateDynamic("systemvars")(systemvars.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

