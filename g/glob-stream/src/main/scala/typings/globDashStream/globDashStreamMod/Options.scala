package typings.globDashStream.globDashStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.Anon_IsDirectory
import typings.glob.globMod.IOptions
import typings.glob.globNumbers.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends IOptions {
  /**
    * Whether or not to error upon an empty singular glob.
    */
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * The absolute segment of the glob path that isn't a glob. This value is attached
    * to each globobject and is useful for relative pathing.
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the `cwd` and `base` should be the same.
    */
  var cwdbase: js.UndefOr[Boolean] = js.undefined
  /**
    * Filters stream to remove duplicates based on the string property name or the result of function.
    * When using a function, the function receives the streamed
    * data (objects containing `cwd`, `base`, `path` properties) to compare against.
    */
  var uniqueBy: js.UndefOr[UniqueByStringPredicate | UniqueByFunctionPredicate] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = null,
    cwd: String = null,
    cwdbase: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
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
    realpath: js.UndefOr[Boolean] = js.undefined,
    realpathCache: StringDictionary[String] = null,
    root: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stat: js.UndefOr[Boolean] = js.undefined,
    statCache: StringDictionary[js.UndefOr[`false` | Anon_IsDirectory]] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    symlinks: StringDictionary[js.UndefOr[Boolean]] = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniqueBy: UniqueByStringPredicate | UniqueByFunctionPredicate = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (base != null) __obj.updateDynamic("base")(base)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(cwdbase)) __obj.updateDynamic("cwdbase")(cwdbase)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
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
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (uniqueBy != null) __obj.updateDynamic("uniqueBy")(uniqueBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

