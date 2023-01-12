package typings.glob

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.glob.anon.IsDirectory
import typings.glob.anon.Typeoffs
import typings.glob.globBooleans.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.minimatch.mod.IMinimatch
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]): IGlob = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[IGlob]
  inline def apply(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
  ): IGlob = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[IGlob]
  
  @JSImport("glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob", "GlobSync")
  @js.native
  open class GlobSync protected ()
    extends StObject
       with IGlobBase {
    def this(pattern: String) = this()
    def this(pattern: String, options: IOptions) = this()
    
    /* CompleteClass */
    var aborted: Boolean = js.native
    
    /* CompleteClass */
    var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
    
    /* CompleteClass */
    var found: js.Array[String] = js.native
    
    /* CompleteClass */
    var minimatch: IMinimatch = js.native
    
    /* CompleteClass */
    var options: IOptions = js.native
    
    /* CompleteClass */
    var realpathCache: StringDictionary[String] = js.native
    
    /* CompleteClass */
    var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = js.native
    
    /* CompleteClass */
    var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
  }
  @JSImport("glob", "GlobSync")
  @js.native
  def GlobSync: IGlobSyncStatic = js.native
  inline def GlobSync_=(x: IGlobSyncStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobSync")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob", "Glob")
  @js.native
  open class Glob_ protected () extends IGlob {
    def this(pattern: String) = this()
    def this(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]) = this()
    def this(pattern: String, options: IOptions) = this()
    def this(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
    ) = this()
    
    /* CompleteClass */
    var aborted: Boolean = js.native
    
    /* CompleteClass */
    var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
    
    /* CompleteClass */
    var found: js.Array[String] = js.native
    
    /* CompleteClass */
    var minimatch: IMinimatch = js.native
    
    /* CompleteClass */
    var options: IOptions = js.native
    
    /* CompleteClass */
    var realpathCache: StringDictionary[String] = js.native
    
    /* CompleteClass */
    var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = js.native
    
    /* CompleteClass */
    var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
  }
  
  @JSImport("glob", "Glob")
  @js.native
  def Glob_ : IGlobStatic = js.native
  
  inline def Glob__=(x: IGlobStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Glob")(x.asInstanceOf[js.Any])
  
  @JSImport("glob", "glob")
  @js.native
  def glob: js.Function3[
    /* pattern */ String, 
    /* options */ IOptions, 
    /* cb */ js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit], 
    IGlob
  ] = js.native
  inline def glob_=(
    x: js.Function3[
      /* pattern */ String, 
      /* options */ IOptions, 
      /* cb */ js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit], 
      IGlob
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glob")(x.asInstanceOf[js.Any])
  
  inline def hasMagic(pattern: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasMagic(pattern: String, options: IOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sync(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sync(pattern: String, options: IOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @js.native
  trait IGlob
    extends EventEmitter
       with IGlobBase {
    
    def abort(): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
  
  trait IGlobBase extends StObject {
    
    var aborted: Boolean
    
    var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]]
    
    var found: js.Array[String]
    
    var minimatch: IMinimatch
    
    var options: IOptions
    
    var realpathCache: StringDictionary[String]
    
    var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]]
    
    var symlinks: StringDictionary[js.UndefOr[Boolean]]
  }
  object IGlobBase {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IGlobBase] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setFound(value: js.Array[String]): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setFoundVarargs(value: String*): Self = StObject.set(x, "found", js.Array(value*))
      
      inline def setMinimatch(value: IMinimatch): Self = StObject.set(x, "minimatch", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRealpathCache(value: StringDictionary[String]): Self = StObject.set(x, "realpathCache", value.asInstanceOf[js.Any])
      
      inline def setStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = StObject.set(x, "statCache", value.asInstanceOf[js.Any])
      
      inline def setSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable3 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined  */ @js.native
  trait IGlobStatic extends EventEmitter
  
  @js.native
  trait IGlobSyncStatic
    extends StObject
       with Instantiable1[/* pattern */ String, IGlobBase]
       with Instantiable2[/* pattern */ String, /* options */ IOptions, IGlobBase]
  
  trait IOptions
    extends StObject
       with typings.minimatch.mod.IOptions {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[StringDictionary[Boolean | DIR | FILE | js.Array[String]]] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var follow: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[Typeoffs] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var nodir: js.UndefOr[Boolean] = js.undefined
    
    var nomount: js.UndefOr[Boolean] = js.undefined
    
    var nosort: js.UndefOr[Boolean] = js.undefined
    
    var nounique: js.UndefOr[Boolean] = js.undefined
    
    var realpath: js.UndefOr[Boolean] = js.undefined
    
    var realpathCache: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var stat: js.UndefOr[Boolean] = js.undefined
    
    var statCache: js.UndefOr[StringDictionary[js.UndefOr[`false` | IsDirectory]]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var symlinks: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setFs(value: Typeoffs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      inline def setNomount(value: Boolean): Self = StObject.set(x, "nomount", value.asInstanceOf[js.Any])
      
      inline def setNomountUndefined: Self = StObject.set(x, "nomount", js.undefined)
      
      inline def setNosort(value: Boolean): Self = StObject.set(x, "nosort", value.asInstanceOf[js.Any])
      
      inline def setNosortUndefined: Self = StObject.set(x, "nosort", js.undefined)
      
      inline def setNounique(value: Boolean): Self = StObject.set(x, "nounique", value.asInstanceOf[js.Any])
      
      inline def setNouniqueUndefined: Self = StObject.set(x, "nounique", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathCache(value: StringDictionary[String]): Self = StObject.set(x, "realpathCache", value.asInstanceOf[js.Any])
      
      inline def setRealpathCacheUndefined: Self = StObject.set(x, "realpathCache", js.undefined)
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStat(value: Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = StObject.set(x, "statCache", value.asInstanceOf[js.Any])
      
      inline def setStatCacheUndefined: Self = StObject.set(x, "statCache", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
}
