package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobbyOptions
  extends fastDashGlobLib.outSettingsMod.Options {
  /**
  		If set to `true`, `globby` will automatically glob directories for you. If you define an `Array` it will only glob files that matches the patterns inside the `Array`. You can also define an `Object` with `files` and `extensions` like in the example below.
  		Note that if you set this option to `false`, you won't get back matched directories unless you set `onlyFiles: false`.
  		@default true
  		@example
  		```
  		import globby = require('globby');
  		(async () => {
  			const paths = await globby('images', {
  				expandDirectories: {
  					files: ['cat', 'unicorn', '*.jpg'],
  					extensions: ['png']
  				}
  			});
  			console.log(paths);
  			//=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
  		})();
  		```
  		*/
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
  /**
  		Respect ignore patterns in `.gitignore` files that apply to the globbed files.
  		@default false
  		*/
  val gitignore: js.UndefOr[scala.Boolean] = js.undefined
}

object GlobbyOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    baseNameMatch: js.UndefOr[scala.Boolean] = js.undefined,
    braceExpansion: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitiveMatch: js.UndefOr[scala.Boolean] = js.undefined,
    concurrency: scala.Int | scala.Double = null,
    cwd: java.lang.String = null,
    deep: scala.Int | scala.Double = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    expandDirectories: ExpandDirectoriesOption = null,
    extglob: js.UndefOr[scala.Boolean] = js.undefined,
    followSymbolicLinks: js.UndefOr[scala.Boolean] = js.undefined,
    fs: stdLib.Partial[fastDashGlobLib.outTypesMod.FileSystemAdapter] = null,
    gitignore: js.UndefOr[scala.Boolean] = js.undefined,
    globstar: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[fastDashGlobLib.outTypesMod.Pattern] = null,
    markDirectories: js.UndefOr[scala.Boolean] = js.undefined,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[scala.Boolean] = js.undefined,
    onlyFiles: js.UndefOr[scala.Boolean] = js.undefined,
    stats: js.UndefOr[scala.Boolean] = js.undefined,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): GlobbyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(baseNameMatch)) __obj.updateDynamic("baseNameMatch")(baseNameMatch)
    if (!js.isUndefined(braceExpansion)) __obj.updateDynamic("braceExpansion")(braceExpansion)
    if (!js.isUndefined(caseSensitiveMatch)) __obj.updateDynamic("caseSensitiveMatch")(caseSensitiveMatch)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob)
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore)
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories)
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles)
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[GlobbyOptions]
  }
}

