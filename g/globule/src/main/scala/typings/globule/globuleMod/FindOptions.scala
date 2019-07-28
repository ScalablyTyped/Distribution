package typings.globule.globuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.Anon_IsDirectory
import typings.glob.globMod.IOptions
import typings.glob.globNumbers.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends IOptions {
  var filter: js.UndefOr[
    String | (js.Function2[/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], Boolean])
  ] = js.undefined
  var prefixBase: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcBase: js.UndefOr[String] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = null,
    cwd: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    filter: String | (js.Function2[/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], Boolean]) = null,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    ignore: String | js.Array[String] = null,
    mark: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    matchBase_IOptions: js.Any = null,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nocomment: js.UndefOr[Boolean] = js.undefined,
    nodir: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nomount: js.UndefOr[Boolean] = js.undefined,
    nonegate: js.UndefOr[Boolean] = js.undefined,
    nonull: js.UndefOr[Boolean] = js.undefined,
    nosort: js.UndefOr[Boolean] = js.undefined,
    nounique: js.UndefOr[Boolean] = js.undefined,
    prefixBase: js.UndefOr[Boolean] = js.undefined,
    realpath: js.UndefOr[Boolean] = js.undefined,
    realpathCache: StringDictionary[String] = null,
    root: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    srcBase: String = null,
    stat: js.UndefOr[Boolean] = js.undefined,
    statCache: StringDictionary[js.UndefOr[`false` | Anon_IsDirectory]] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    symlinks: StringDictionary[js.UndefOr[Boolean]] = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (matchBase_IOptions != null) __obj.updateDynamic("matchBase")(matchBase_IOptions)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique)
    if (!js.isUndefined(prefixBase)) __obj.updateDynamic("prefixBase")(prefixBase)
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcBase != null) __obj.updateDynamic("srcBase")(srcBase)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[FindOptions]
  }
}

