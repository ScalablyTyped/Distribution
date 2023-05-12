package typings.glob

import typings.glob.distMjsIgnoreMod.IgnoreLike
import typings.glob.distMjsPatternMod.Pattern
import typings.glob.globBooleans.`false`
import typings.glob.globBooleans.`true`
import typings.minipass.mod.Minipass
import typings.node.processMod.global.NodeJS.Platform
import typings.std.AbortSignal
import typings.std.AsyncGenerator
import typings.std.Exclude
import typings.std.Generator
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsGlobMod {
  
  @JSImport("glob/dist/mjs/glob", "Glob")
  @js.native
  open class Glob[Opts /* <: GlobOptions */] protected ()
    extends StObject
       with GlobOptions {
    /**
      * All options are stored as properties on the `Glob` object.
      *
      * See {@link GlobOptions} for full options descriptions.
      *
      * Note that a previous `Glob` object can be passed as the
      * `GlobOptions` to another `Glob` instantiation to re-use settings
      * and caches with a new pattern.
      *
      * Traversal functions can be called multiple times to run the walk
      * again.
      */
    def this(pattern: String, opts: Opts) = this()
    def this(pattern: js.Array[String], opts: Opts) = this()
    
    @JSName("cwd")
    var cwd_Glob: String = js.native
    
    @JSName("dotRelative")
    var dotRelative_Glob: Boolean = js.native
    
    @JSName("dot")
    var dot_Glob: Boolean = js.native
    
    @JSName("follow")
    var follow_Glob: Boolean = js.native
    
    /**
      * Default async iteration function. Returns an AsyncGenerator that
      * iterates over the results.
      */
    def iterate(): AsyncGenerator[Result[Opts], Unit, Unit] = js.native
    
    /**
      * Default sync iteration function. Returns a Generator that
      * iterates over the results.
      */
    def iterateSync(): Generator[Result[Opts], Unit, Unit] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[Result[Opts], Unit, Unit]] = js.native
    
    @JSName("magicalBraces")
    var magicalBraces_Glob: Boolean = js.native
    
    @JSName("matchBase")
    var matchBase_Glob: Boolean = js.native
    
    @JSName("maxDepth")
    var maxDepth_Glob: Double = js.native
    
    @JSName("nobrace")
    var nobrace_Glob: Boolean = js.native
    
    @JSName("nocase")
    var nocase_Glob: Boolean = js.native
    
    @JSName("nodir")
    var nodir_Glob: Boolean = js.native
    
    @JSName("noext")
    var noext_Glob: Boolean = js.native
    
    @JSName("noglobstar")
    var noglobstar_Glob: Boolean = js.native
    
    /**
      * The options provided to the constructor.
      */
    var opts: Opts = js.native
    
    var pattern: js.Array[String] = js.native
    
    /**
      * An array of parsed immutable {@link Pattern} objects.
      */
    var patterns: js.Array[Pattern] = js.native
    
    @JSName("platform")
    var platform_Glob: Platform = js.native
    
    @JSName("realpath")
    var realpath_Glob: Boolean = js.native
    
    @JSName("stat")
    var stat_Glob: Boolean = js.native
    
    /**
      * Stream results asynchronously.
      */
    def stream(): Minipass[Result[Opts], Result[Opts]] = js.native
    
    /**
      * Stream results synchronously.
      */
    def streamSync(): Minipass[Result[Opts], Result[Opts]] = js.native
    
    /**
      * Returns a Promise that resolves to the results array.
      */
    def walk(): js.Promise[Results[Opts]] = js.native
    
    /**
      * synchronous {@link Glob.walk}
      */
    def walkSync(): Results[Opts] = js.native
    
    @JSName("windowsPathsNoEscape")
    var windowsPathsNoEscape_Glob: Boolean = js.native
    
    @JSName("withFileTypes")
    var withFileTypes_Glob: FileTypes[Opts] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Opts extends glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue ? true : Opts extends glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse ? false : Opts extends glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset ? false : boolean
    }}}
    */
  type FileTypes[Opts] = `true`
  
  trait GlobOptions extends StObject {
    
    /**
      * Set to `true` to always receive absolute paths for
      * matched files. Set to `false` to always return relative paths.
      *
      * When this option is not set, absolute paths are returned for patterns
      * that are absolute, and otherwise paths are returned that are relative
      * to the `cwd` setting.
      *
      * This does _not_ make an extra system call to get
      * the realpath, it only does string path resolution.
      *
      * Conflicts with {@link withFileTypes}
      */
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to false to enable {@link windowsPathsNoEscape}
      *
      * @deprecated
      */
    var allowWindowsEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current working directory in which to search. Defaults to
      * `process.cwd()`.
      *
      * May be eiher a string path or a `file://` URL object or string.
      */
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
      * Just passed along to Minimatch.  Note that this makes all pattern
      * matching operations slower and *extremely* noisy.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include `.dot` files in normal matches and `globstar`
      * matches. Note that an explicit dot in a portion of the pattern
      * will always match dot files.
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prepend all relative path strings with `./` (or `.\` on Windows).
      *
      * Without this option, returned relative paths are "bare", so instead of
      * returning `'./foo/bar'`, they are returned as `'foo/bar'`.
      *
      * Relative patterns starting with `'../'` are not prepended with `./`, even
      * if this option is set.
      */
    var dotRelative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Follow symlinked directories when expanding `**`
      * patterns. This can result in a lot of duplicate references in
      * the presence of cyclic links, and make performance quite bad.
      *
      * By default, a `**` in a pattern will follow 1 symbolic link if
      * it is not the first item in the pattern, or none if it is the
      * first item in the pattern, following the same behavior as Bash.
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An fs implementation to override some or all of the defaults.  See
      * http://npm.im/path-scurry for details about what can be overridden.
      */
    var fs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FSOption */ Any
      ] = js.undefined
    
    /**
      * string or string[], or an object with `ignore` and `ignoreChildren`
      * methods.
      *
      * If a string or string[] is provided, then this is treated as a glob
      * pattern or array of glob patterns to exclude from matches. To ignore all
      * children within a directory, as well as the entry itself, append `'/ **'`
      * to the ignore pattern.
      *
      * **Note** `ignore` patterns are _always_ in `dot:true` mode, regardless of
      * any other settings.
      *
      * If an object is provided that has `ignored(path)` and/or
      * `childrenIgnored(path)` methods, then these methods will be called to
      * determine whether any Path is a match or if its children should be
      * traversed, respectively.
      */
    var ignore: js.UndefOr[String | js.Array[String] | IgnoreLike] = js.undefined
    
    /**
      * Treat brace expansion like `{a,b}` as a "magic" pattern. Has no
      * effect if {@link nobrace} is set.
      *
      * Only has effect on the {@link hasMagic} function.
      */
    var magicalBraces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a `/` character to directory matches. Note that this requires
      * additional stat calls in some cases.
      */
    var mark: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a basename-only match if the pattern does not contain any slash
      * characters. That is, `*.js` would be treated as equivalent to
      * `**\/ *.js`, matching all js files in all directories.
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the directory traversal to a given depth below the cwd.
      * Note that this does NOT prevent traversal to sibling folders,
      * root patterns, and so on. It only limits the maximum folder depth
      * that the walk will descend, relative to the cwd.
      */
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not expand `{a,b}` and `{1..3}` brace sets.
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match. This defaults to `true` on macOS and
      * Windows systems, and `false` on all others.
      *
      * **Note** `nocase` should only be explicitly set when it is
      * known that the filesystem's case sensitivity differs from the
      * platform default. If set `true` on case-sensitive file
      * systems, or `false` on case-insensitive file systems, then the
      * walk may return more or less results than expected.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match directories, only files. (Note: to match
      * _only_ directories, put a `/` at the end of the pattern.)
      */
    var nodir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match "extglob" patterns such as `+(a|b)`.
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match `**` against multiple filenames. (Ie, treat it as a normal
      * `*` instead.)
      *
      * Conflicts with {@link matchBase}
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to value of `process.platform` if available, or `'linux'` if
      * not. Setting `platform:'win32'` on non-Windows systems may cause strange
      * behavior.
      */
    var platform: js.UndefOr[Platform] = js.undefined
    
    /**
      * Return `/` delimited paths, even on Windows.
      *
      * On posix systems, this has no effect.  But, on Windows, it means that
      * paths will be `/` delimited, and absolute paths will be their full
      * resolved UNC forms, eg instead of `'C:\\foo\\bar'`, it would return
      * `'//?/C:/foo/bar'`
      */
    var posix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to call `fs.realpath` on all of the
      * results. In the case of an entry that cannot be resolved, the
      * entry is omitted. This incurs a slight performance penalty, of
      * course, because of the added system calls.
      */
    var realpath: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * A string path resolved against the `cwd` option, which
      * is used as the starting point for absolute patterns that start
      * with `/`, (but not drive letters or UNC paths on Windows).
      *
      * Note that this _doesn't_ necessarily limit the walk to the
      * `root` directory, and doesn't affect the cwd starting point for
      * non-absolute patterns. A pattern containing `..` will still be
      * able to traverse out of the root directory, if it is not an
      * actual root directory on the filesystem, and any non-absolute
      * patterns will be matched in the `cwd`. For example, the
      * pattern `/../ *` with `{root:'/some/path'}` will return all
      * files in `/some`, not all files in `/some/path`. The pattern
      * `*` with `{root:'/some/path'}` will return all the entries in
      * the cwd, not the entries in `/some/path`.
      *
      * To start absolute and non-absolute patterns in the same
      * path, you can use `{root:''}`. However, be aware that on
      * Windows systems, a pattern like `x:/ *` or `//host/share/ *` will
      * _always_ start in the `x:/` or `//host/share` directory,
      * regardless of the `root` setting.
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * A [PathScurry](http://npm.im/path-scurry) object used
      * to traverse the file system. If the `nocase` option is set
      * explicitly, then any provided `scurry` object must match this
      * setting.
      */
    var scurry: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathScurry */ Any
      ] = js.undefined
    
    /**
      * An AbortSignal which will cancel the Glob walk when
      * triggered.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Call `lstat()` on all entries, whether required or not to determine
      * if it's a valid match. When used with {@link withFileTypes}, this means
      * that matches will include data such as modified time, permissions, and
      * so on.  Note that this will incur a performance cost due to the added
      * system calls.
      */
    var stat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use `\\` as a path separator _only_, and
      *  _never_ as an escape character. If set, all `\\` characters are
      *  replaced with `/` in the pattern.
      *
      *  Note that this makes it **impossible** to match against paths
      *  containing literal glob pattern characters, but allows matching
      *  with patterns constructed using `path.join()` and
      *  `path.resolve()` on Windows platforms, mimicking the (buggy!)
      *  behavior of Glob v7 and before on Windows. Please use with
      *  caution, and be mindful of [the caveat below about Windows
      *  paths](#windows). (For legacy reasons, this is also set if
      *  `allowWindowsEscape` is set to the exact value `false`.)
      */
    var windowsPathsNoEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return [PathScurry](http://npm.im/path-scurry)
      * `Path` objects instead of strings. These are similar to a
      * NodeJS `Dirent` object, but with additional methods and
      * properties.
      *
      * Conflicts with {@link absolute}
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object GlobOptions {
    
    inline def apply(): GlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobOptions] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setAllowWindowsEscape(value: Boolean): Self = StObject.set(x, "allowWindowsEscape", value.asInstanceOf[js.Any])
      
      inline def setAllowWindowsEscapeUndefined: Self = StObject.set(x, "allowWindowsEscape", js.undefined)
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotRelative(value: Boolean): Self = StObject.set(x, "dotRelative", value.asInstanceOf[js.Any])
      
      inline def setDotRelativeUndefined: Self = StObject.set(x, "dotRelative", js.undefined)
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setFs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FSOption */ Any
      ): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String] | IgnoreLike): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMagicalBraces(value: Boolean): Self = StObject.set(x, "magicalBraces", value.asInstanceOf[js.Any])
      
      inline def setMagicalBracesUndefined: Self = StObject.set(x, "magicalBraces", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScurry(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathScurry */ Any
      ): Self = StObject.set(x, "scurry", value.asInstanceOf[js.Any])
      
      inline def setScurryUndefined: Self = StObject.set(x, "scurry", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStat(value: Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      inline def setWindowsPathsNoEscape(value: Boolean): Self = StObject.set(x, "windowsPathsNoEscape", value.asInstanceOf[js.Any])
      
      inline def setWindowsPathsNoEscapeUndefined: Self = StObject.set(x, "windowsPathsNoEscape", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  trait GlobOptionsWithFileTypesFalse
    extends StObject
       with GlobOptions {
    
    @JSName("withFileTypes")
    var withFileTypes_GlobOptionsWithFileTypesFalse: js.UndefOr[`false`] = js.undefined
  }
  object GlobOptionsWithFileTypesFalse {
    
    inline def apply(): GlobOptionsWithFileTypesFalse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobOptionsWithFileTypesFalse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobOptionsWithFileTypesFalse] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  trait GlobOptionsWithFileTypesTrue
    extends StObject
       with GlobOptions {
    
    @JSName("absolute")
    var absolute_GlobOptionsWithFileTypesTrue: Unit
    
    @JSName("mark")
    var mark_GlobOptionsWithFileTypesTrue: Unit
    
    @JSName("posix")
    var posix_GlobOptionsWithFileTypesTrue: Unit
    
    @JSName("withFileTypes")
    var withFileTypes_GlobOptionsWithFileTypesTrue: `true`
  }
  object GlobOptionsWithFileTypesTrue {
    
    inline def apply(absolute: Unit, mark: Unit, posix: Unit): GlobOptionsWithFileTypesTrue = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], withFileTypes = true)
      __obj.asInstanceOf[GlobOptionsWithFileTypesTrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobOptionsWithFileTypesTrue] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Unit): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setMark(value: Unit): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setPosix(value: Unit): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobOptionsWithFileTypesUnset
    extends StObject
       with GlobOptions {
    
    @JSName("withFileTypes")
    var withFileTypes_GlobOptionsWithFileTypesUnset: Unit
  }
  object GlobOptionsWithFileTypesUnset {
    
    inline def apply(withFileTypes: Unit): GlobOptionsWithFileTypesUnset = {
      val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobOptionsWithFileTypesUnset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobOptionsWithFileTypesUnset] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: Unit): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  type GlobParts = Exclude[js.Array[js.Array[String]], Unit]
  
  /* Inlined minimatch.minimatch.Minimatch['set'] */
  /* Rewritten from type alias, can be one of: 
    - typings.glob.globStrings.map
    - typings.glob.globStrings.length
    - typings.glob.globStrings.entries
    - typings.glob.globStrings.pop
    - typings.glob.globStrings.findLast
    - typings.glob.globStrings.fill
    - typings.glob.globStrings.join
    - typings.glob.globStrings.copyWithin
    - typings.glob.globStrings.keys
    - typings.glob.globStrings.sort
    - typings.glob.globStrings.forEach
    - typings.glob.globStrings.concat
    - typings.glob.globStrings.includes
    - typings.glob.globStrings.slice
    - typings.glob.globStrings.shift
    - typings.glob.globStrings.push
    - typings.glob.globStrings.reverse
    - typings.glob.globStrings.flat
    - typings.glob.globStrings.splice
    - typings.glob.globStrings.some
    - typings.glob.globStrings.at
    - typings.glob.globStrings.unshift
    - typings.glob.globStrings.filter
    - typings.glob.globStrings.findLastIndex
    - typings.glob.globStrings.toString
    - typings.glob.globStrings.indexOf
    - typings.glob.globStrings.reduceRight
    - typings.glob.globStrings.findIndex
    - typings.glob.globStrings.reduce
    - typings.glob.globStrings.values
    - typings.glob.globStrings.flatMap
    - typings.glob.globStrings.toLocaleString
    - typings.glob.globStrings.every
    - typings.glob.globStrings.lastIndexOf
    - typings.glob.globStrings.find
  */
  trait MatchSet extends StObject
  object MatchSet {
    
    inline def at: typings.glob.globStrings.at = "at".asInstanceOf[typings.glob.globStrings.at]
    
    inline def concat: typings.glob.globStrings.concat = "concat".asInstanceOf[typings.glob.globStrings.concat]
    
    inline def copyWithin: typings.glob.globStrings.copyWithin = "copyWithin".asInstanceOf[typings.glob.globStrings.copyWithin]
    
    inline def entries: typings.glob.globStrings.entries = "entries".asInstanceOf[typings.glob.globStrings.entries]
    
    inline def every: typings.glob.globStrings.every = "every".asInstanceOf[typings.glob.globStrings.every]
    
    inline def fill: typings.glob.globStrings.fill = "fill".asInstanceOf[typings.glob.globStrings.fill]
    
    inline def filter: typings.glob.globStrings.filter = "filter".asInstanceOf[typings.glob.globStrings.filter]
    
    inline def find: typings.glob.globStrings.find = "find".asInstanceOf[typings.glob.globStrings.find]
    
    inline def findIndex: typings.glob.globStrings.findIndex = "findIndex".asInstanceOf[typings.glob.globStrings.findIndex]
    
    inline def findLast: typings.glob.globStrings.findLast = "findLast".asInstanceOf[typings.glob.globStrings.findLast]
    
    inline def findLastIndex: typings.glob.globStrings.findLastIndex = "findLastIndex".asInstanceOf[typings.glob.globStrings.findLastIndex]
    
    inline def flat: typings.glob.globStrings.flat = "flat".asInstanceOf[typings.glob.globStrings.flat]
    
    inline def flatMap: typings.glob.globStrings.flatMap = "flatMap".asInstanceOf[typings.glob.globStrings.flatMap]
    
    inline def forEach: typings.glob.globStrings.forEach = "forEach".asInstanceOf[typings.glob.globStrings.forEach]
    
    inline def includes: typings.glob.globStrings.includes = "includes".asInstanceOf[typings.glob.globStrings.includes]
    
    inline def indexOf: typings.glob.globStrings.indexOf = "indexOf".asInstanceOf[typings.glob.globStrings.indexOf]
    
    inline def join: typings.glob.globStrings.join = "join".asInstanceOf[typings.glob.globStrings.join]
    
    inline def keys: typings.glob.globStrings.keys = "keys".asInstanceOf[typings.glob.globStrings.keys]
    
    inline def lastIndexOf: typings.glob.globStrings.lastIndexOf = "lastIndexOf".asInstanceOf[typings.glob.globStrings.lastIndexOf]
    
    inline def length: typings.glob.globStrings.length = "length".asInstanceOf[typings.glob.globStrings.length]
    
    inline def map: typings.glob.globStrings.map = "map".asInstanceOf[typings.glob.globStrings.map]
    
    inline def pop: typings.glob.globStrings.pop = "pop".asInstanceOf[typings.glob.globStrings.pop]
    
    inline def push: typings.glob.globStrings.push = "push".asInstanceOf[typings.glob.globStrings.push]
    
    inline def reduce: typings.glob.globStrings.reduce = "reduce".asInstanceOf[typings.glob.globStrings.reduce]
    
    inline def reduceRight: typings.glob.globStrings.reduceRight = "reduceRight".asInstanceOf[typings.glob.globStrings.reduceRight]
    
    inline def reverse: typings.glob.globStrings.reverse = "reverse".asInstanceOf[typings.glob.globStrings.reverse]
    
    inline def shift: typings.glob.globStrings.shift = "shift".asInstanceOf[typings.glob.globStrings.shift]
    
    inline def slice: typings.glob.globStrings.slice = "slice".asInstanceOf[typings.glob.globStrings.slice]
    
    inline def some: typings.glob.globStrings.some = "some".asInstanceOf[typings.glob.globStrings.some]
    
    inline def sort: typings.glob.globStrings.sort = "sort".asInstanceOf[typings.glob.globStrings.sort]
    
    inline def splice: typings.glob.globStrings.splice = "splice".asInstanceOf[typings.glob.globStrings.splice]
    
    inline def unshift: typings.glob.globStrings.unshift = "unshift".asInstanceOf[typings.glob.globStrings.unshift]
    
    inline def values: typings.glob.globStrings.values = "values".asInstanceOf[typings.glob.globStrings.values]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Opts extends glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any : Opts extends glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse ? string : Opts extends glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset ? string : string | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any
    }}}
    */
  type Result[Opts] = String
  
  type Results[Opts] = js.Array[Result[Opts]]
}
