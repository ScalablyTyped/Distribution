package typings
package globuleLib.globuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingOptions extends FindOptions {
  var destBase: js.UndefOr[java.lang.String] = js.undefined
  var ext: js.UndefOr[java.lang.String] = js.undefined
  var extDot: js.UndefOr[globuleLib.globuleLibStrings.first | globuleLib.globuleLibStrings.last] = js.undefined
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  var rename: js.UndefOr[js.Function1[/* p */ java.lang.String, java.lang.String]] = js.undefined
}

object MappingOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    cache: org.scalablytyped.runtime.StringDictionary[
      scala.Boolean | globLib.globLibStrings.DIR | globLib.globLibStrings.FILE | js.Array[java.lang.String]
    ] = null,
    cwd: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    destBase: java.lang.String = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    ext: java.lang.String = null,
    extDot: globuleLib.globuleLibStrings.first | globuleLib.globuleLibStrings.last = null,
    filter: java.lang.String | (js.Function2[
      /* filepath */ js.UndefOr[java.lang.String], 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]) = null,
    flatten: js.UndefOr[scala.Boolean] = js.undefined,
    flipNegate: js.UndefOr[scala.Boolean] = js.undefined,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    mark: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase_IOptions: js.Any = null,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nocomment: js.UndefOr[scala.Boolean] = js.undefined,
    nodir: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nomount: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined,
    nosort: js.UndefOr[scala.Boolean] = js.undefined,
    nounique: js.UndefOr[scala.Boolean] = js.undefined,
    prefixBase: js.UndefOr[scala.Boolean] = js.undefined,
    realpath: js.UndefOr[scala.Boolean] = js.undefined,
    realpathCache: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    rename: /* p */ java.lang.String => java.lang.String = null,
    root: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    srcBase: java.lang.String = null,
    stat: js.UndefOr[scala.Boolean] = js.undefined,
    statCache: org.scalablytyped.runtime.StringDictionary[js.UndefOr[globLib.globLibNumbers.`false` | globLib.Anon_IsDirectory]] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    symlinks: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]] = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): MappingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (destBase != null) __obj.updateDynamic("destBase")(destBase)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (extDot != null) __obj.updateDynamic("extDot")(extDot.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
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
    if (rename != null) __obj.updateDynamic("rename")(js.Any.fromFunction1(rename))
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcBase != null) __obj.updateDynamic("srcBase")(srcBase)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[MappingOptions]
  }
}

