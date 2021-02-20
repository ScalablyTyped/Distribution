package typings.glob

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.glob.anon.IsDirectory
import typings.glob.globBooleans.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.minimatch.mod.IMinimatch
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glob", JSImport.Namespace)
  @js.native
  def apply(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
  @JSImport("glob", JSImport.Namespace)
  @js.native
  def apply(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
  ): IGlob = js.native
  
  @JSImport("glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob", "GlobSync")
  @js.native
  class GlobSync protected () extends IGlobBase {
    def this(pattern: String) = this()
    def this(pattern: String, options: IOptions) = this()
  }
  @JSImport("glob", "GlobSync")
  @js.native
  def GlobSync: IGlobSyncStatic = js.native
  @scala.inline
  def GlobSync_=(x: IGlobSyncStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobSync")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob", "Glob")
  @js.native
  class Glob_ protected () extends IGlob {
    def this(pattern: String) = this()
    def this(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]) = this()
    def this(pattern: String, options: IOptions) = this()
    def this(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
    ) = this()
  }
  
  @JSImport("glob", "Glob")
  @js.native
  def Glob_ : IGlobStatic = js.native
  
  @scala.inline
  def Glob__=(x: IGlobStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Glob")(x.asInstanceOf[js.Any])
  
  @JSImport("glob", "glob")
  @js.native
  def glob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof G */ js.Any = js.native
  @scala.inline
  def glob_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof G */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glob")(x.asInstanceOf[js.Any])
  
  @JSImport("glob", "hasMagic")
  @js.native
  def hasMagic(pattern: String): Boolean = js.native
  @JSImport("glob", "hasMagic")
  @js.native
  def hasMagic(pattern: String, options: IOptions): Boolean = js.native
  
  @JSImport("glob", "sync")
  @js.native
  def sync(pattern: String): js.Array[String] = js.native
  @JSImport("glob", "sync")
  @js.native
  def sync(pattern: String, options: IOptions): js.Array[String] = js.native
  
  @js.native
  trait IGlob
    extends EventEmitter
       with IGlobBase {
    
    def abort(): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
  
  @js.native
  trait IGlobBase extends StObject {
    
    var aborted: Boolean = js.native
    
    var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
    
    var found: js.Array[String] = js.native
    
    var minimatch: IMinimatch = js.native
    
    var options: IOptions = js.native
    
    var realpathCache: StringDictionary[String] = js.native
    
    var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = js.native
    
    var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
  }
  object IGlobBase {
    
    @scala.inline
    def apply(
      aborted: Boolean,
      cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]],
      found: js.Array[String],
      minimatch: IMinimatch,
      options: IOptions,
      realpathCache: StringDictionary[String],
      statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]],
      symlinks: StringDictionary[js.UndefOr[Boolean]]
    ): IGlobBase = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], minimatch = minimatch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], realpathCache = realpathCache.asInstanceOf[js.Any], statCache = statCache.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGlobBase]
    }
    
    @scala.inline
    implicit class IGlobBaseMutableBuilder[Self <: IGlobBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFound(value: js.Array[String]): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoundVarargs(value: String*): Self = StObject.set(x, "found", js.Array(value :_*))
      
      @scala.inline
      def setMinimatch(value: IMinimatch): Self = StObject.set(x, "minimatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: IOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealpathCache(value: StringDictionary[String]): Self = StObject.set(x, "realpathCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = StObject.set(x, "statCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGlobStatic
    extends EventEmitter
       with Instantiable1[/* pattern */ String, IGlob]
       with Instantiable2[
          /* pattern */ String, 
          (/* cb */ js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]) | (/* options */ IOptions), 
          IGlob
        ]
       with Instantiable3[
          /* pattern */ String, 
          /* options */ IOptions, 
          /* cb */ js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit], 
          IGlob
        ]
  
  @js.native
  trait IGlobSyncStatic
    extends Instantiable1[/* pattern */ String, IGlobBase]
       with Instantiable2[/* pattern */ String, /* options */ IOptions, IGlobBase]
  
  @js.native
  trait IOptions
    extends typings.minimatch.mod.IOptions {
    
    var absolute: js.UndefOr[Boolean] = js.native
    
    var cache: js.UndefOr[StringDictionary[Boolean | DIR | FILE | js.Array[String]]] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var follow: js.UndefOr[Boolean] = js.native
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var nodir: js.UndefOr[Boolean] = js.native
    
    var nomount: js.UndefOr[Boolean] = js.native
    
    var nosort: js.UndefOr[Boolean] = js.native
    
    var nounique: js.UndefOr[Boolean] = js.native
    
    var realpath: js.UndefOr[Boolean] = js.native
    
    var realpathCache: js.UndefOr[StringDictionary[String]] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var stat: js.UndefOr[Boolean] = js.native
    
    var statCache: js.UndefOr[StringDictionary[js.UndefOr[`false` | IsDirectory]]] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var symlinks: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.native
    
    var sync: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      @scala.inline
      def setNomount(value: Boolean): Self = StObject.set(x, "nomount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNomountUndefined: Self = StObject.set(x, "nomount", js.undefined)
      
      @scala.inline
      def setNosort(value: Boolean): Self = StObject.set(x, "nosort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNosortUndefined: Self = StObject.set(x, "nosort", js.undefined)
      
      @scala.inline
      def setNounique(value: Boolean): Self = StObject.set(x, "nounique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNouniqueUndefined: Self = StObject.set(x, "nounique", js.undefined)
      
      @scala.inline
      def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealpathCache(value: StringDictionary[String]): Self = StObject.set(x, "realpathCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealpathCacheUndefined: Self = StObject.set(x, "realpathCache", js.undefined)
      
      @scala.inline
      def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setStat(value: Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = StObject.set(x, "statCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatCacheUndefined: Self = StObject.set(x, "statCache", js.undefined)
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
}
