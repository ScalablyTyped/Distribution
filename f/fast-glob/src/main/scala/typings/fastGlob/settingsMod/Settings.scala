package typings.fastGlob.settingsMod

import typings.fastGlob.typesMod.FileSystemAdapter
import typings.fastGlob.typesMod.Pattern
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
    val __obj = js.Dynamic.literal(_getFileSystemMethods = _getFileSystemMethods.asInstanceOf[js.Any], _getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], absolute = absolute.asInstanceOf[js.Any], baseNameMatch = baseNameMatch.asInstanceOf[js.Any], braceExpansion = braceExpansion.asInstanceOf[js.Any], caseSensitiveMatch = caseSensitiveMatch.asInstanceOf[js.Any], concurrency = concurrency.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], deep = deep.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], extglob = extglob.asInstanceOf[js.Any], followSymbolicLinks = followSymbolicLinks.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], markDirectories = markDirectories.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], onlyDirectories = onlyDirectories.asInstanceOf[js.Any], onlyFiles = onlyFiles.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], suppressErrors = suppressErrors.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

