package typings
package fastDashGlobLib.outSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getFileSystemMethods: js.Any
  var _getValue: js.Any
  val _options: js.Any
  val absolute: scala.Boolean
  val baseNameMatch: scala.Boolean
  val braceExpansion: scala.Boolean
  val caseSensitiveMatch: scala.Boolean
  val concurrency: scala.Double
  val cwd: java.lang.String
  val deep: scala.Double
  val dot: scala.Boolean
  val extglob: scala.Boolean
  val followSymbolicLinks: scala.Boolean
  val fs: fastDashGlobLib.outTypesMod.FileSystemAdapter
  val globstar: scala.Boolean
  val ignore: js.Array[fastDashGlobLib.outTypesMod.Pattern]
  val markDirectories: scala.Boolean
  val objectMode: scala.Boolean
  val onlyDirectories: scala.Boolean
  val onlyFiles: scala.Boolean
  val stats: scala.Boolean
  val suppressErrors: scala.Boolean
  val throwErrorOnBrokenSymbolicLink: scala.Boolean
  val unique: scala.Boolean
}

object Settings {
  @scala.inline
  def apply(
    _getFileSystemMethods: js.Any,
    _getValue: js.Any,
    _options: js.Any,
    absolute: scala.Boolean,
    baseNameMatch: scala.Boolean,
    braceExpansion: scala.Boolean,
    caseSensitiveMatch: scala.Boolean,
    concurrency: scala.Double,
    cwd: java.lang.String,
    deep: scala.Double,
    dot: scala.Boolean,
    extglob: scala.Boolean,
    followSymbolicLinks: scala.Boolean,
    fs: fastDashGlobLib.outTypesMod.FileSystemAdapter,
    globstar: scala.Boolean,
    ignore: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    markDirectories: scala.Boolean,
    objectMode: scala.Boolean,
    onlyDirectories: scala.Boolean,
    onlyFiles: scala.Boolean,
    stats: scala.Boolean,
    suppressErrors: scala.Boolean,
    throwErrorOnBrokenSymbolicLink: scala.Boolean,
    unique: scala.Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getFileSystemMethods = _getFileSystemMethods, _getValue = _getValue, _options = _options, absolute = absolute, baseNameMatch = baseNameMatch, braceExpansion = braceExpansion, caseSensitiveMatch = caseSensitiveMatch, concurrency = concurrency, cwd = cwd, deep = deep, dot = dot, extglob = extglob, followSymbolicLinks = followSymbolicLinks, fs = fs, globstar = globstar, ignore = ignore, markDirectories = markDirectories, objectMode = objectMode, onlyDirectories = onlyDirectories, onlyFiles = onlyFiles, stats = stats, suppressErrors = suppressErrors, throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink, unique = unique)
  
    __obj.asInstanceOf[Settings]
  }
}

