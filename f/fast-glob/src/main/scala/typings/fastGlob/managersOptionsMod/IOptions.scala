package typings.fastGlob.managersOptionsMod

import typings.fastGlob.typesEntriesMod.EntryItem
import typings.fastGlob.typesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T] extends js.Object {
  /**
    * Return absolute paths for matched entries.
    */
  var absolute: Boolean
  /**
    * Enable expansion of brace patterns.
    */
  var brace: Boolean
  /**
    * Enable a case-insensitive regex for matching files.
    */
  var `case`: Boolean
  /**
    * The current working directory in which to search.
    */
  var cwd: String
  /**
    * The deep option can be set to true to traverse the entire directory structure,
    * or it can be set to a number to only traverse that many levels deep.
    */
  var deep: Double | Boolean
  /**
    * Allow patterns to match filenames starting with a period (files & directories),
    * even if the pattern does not explicitly have a period in that spot.
    */
  var dot: Boolean
  /**
    * Enable extglob support, so that extglobs are regarded as literal characters.
    */
  var extension: Boolean
  /**
    * Follow symlinked directories when expanding `**` patterns.
    */
  var followSymlinkedDirectories: Boolean
  /**
    * Enable matching with globstars (`**`).
    */
  var globstar: Boolean
  /**
    * Add an array of glob patterns to exclude matches.
    */
  var ignore: js.Array[Pattern]
  /**
    * Add a `/` character to directory entries.
    */
  var markDirectories: Boolean
  /**
    * Allow glob patterns without slashes to match a file path based on its basename.
    * For example, `a?b` would match the path `/xyz/123/acb`, but not `/xyz/acb/123`.
    */
  var matchBase: Boolean
  /**
    * Disable expansion of brace patterns.
    */
  var nobrace: Boolean
  /**
    * Disable a case-insensitive regex for matching files.
    */
  var nocase: Boolean
  /**
    * Disable extglob support, so that extglobs are regarded as literal characters.
    */
  var noext: Boolean
  /**
    * Disable matching with globstars (`**`).
    */
  var noglobstar: Boolean
  /**
    * Return only directories.
    */
  var onlyDirectories: Boolean
  /**
    * Return only files.
    */
  var onlyFiles: Boolean
  /**
    * Return `fs.Stats` with `path` property instead of file path.
    */
  var stats: Boolean
  /**
    * Allows you to transform a path or `fs.Stats` object before sending to the array.
    */
  var transform: TransformFunction[T] | Null
  /**
    * Prevent duplicate results.
    */
  var unique: Boolean
}

object IOptions {
  @scala.inline
  def apply[T](
    absolute: Boolean,
    brace: Boolean,
    `case`: Boolean,
    cwd: String,
    deep: Double | Boolean,
    dot: Boolean,
    extension: Boolean,
    followSymlinkedDirectories: Boolean,
    globstar: Boolean,
    ignore: js.Array[Pattern],
    markDirectories: Boolean,
    matchBase: Boolean,
    nobrace: Boolean,
    nocase: Boolean,
    noext: Boolean,
    noglobstar: Boolean,
    onlyDirectories: Boolean,
    onlyFiles: Boolean,
    stats: Boolean,
    unique: Boolean,
    transform: /* entry */ EntryItem => T = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], brace = brace.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], deep = deep.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], followSymlinkedDirectories = followSymlinkedDirectories.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], markDirectories = markDirectories.asInstanceOf[js.Any], matchBase = matchBase.asInstanceOf[js.Any], nobrace = nobrace.asInstanceOf[js.Any], nocase = nocase.asInstanceOf[js.Any], noext = noext.asInstanceOf[js.Any], noglobstar = noglobstar.asInstanceOf[js.Any], onlyDirectories = onlyDirectories.asInstanceOf[js.Any], onlyFiles = onlyFiles.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[IOptions[T]]
  }
}

