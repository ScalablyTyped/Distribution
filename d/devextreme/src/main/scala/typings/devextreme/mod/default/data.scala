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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSImport("devextreme", "default.data.ArrayStore")
  @js.native
  class ArrayStore ()
    extends typings.devextreme.mod.DevExpress.data.ArrayStore {
    def this(options: ArrayStoreOptions[typings.devextreme.mod.DevExpress.data.ArrayStore]) = this()
  }
  
  @JSImport("devextreme", "default.data.CustomStore")
  @js.native
  class CustomStore ()
    extends typings.devextreme.mod.DevExpress.data.CustomStore {
    def this(options: CustomStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.DataSource")
  @js.native
  class DataSource protected ()
    extends typings.devextreme.mod.DevExpress.data.DataSource {
    def this(data: js.Array[_]) = this()
    def this(options: CustomStoreOptions) = this()
    def this(options: DataSourceOptions) = this()
    def this(store: typings.devextreme.mod.DevExpress.data.Store) = this()
    def this(url: String) = this()
  }
  
  @JSImport("devextreme", "default.data.EdmLiteral")
  @js.native
  class EdmLiteral protected ()
    extends typings.devextreme.mod.DevExpress.data.EdmLiteral {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.Guid")
  @js.native
  class Guid ()
    extends typings.devextreme.mod.DevExpress.data.Guid {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.LocalStore")
  @js.native
  class LocalStore ()
    extends typings.devextreme.mod.DevExpress.data.LocalStore {
    def this(options: LocalStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataContext")
  @js.native
  class ODataContext ()
    extends typings.devextreme.mod.DevExpress.data.ODataContext {
    def this(options: ODataContextOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataStore")
  @js.native
  class ODataStore ()
    extends typings.devextreme.mod.DevExpress.data.ODataStore {
    def this(options: ODataStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.PivotGridDataSource")
  @js.native
  class PivotGridDataSource ()
    extends typings.devextreme.mod.DevExpress.data.PivotGridDataSource {
    def this(options: PivotGridDataSourceOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.Query")
  @js.native
  class Query_ () extends Query
  
  @JSImport("devextreme", "default.data.Store")
  @js.native
  class Store ()
    extends typings.devextreme.mod.DevExpress.data.Store {
    def this(options: StoreOptions[typings.devextreme.mod.DevExpress.data.Store]) = this()
  }
  
  @JSImport("devextreme", "default.data.XmlaStore")
  @js.native
  class XmlaStore ()
    extends typings.devextreme.mod.DevExpress.data.XmlaStore {
    def this(options: XmlaStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.applyChanges")
  @js.native
  def applyChanges(data: js.Array[_], changes: js.Array[_]): js.Array[_] = js.native
  @JSImport("devextreme", "default.data.applyChanges")
  @js.native
  def applyChanges(data: js.Array[_], changes: js.Array[_], options: Immutable): js.Array[_] = js.native
  
  @JSImport("devextreme", "default.data.base64_encode")
  @js.native
  def base64Encode(input: String): String = js.native
  @JSImport("devextreme", "default.data.base64_encode")
  @js.native
  def base64Encode(input: js.Array[Double]): String = js.native
  
  @JSImport("devextreme", "default.data.errorHandler")
  @js.native
  def errorHandler(e: Error): Unit = js.native
  
  @JSImport("devextreme", "default.data.query")
  @js.native
  def query(array: js.Array[_]): Query = js.native
  @JSImport("devextreme", "default.data.query")
  @js.native
  def query(url: String, queryOptions: js.Any): Query = js.native
  
  object utils {
    
    @JSImport("devextreme", "default.data.utils.compileGetter")
    @js.native
    def compileGetter(expr: String): js.Function = js.native
    @JSImport("devextreme", "default.data.utils.compileGetter")
    @js.native
    def compileGetter(expr: js.Array[String]): js.Function = js.native
    
    @JSImport("devextreme", "default.data.utils.compileSetter")
    @js.native
    def compileSetter(expr: String): js.Function = js.native
    @JSImport("devextreme", "default.data.utils.compileSetter")
    @js.native
    def compileSetter(expr: js.Array[String]): js.Function = js.native
    
    object odata {
      
      @JSImport("devextreme", "default.data.utils.odata")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("devextreme", "default.data.utils.odata.keyConverters")
      @js.native
      def keyConverters: js.Any = js.native
      @scala.inline
      def keyConverters_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyConverters")(x.asInstanceOf[js.Any])
    }
  }
}
