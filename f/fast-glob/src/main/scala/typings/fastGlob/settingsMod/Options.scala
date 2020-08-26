package typings.fastGlob.settingsMod

import typings.fastGlob.anon.PartialFileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Return the absolute path for entries.
    *
    * @default false
    */
  var absolute: js.UndefOr[Boolean] = js.native
  /**
    * If set to `true`, then patterns without slashes will be matched against
    * the basename of the path if it contains slashes.
    *
    * @default false
    */
  var baseNameMatch: js.UndefOr[Boolean] = js.native
  /**
    * Enables Bash-like brace expansion.
    *
    * @default true
    */
  var braceExpansion: js.UndefOr[Boolean] = js.native
  /**
    * Enables a case-sensitive mode for matching files.
    *
    * @default true
    */
  var caseSensitiveMatch: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the maximum number of concurrent requests from a reader to read
    * directories.
    *
    * @default os.cpus().length
    */
  var concurrency: js.UndefOr[Double] = js.native
  /**
    * The current working directory in which to search.
    *
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Specifies the maximum depth of a read directory relative to the start
    * directory.
    *
    * @default Infinity
    */
  var deep: js.UndefOr[Double] = js.native
  /**
    * Allow patterns to match entries that begin with a period (`.`).
    *
    * @default false
    */
  var dot: js.UndefOr[Boolean] = js.native
  /**
    * Enables Bash-like `extglob` functionality.
    *
    * @default true
    */
  var extglob: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to traverse descendants of symbolic link directories.
    *
    * @default true
    */
  var followSymbolicLinks: js.UndefOr[Boolean] = js.native
  /**
    * Custom implementation of methods for working with the file system.
    *
    * @default fs.*
    */
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
  /**
    * Enables recursively repeats a pattern containing `**`.
    * If `false`, `**` behaves exactly like `*`.
    *
    * @default true
    */
  var globstar: js.UndefOr[Boolean] = js.native
  /**
    * An array of glob patterns to exclude matches.
    * This is an alternative way to use negative patterns.
    *
    * @default []
    */
  var ignore: js.UndefOr[js.Array[Pattern]] = js.native
  /**
    * Mark the directory path with the final slash.
    *
    * @default false
    */
  var markDirectories: js.UndefOr[Boolean] = js.native
  /**
    * Returns objects (instead of strings) describing entries.
    *
    * @default false
    */
  var objectMode: js.UndefOr[Boolean] = js.native
  /**
    * Return only directories.
    *
    * @default false
    */
  var onlyDirectories: js.UndefOr[Boolean] = js.native
  /**
    * Return only files.
    *
    * @default true
    */
  var onlyFiles: js.UndefOr[Boolean] = js.native
  /**
    * Enables an object mode (`objectMode`) with an additional `stats` field.
    *
    * @default false
    */
  var stats: js.UndefOr[Boolean] = js.native
  /**
    * By default this package suppress only `ENOENT` errors.
    * Set to `true` to suppress any error.
    *
    * @default false
    */
  var suppressErrors: js.UndefOr[Boolean] = js.native
  /**
    * Throw an error when symbolic link is broken if `true` or safely
    * return `lstat` call if `false`.
    *
    * @default false
    */
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
  /**
    * Ensures that the returned entries are unique.
    *
    * @default true
    */
  var unique: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    @scala.inline
    def setBaseNameMatch(value: Boolean): Self = this.set("baseNameMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseNameMatch: Self = this.set("baseNameMatch", js.undefined)
    @scala.inline
    def setBraceExpansion(value: Boolean): Self = this.set("braceExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraceExpansion: Self = this.set("braceExpansion", js.undefined)
    @scala.inline
    def setCaseSensitiveMatch(value: Boolean): Self = this.set("caseSensitiveMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitiveMatch: Self = this.set("caseSensitiveMatch", js.undefined)
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDeep(value: Double): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setExtglob(value: Boolean): Self = this.set("extglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtglob: Self = this.set("extglob", js.undefined)
    @scala.inline
    def setFollowSymbolicLinks(value: Boolean): Self = this.set("followSymbolicLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowSymbolicLinks: Self = this.set("followSymbolicLinks", js.undefined)
    @scala.inline
    def setFs(value: PartialFileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobstar: Self = this.set("globstar", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: Pattern*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[Pattern]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setMarkDirectories(value: Boolean): Self = this.set("markDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkDirectories: Self = this.set("markDirectories", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setOnlyDirectories(value: Boolean): Self = this.set("onlyDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyDirectories: Self = this.set("onlyDirectories", js.undefined)
    @scala.inline
    def setOnlyFiles(value: Boolean): Self = this.set("onlyFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyFiles: Self = this.set("onlyFiles", js.undefined)
    @scala.inline
    def setStats(value: Boolean): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setSuppressErrors(value: Boolean): Self = this.set("suppressErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrors: Self = this.set("suppressErrors", js.undefined)
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowErrorOnBrokenSymbolicLink: Self = this.set("throwErrorOnBrokenSymbolicLink", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

