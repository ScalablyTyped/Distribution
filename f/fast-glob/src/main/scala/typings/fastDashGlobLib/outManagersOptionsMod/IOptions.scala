package typings
package fastDashGlobLib.outManagersOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T] extends js.Object {
  /**
    * Return absolute paths for matched entries.
    */
  var absolute: scala.Boolean
  /**
    * Enable expansion of brace patterns.
    */
  var brace: scala.Boolean
  /**
    * Enable a case-insensitive regex for matching files.
    */
  var `case`: scala.Boolean
  /**
    * The current working directory in which to search.
    */
  var cwd: java.lang.String
  /**
    * The deep option can be set to true to traverse the entire directory structure,
    * or it can be set to a number to only traverse that many levels deep.
    */
  var deep: scala.Double | scala.Boolean
  /**
    * Allow patterns to match filenames starting with a period (files & directories),
    * even if the pattern does not explicitly have a period in that spot.
    */
  var dot: scala.Boolean
  /**
    * Enable extglob support, so that extglobs are regarded as literal characters.
    */
  var extension: scala.Boolean
  /**
    * Follow symlinked directories when expanding `**` patterns.
    */
  var followSymlinkedDirectories: scala.Boolean
  /**
    * Enable matching with globstars (`**`).
    */
  var globstar: scala.Boolean
  /**
    * Add an array of glob patterns to exclude matches.
    */
  var ignore: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]
  /**
    * Add a `/` character to directory entries.
    */
  var markDirectories: scala.Boolean
  /**
    * Allow glob patterns without slashes to match a file path based on its basename.
    * For example, `a?b` would match the path `/xyz/123/acb`, but not `/xyz/acb/123`.
    */
  var matchBase: scala.Boolean
  /**
    * Disable expansion of brace patterns.
    */
  var nobrace: scala.Boolean
  /**
    * Disable a case-insensitive regex for matching files.
    */
  var nocase: scala.Boolean
  /**
    * Disable extglob support, so that extglobs are regarded as literal characters.
    */
  var noext: scala.Boolean
  /**
    * Disable matching with globstars (`**`).
    */
  var noglobstar: scala.Boolean
  /**
    * Return only directories.
    */
  var onlyDirectories: scala.Boolean
  /**
    * Return only files.
    */
  var onlyFiles: scala.Boolean
  /**
    * Return `fs.Stats` with `path` property instead of file path.
    */
  var stats: scala.Boolean
  /**
    * Allows you to transform a path or `fs.Stats` object before sending to the array.
    */
  var transform: TransformFunction[T] | scala.Null
  /**
    * Prevent duplicate results.
    */
  var unique: scala.Boolean
}

object IOptions {
  @scala.inline
  def apply[T](
    absolute: scala.Boolean,
    brace: scala.Boolean,
    `case`: scala.Boolean,
    cwd: java.lang.String,
    deep: scala.Double | scala.Boolean,
    dot: scala.Boolean,
    extension: scala.Boolean,
    followSymlinkedDirectories: scala.Boolean,
    globstar: scala.Boolean,
    ignore: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    markDirectories: scala.Boolean,
    matchBase: scala.Boolean,
    nobrace: scala.Boolean,
    nocase: scala.Boolean,
    noext: scala.Boolean,
    noglobstar: scala.Boolean,
    onlyDirectories: scala.Boolean,
    onlyFiles: scala.Boolean,
    stats: scala.Boolean,
    unique: scala.Boolean,
    transform: TransformFunction[T] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(absolute = absolute, brace = brace, cwd = cwd, deep = deep.asInstanceOf[js.Any], dot = dot, extension = extension, followSymlinkedDirectories = followSymlinkedDirectories, globstar = globstar, ignore = ignore, markDirectories = markDirectories, matchBase = matchBase, nobrace = nobrace, nocase = nocase, noext = noext, noglobstar = noglobstar, onlyDirectories = onlyDirectories, onlyFiles = onlyFiles, stats = stats, unique = unique)
    __obj.updateDynamic("case")(`case`)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[IOptions[T]]
  }
}

