package typings.fastDashGlob.outSettingsMod

import typings.fastDashGlob.outTypesMod.FileSystemAdapter
import typings.fastDashGlob.outTypesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getFileSystemMethods: js.Any
  var _getValue: js.Any
  val _options: js.Any
  val absolute: Boolean
  val baseNameMatch: Boolean
  val braceExpansion: Boolean
  val caseSensitiveMatch: Boolean
  val concurrency: Double
  val cwd: String
  val deep: Double
  val dot: Boolean
  val extglob: Boolean
  val followSymbolicLinks: Boolean
  val fs: FileSystemAdapter
  val globstar: Boolean
  val ignore: js.Array[Pattern]
  val markDirectories: Boolean
  val objectMode: Boolean
  val onlyDirectories: Boolean
  val onlyFiles: Boolean
  val stats: Boolean
  val suppressErrors: Boolean
  val throwErrorOnBrokenSymbolicLink: Boolean
  val unique: Boolean
}

object Settings {
  @scala.inline
  def apply(
    _getFileSystemMethods: js.Any,
    _getValue: js.Any,
    _options: js.Any,
    absolute: Boolean,
    baseNameMatch: Boolean,
    braceExpansion: Boolean,
    caseSensitiveMatch: Boolean,
    concurrency: Double,
    cwd: String,
    deep: Double,
    dot: Boolean,
    extglob: Boolean,
    followSymbolicLinks: Boolean,
    fs: FileSystemAdapter,
    globstar: Boolean,
    ignore: js.Array[Pattern],
    markDirectories: Boolean,
    objectMode: Boolean,
    onlyDirectories: Boolean,
    onlyFiles: Boolean,
    stats: Boolean,
    suppressErrors: Boolean,
    throwErrorOnBrokenSymbolicLink: Boolean,
    unique: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getFileSystemMethods = _getFileSystemMethods, _getValue = _getValue, _options = _options, absolute = absolute, baseNameMatch = baseNameMatch, braceExpansion = braceExpansion, caseSensitiveMatch = caseSensitiveMatch, concurrency = concurrency, cwd = cwd, deep = deep, dot = dot, extglob = extglob, followSymbolicLinks = followSymbolicLinks, fs = fs, globstar = globstar, ignore = ignore, markDirectories = markDirectories, objectMode = objectMode, onlyDirectories = onlyDirectories, onlyFiles = onlyFiles, stats = stats, suppressErrors = suppressErrors, throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink, unique = unique)
  
    __obj.asInstanceOf[Settings]
  }
}

