package typings
package dotenvDashWebpackLib.dotenvDashWebpackMod.DotenvWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
       * The path to your environment variables. Default: `'./.env'`.
       */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If `false` ignore safe-mode, if `true` load `'./.env.example'`, if a `string` load that file as the sample. Default: `false`.
       */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If `true`, all warnings will be surpressed. Default: `false`.
       */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set to `true` if you would rather load all system variables as well (useful for CI purposes). Default: `false`.
       */
  var systemvars: js.UndefOr[scala.Boolean] = js.undefined
}

