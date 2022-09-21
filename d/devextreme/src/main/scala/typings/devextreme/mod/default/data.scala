package typings.devextreme.mod.default

import typings.devextreme.anon.Immutable
import typings.devextreme.mod.DevExpress.data.ArrayStore.Options
import typings.devextreme.mod.DevExpress.data.ODataContextOptions
import typings.devextreme.mod.DevExpress.data.Query
import typings.devextreme.mod.DevExpress.data.XmlaStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSImport("devextreme", "default.data")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devextreme", "default.data.ArrayStore")
  @js.native
  open class ArrayStore[TItem, TKey] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.ArrayStore[TItem, TKey] {
    def this(options: Options[TItem, TKey]) = this()
  }
  
  @JSImport("devextreme", "default.data.CustomStore")
  @js.native
  open class CustomStore[TItem, TKey] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.CustomStore[TItem, TKey] {
    def this(options: typings.devextreme.mod.DevExpress.data.CustomStore.Options[TItem, TKey]) = this()
  }
  
  @JSImport("devextreme", "default.data.DataSource")
  @js.native
  open class DataSource[TItem, TKey] protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.DataSource[TItem, TKey] {
    def this(data: js.Array[TItem]) = this()
    def this(options: typings.devextreme.mod.DevExpress.data.CustomStore.Options[TItem, TKey]) = this()
    def this(options: typings.devextreme.mod.DevExpress.data.DataSource.Options[Any, Any, TItem, TKey]) = this()
    def this(store: typings.devextreme.mod.DevExpress.data.utils.Store[TItem, TKey]) = this()
    def this(url: String) = this()
  }
  
  @JSImport("devextreme", "default.data.EdmLiteral")
  @js.native
  open class EdmLiteral protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.EdmLiteral {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.Guid")
  @js.native
  open class Guid ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.Guid {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.LocalStore")
  @js.native
  open class LocalStore[TItem, TKey] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.LocalStore[TItem, TKey] {
    def this(options: typings.devextreme.mod.DevExpress.data.LocalStore.Options[TItem, TKey]) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataContext")
  @js.native
  open class ODataContext ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.ODataContext {
    def this(options: ODataContextOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataStore")
  @js.native
  open class ODataStore[TItem, TKey] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.ODataStore[TItem, TKey] {
    def this(options: typings.devextreme.mod.DevExpress.data.ODataStore.Options[TItem, TKey]) = this()
  }
  
  @JSImport("devextreme", "default.data.PivotGridDataSource")
  @js.native
  open class PivotGridDataSource ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.PivotGridDataSource {
    def this(options: typings.devextreme.mod.DevExpress.data.PivotGridDataSource.Options) = this()
  }
  
  @JSImport("devextreme", "default.data.Store")
  @js.native
  open class Store[TItem, TKey] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.Store[TItem, TKey] {
    def this(options: typings.devextreme.mod.DevExpress.data.Store.Options[TItem, TKey]) = this()
  }
  
  @JSImport("devextreme", "default.data.XmlaStore")
  @js.native
  open class XmlaStore ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.XmlaStore {
    def this(options: XmlaStoreOptions) = this()
  }
  
  inline def applyChanges(data: js.Array[Any], changes: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(data.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def applyChanges(data: js.Array[Any], changes: js.Array[Any], options: Immutable): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(data.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def base64Encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64Encode(input: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorHandler(e: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def query(array: js.Array[Any]): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(array.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def query(url: String, queryOptions: Any): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(url.asInstanceOf[js.Any], queryOptions.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def setErrorHandler(handler: js.Function1[/* e */ js.Error, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object utils {
    
    @JSImport("devextreme", "default.data.utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compileGetter(expr: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compileGetter")(expr.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def compileGetter(expr: js.Array[String]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compileGetter")(expr.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    inline def compileSetter(expr: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compileSetter")(expr.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def compileSetter(expr: js.Array[String]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compileSetter")(expr.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    object odata {
      
      @JSImport("devextreme", "default.data.utils.odata")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("devextreme", "default.data.utils.odata.keyConverters")
      @js.native
      def keyConverters: Any = js.native
      inline def keyConverters_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyConverters")(x.asInstanceOf[js.Any])
    }
  }
}
