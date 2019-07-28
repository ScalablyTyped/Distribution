package typings.fastDashGlob.outSettingsMod

import typings.fastDashGlob.outTypesMod.FileSystemAdapter
import typings.fastDashGlob.outTypesMod.Pattern
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Return the absolute path for entries.
    *
    * @default false
    */
  var absolute: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `true`, then patterns without slashes will be matched against
    * the basename of the path if it contains slashes.
    *
    * @default false
    */
  var baseNameMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables Bash-like brace expansion.
    *
    * @default true
    */
  var braceExpansion: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables a case-sensitive mode for matching files.
    *
    * @default true
    */
  var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the maximum number of concurrent requests from a reader to read
    * directories.
    *
    * @default os.cpus().length
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /**
    * The current working directory in which to search.
    *
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Specifies the maximum depth of a read directory relative to the start
    * directory.
    *
    * @default Infinity
    */
  var deep: js.UndefOr[Double] = js.undefined
  /**
    * Allow patterns to match entries that begin with a period (`.`).
    *
    * @default false
    */
  var dot: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables Bash-like `extglob` functionality.
    *
    * @default true
    */
  var extglob: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to traverse descendants of symbolic link directories.
    *
    * @default true
    */
  var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom implementation of methods for working with the file system.
    *
    * @default fs.*
    */
  var fs: js.UndefOr[Partial[FileSystemAdapter]] = js.undefined
  /**
    * Enables recursively repeats a pattern containing `**`.
    * If `false`, `**` behaves exactly like `*`.
    *
    * @default true
    */
  var globstar: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of glob patterns to exclude matches.
    * This is an alternative way to use negative patterns.
    *
    * @default []
    */
  var ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
  /**
    * Mark the directory path with the final slash.
    *
    * @default false
    */
  var markDirectories: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns objects (instead of strings) describing entries.
    *
    * @default false
    */
  var objectMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Return only directories.
    *
    * @default false
    */
  var onlyDirectories: js.UndefOr[Boolean] = js.undefined
  /**
    * Return only files.
    *
    * @default true
    */
  var onlyFiles: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables an object mode (`objectMode`) with an additional `stats` field.
    *
    * @default false
    */
  var stats: js.UndefOr[Boolean] = js.undefined
  /**
    * By default this package suppress only `ENOENT` errors.
    * Set to `true` to suppress any error.
    *
    * @default false
    */
  var suppressErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Throw an error when symbolic link is broken if `true` or safely
    * return `lstat` call if `false`.
    *
    * @default false
    */
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Ensures that the returned entries are unique.
    *
    * @default true
    */
  var unique: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    baseNameMatch: js.UndefOr[Boolean] = js.undefined,
    braceExpansion: js.UndefOr[Boolean] = js.undefined,
    caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    cwd: String = null,
    deep: Int | Double = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    extglob: js.UndefOr[Boolean] = js.undefined,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    fs: Partial[FileSystemAdapter] = null,
    globstar: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[Pattern] = null,
    markDirectories: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[Boolean] = js.undefined,
    onlyFiles: js.UndefOr[Boolean] = js.undefined,
    stats: js.UndefOr[Boolean] = js.undefined,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(baseNameMatch)) __obj.updateDynamic("baseNameMatch")(baseNameMatch)
    if (!js.isUndefined(braceExpansion)) __obj.updateDynamic("braceExpansion")(braceExpansion)
    if (!js.isUndefined(caseSensitiveMatch)) __obj.updateDynamic("caseSensitiveMatch")(caseSensitiveMatch)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob)
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks)
    if (fs != null) __obj.updateDynamic("fs")(fs)
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
    __obj.asInstanceOf[Options]
  }
}

