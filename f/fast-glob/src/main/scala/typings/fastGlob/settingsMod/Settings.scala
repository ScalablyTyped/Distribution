package typings.fastGlob.settingsMod

import typings.fastGlob.typesMod.FileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var _getFileSystemMethods: js.Any = js.native
  var _getValue: js.Any = js.native
  val _options: js.Any = js.native
  val absolute: Boolean = js.native
  val baseNameMatch: Boolean = js.native
  val braceExpansion: Boolean = js.native
  val caseSensitiveMatch: Boolean = js.native
  val concurrency: Double = js.native
  val cwd: String = js.native
  val deep: Double = js.native
  val dot: Boolean = js.native
  val extglob: Boolean = js.native
  val followSymbolicLinks: Boolean = js.native
  val fs: FileSystemAdapter = js.native
  val globstar: Boolean = js.native
  val ignore: js.Array[Pattern] = js.native
  val markDirectories: Boolean = js.native
  val objectMode: Boolean = js.native
  val onlyDirectories: Boolean = js.native
  val onlyFiles: Boolean = js.native
  val stats: Boolean = js.native
  val suppressErrors: Boolean = js.native
  val throwErrorOnBrokenSymbolicLink: Boolean = js.native
  val unique: Boolean = js.native
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
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_getFileSystemMethods(value: js.Any): Self = this.set("_getFileSystemMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def set_getValue(value: js.Any): Self = this.set("_getValue", value.asInstanceOf[js.Any])
    @scala.inline
    def set_options(value: js.Any): Self = this.set("_options", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseNameMatch(value: Boolean): Self = this.set("baseNameMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setBraceExpansion(value: Boolean): Self = this.set("braceExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaseSensitiveMatch(value: Boolean): Self = this.set("caseSensitiveMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeep(value: Double): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtglob(value: Boolean): Self = this.set("extglob", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowSymbolicLinks(value: Boolean): Self = this.set("followSymbolicLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setFs(value: FileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreVarargs(value: Pattern*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[Pattern]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkDirectories(value: Boolean): Self = this.set("markDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyDirectories(value: Boolean): Self = this.set("onlyDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyFiles(value: Boolean): Self = this.set("onlyFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Boolean): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressErrors(value: Boolean): Self = this.set("suppressErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
  }
  
}

