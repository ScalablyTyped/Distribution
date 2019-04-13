package typings
package findupDashSyncLib.findupDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends micromatchLib.micromatchMod.Options {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basename: js.UndefOr[scala.Boolean] = js.undefined,
    bash: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    failglob: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nodupes: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined,
    nullglob: js.UndefOr[scala.Boolean] = js.undefined,
    snapdragon: js.Object = null,
    sourcemap: js.UndefOr[scala.Boolean] = js.undefined,
    unescape: js.UndefOr[scala.Boolean] = js.undefined,
    unixify: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basename)) __obj.updateDynamic("basename")(basename)
    if (!js.isUndefined(bash)) __obj.updateDynamic("bash")(bash)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(failglob)) __obj.updateDynamic("failglob")(failglob)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nodupes)) __obj.updateDynamic("nodupes")(nodupes)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nullglob)) __obj.updateDynamic("nullglob")(nullglob)
    if (snapdragon != null) __obj.updateDynamic("snapdragon")(snapdragon)
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap)
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape)
    if (!js.isUndefined(unixify)) __obj.updateDynamic("unixify")(unixify)
    __obj.asInstanceOf[Options]
  }
}

