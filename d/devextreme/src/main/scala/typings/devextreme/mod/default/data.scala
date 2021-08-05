package typings.devextreme.mod.default

import typings.devextreme.anon.Immutable
import typings.devextreme.mod.DevExpress.data.ArrayStoreOptions
import typings.devextreme.mod.DevExpress.data.CustomStoreOptions
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.data.LocalStoreOptions
import typings.devextreme.mod.DevExpress.data.ODataContextOptions
import typings.devextreme.mod.DevExpress.data.ODataStoreOptions
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceOptions
import typings.devextreme.mod.DevExpress.data.Query
import typings.devextreme.mod.DevExpress.data.StoreOptions
import typings.devextreme.mod.DevExpress.data.XmlaStoreOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSImport("devextreme", "default.data")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devextreme", "default.data.ArrayStore")
  @js.native
  class ArrayStore ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.ArrayStore {
    def this(options: ArrayStoreOptions[typings.devextreme.mod.DevExpress.data.ArrayStore]) = this()
  }
  
  @JSImport("devextreme", "default.data.CustomStore")
  @js.native
  class CustomStore ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.CustomStore {
    def this(options: CustomStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.DataSource")
  @js.native
  class DataSource protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.DataSource {
    def this(data: js.Array[js.Any]) = this()
    def this(options: CustomStoreOptions) = this()
    def this(options: DataSourceOptions) = this()
    def this(store: typings.devextreme.mod.DevExpress.data.Store) = this()
    def this(url: String) = this()
  }
  
  @JSImport("devextreme", "default.data.EdmLiteral")
  @js.native
  class EdmLiteral protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.EdmLiteral {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.Guid")
  @js.native
  class Guid ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.Guid {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.LocalStore")
  @js.native
  class LocalStore ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.LocalStore {
    def this(options: LocalStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataContext")
  @js.native
  class ODataContext ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.ODataContext {
    def this(options: ODataContextOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataStore")
  @js.native
  class ODataStore ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.ODataStore {
    def this(options: ODataStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.PivotGridDataSource")
  @js.native
  class PivotGridDataSource ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.PivotGridDataSource {
    def this(options: PivotGridDataSourceOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.Query")
  @js.native
  class Query_ ()
    extends StObject
       with Query
  
  @JSImport("devextreme", "default.data.Store")
  @js.native
  class Store ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.Store {
    def this(options: StoreOptions[typings.devextreme.mod.DevExpress.data.Store]) = this()
  }
  
  @JSImport("devextreme", "default.data.XmlaStore")
  @js.native
  class XmlaStore ()
    extends StObject
       with typings.devextreme.mod.DevExpress.data.XmlaStore {
    def this(options: XmlaStoreOptions) = this()
  }
  
  inline def applyChanges(data: js.Array[js.Any], changes: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(data.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def applyChanges(data: js.Array[js.Any], changes: js.Array[js.Any], options: Immutable): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(data.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def base64Encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64Encode(input: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorHandler(e: Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def query(array: js.Array[js.Any]): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(array.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def query(url: String, queryOptions: js.Any): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(url.asInstanceOf[js.Any], queryOptions.asInstanceOf[js.Any])).asInstanceOf[Query]
  
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
      def keyConverters: js.Any = js.native
      inline def keyConverters_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyConverters")(x.asInstanceOf[js.Any])
    }
  }
}
