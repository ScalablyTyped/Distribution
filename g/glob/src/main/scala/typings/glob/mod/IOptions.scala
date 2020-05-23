package typings.glob.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.anon.IsDirectory
import typings.glob.globBooleans.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typings.minimatch.mod.IOptions {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[StringDictionary[Boolean | DIR | FILE | js.Array[String]]] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var mark: js.UndefOr[Boolean] = js.undefined
  var nodir: js.UndefOr[Boolean] = js.undefined
  var nomount: js.UndefOr[Boolean] = js.undefined
  var nosort: js.UndefOr[Boolean] = js.undefined
  var nounique: js.UndefOr[Boolean] = js.undefined
  var realpath: js.UndefOr[Boolean] = js.undefined
  var realpathCache: js.UndefOr[StringDictionary[String]] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stat: js.UndefOr[Boolean] = js.undefined
  var statCache: js.UndefOr[StringDictionary[js.UndefOr[`false` | IsDirectory]]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var symlinks: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = null,
    cwd: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    ignore: String | js.Array[String] = null,
    mark: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
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
    statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    symlinks: StringDictionary[js.UndefOr[Boolean]] = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique.get.asInstanceOf[js.Any])
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath.get.asInstanceOf[js.Any])
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat.get.asInstanceOf[js.Any])
    if (statCache != null) __obj.updateDynamic("statCache")(statCache.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

