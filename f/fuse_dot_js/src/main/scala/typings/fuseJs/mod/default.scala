package typings.fuseJs.mod

import typings.fuseJs.anon.Keys
import typings.fuseJs.mod.Fuse.FuseGetFunction
import typings.fuseJs.mod.Fuse.FuseIndex
import typings.fuseJs.mod.Fuse.FuseIndexOptions
import typings.fuseJs.mod.Fuse.FuseIndexRecords
import typings.fuseJs.mod.Fuse.FuseOptionKey
import typings.fuseJs.mod.Fuse.FuseSortFunction
import typings.fuseJs.mod.Fuse.FuseSortFunctionArg
import typings.fuseJs.mod.Fuse.IFuseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fuse.js", JSImport.Default)
@js.native
open class default[T] protected ()
  extends StObject
     with Fuse[T] {
  def this(list: js.Array[T]) = this()
  def this(list: js.Array[T], options: IFuseOptions[T]) = this()
  def this(list: js.Array[T], options: Unit, index: FuseIndex[T]) = this()
  def this(list: js.Array[T], options: IFuseOptions[T], index: FuseIndex[T]) = this()
}
object default {
  
  @JSImport("fuse.js", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fuse.js", "default.FuseIndex")
  @js.native
  open class FuseIndex[T] ()
    extends StObject
       with typings.fuseJs.mod.Fuse.FuseIndex[T] {
    def this(options: FuseIndexOptions[T]) = this()
    
    /* CompleteClass */
    override def add(doc: T): Unit = js.native
    
    /* CompleteClass */
    override def create(): Unit = js.native
    
    /* CompleteClass */
    override def setIndexRecords(records: FuseIndexRecords): Unit = js.native
    
    /* CompleteClass */
    override def setKeys(keys: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setSources(docs: js.Array[T]): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): Keys = js.native
  }
  
  /* Inlined std.Required<fuse.js.fuse.js.Fuse.IFuseOptions<any>> */
  object config {
    
    @JSImport("fuse.js", "default.config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fuse.js", "default.config.distance")
    @js.native
    def distance: Double = js.native
    inline def distance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("distance")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.fieldNormWeight")
    @js.native
    def fieldNormWeight: Double = js.native
    inline def fieldNormWeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fieldNormWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.findAllMatches")
    @js.native
    def findAllMatches: Boolean = js.native
    inline def findAllMatches_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllMatches")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.getFn")
    @js.native
    def getFn: FuseGetFunction[Any] = js.native
    inline def getFn(obj: Any, path: String): js.Array[String] | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | String]
    inline def getFn(obj: Any, path: js.Array[String]): js.Array[String] | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | String]
    inline def getFn_=(x: FuseGetFunction[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFn")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.ignoreFieldNorm")
    @js.native
    def ignoreFieldNorm: Boolean = js.native
    inline def ignoreFieldNorm_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreFieldNorm")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.ignoreLocation")
    @js.native
    def ignoreLocation: Boolean = js.native
    inline def ignoreLocation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreLocation")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.includeMatches")
    @js.native
    def includeMatches: Boolean = js.native
    inline def includeMatches_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("includeMatches")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.includeScore")
    @js.native
    def includeScore: Boolean = js.native
    inline def includeScore_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("includeScore")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.isCaseSensitive")
    @js.native
    def isCaseSensitive: Boolean = js.native
    inline def isCaseSensitive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.keys")
    @js.native
    def keys: js.Array[FuseOptionKey[Any]] = js.native
    inline def keys_=(x: js.Array[FuseOptionKey[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.location")
    @js.native
    def location: Double = js.native
    inline def location_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.minMatchCharLength")
    @js.native
    def minMatchCharLength: Double = js.native
    inline def minMatchCharLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minMatchCharLength")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.shouldSort")
    @js.native
    def shouldSort: Boolean = js.native
    inline def shouldSort_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldSort")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.sortFn")
    @js.native
    def sortFn: FuseSortFunction = js.native
    inline def sortFn(a: FuseSortFunctionArg, b: FuseSortFunctionArg): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortFn")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sortFn_=(x: FuseSortFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.threshold")
    @js.native
    def threshold: Double = js.native
    inline def threshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("fuse.js", "default.config.useExtendedSearch")
    @js.native
    def useExtendedSearch: Boolean = js.native
    inline def useExtendedSearch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useExtendedSearch")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Use this method to pre-generate the index from the list, and pass it
    * directly into the Fuse instance.
    *
    * _Note that Fuse will automatically index the table if one isn't provided
    * during instantiation._
    *
    * ```typescript
    * const list: MyType[] = [myType1, myType2, etc...]
    *
    * const index = Fuse.createIndex<MyType>(
    *  keys: ['key1', 'key2']
    *  list: list
    * )
    *
    * const options: Fuse.IFuseOptions<MyType> = {
    *  keys: ['key1', 'key2']
    * }
    *
    * const myFuse = new Fuse(list, options, index)
    * ```
    * @param keys    The keys to index
    * @param list    The list from which to create an index
    * @param options?
    * @returns An indexed list
    */
  /* static member */
  inline def createIndex[U](keys: js.Array[FuseOptionKey[U]], list: js.Array[U]): typings.fuseJs.mod.Fuse.FuseIndex[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndex")(keys.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[typings.fuseJs.mod.Fuse.FuseIndex[U]]
  inline def createIndex[U](keys: js.Array[FuseOptionKey[U]], list: js.Array[U], options: FuseIndexOptions[U]): typings.fuseJs.mod.Fuse.FuseIndex[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndex")(keys.asInstanceOf[js.Any], list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fuseJs.mod.Fuse.FuseIndex[U]]
  
  /* static member */
  inline def parseIndex[U](index: Any): typings.fuseJs.mod.Fuse.FuseIndex[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIndex")(index.asInstanceOf[js.Any]).asInstanceOf[typings.fuseJs.mod.Fuse.FuseIndex[U]]
  inline def parseIndex[U](index: Any, options: FuseIndexOptions[U]): typings.fuseJs.mod.Fuse.FuseIndex[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseIndex")(index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fuseJs.mod.Fuse.FuseIndex[U]]
  
  /**
    * Return the current version.
    */
  /* static member */
  @JSImport("fuse.js", "default.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
