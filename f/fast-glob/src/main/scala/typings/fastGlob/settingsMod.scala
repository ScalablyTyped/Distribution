package typings.fastGlob

import typings.fastGlob.anon.PartialFileSystemAdapter
import typings.fastGlob.typesMod.FileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("fast-glob/out/settings", JSImport.Default)
  @js.native
  class default () extends Settings {
    def this(_options: Options) = this()
  }
  
  @JSImport("fast-glob/out/settings", "DEFAULT_FILE_SYSTEM_ADAPTER")
  @js.native
  val DEFAULT_FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      @scala.inline
      def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      @scala.inline
      def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      @scala.inline
      def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      @scala.inline
      def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      @scala.inline
      def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
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
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getFileSystemMethods(value: js.Any): Self = StObject.set(x, "_getFileSystemMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getValue(value: js.Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
