package typings.fastGlob

import typings.fastGlob.anon.PartialFileSystemAdapter
import typings.fastGlob.typesMod.FileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("fast-glob/out/settings", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Settings {
    def this(_options: Options) = this()
    
    /* private */ /* CompleteClass */
    var _getFileSystemMethods: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getValue: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _options: Any = js.native
    
    /* CompleteClass */
    override val absolute: Boolean = js.native
    
    /* CompleteClass */
    override val baseNameMatch: Boolean = js.native
    
    /* CompleteClass */
    override val braceExpansion: Boolean = js.native
    
    /* CompleteClass */
    override val caseSensitiveMatch: Boolean = js.native
    
    /* CompleteClass */
    override val concurrency: Double = js.native
    
    /* CompleteClass */
    override val cwd: String = js.native
    
    /* CompleteClass */
    override val deep: Double = js.native
    
    /* CompleteClass */
    override val dot: Boolean = js.native
    
    /* CompleteClass */
    override val extglob: Boolean = js.native
    
    /* CompleteClass */
    override val followSymbolicLinks: Boolean = js.native
    
    /* CompleteClass */
    override val fs: FileSystemAdapter = js.native
    
    /* CompleteClass */
    override val globstar: Boolean = js.native
    
    /* CompleteClass */
    override val ignore: js.Array[Pattern] = js.native
    
    /* CompleteClass */
    override val markDirectories: Boolean = js.native
    
    /* CompleteClass */
    override val objectMode: Boolean = js.native
    
    /* CompleteClass */
    override val onlyDirectories: Boolean = js.native
    
    /* CompleteClass */
    override val onlyFiles: Boolean = js.native
    
    /* CompleteClass */
    override val stats: Boolean = js.native
    
    /* CompleteClass */
    override val suppressErrors: Boolean = js.native
    
    /* CompleteClass */
    override val throwErrorOnBrokenSymbolicLink: Boolean = js.native
    
    /* CompleteClass */
    override val unique: Boolean = js.native
  }
  
  @JSImport("fast-glob/out/settings", "DEFAULT_FILE_SYSTEM_ADAPTER")
  @js.native
  val DEFAULT_FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  trait Options extends StObject {
    
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
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      inline def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      inline def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      inline def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /* private */ var _getFileSystemMethods: Any
    
    /* private */ var _getValue: Any
    
    /* private */ val _options: Any
    
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
    
    inline def apply(
      _getFileSystemMethods: Any,
      _getValue: Any,
      _options: Any,
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
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def set_getFileSystemMethods(value: Any): Self = StObject.set(x, "_getFileSystemMethods", value.asInstanceOf[js.Any])
      
      inline def set_getValue(value: Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
