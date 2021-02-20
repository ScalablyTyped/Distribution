package typings.emberDebug

import typings.emberDebug.anon.Columns
import typings.emberDebug.dataAdapterMod.DataAdapter.Column
import typings.emberDebug.dataAdapterMod.DataAdapter.WrappedRecord
import typings.emberDebug.dataAdapterMod.DataAdapter.WrappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataAdapterMod {
  
  @JSImport("@ember/debug/data-adapter", JSImport.Default)
  @js.native
  class default () extends DataAdapter
  
  @js.native
  trait DataAdapter
    extends typings.emberObject.mod.default {
    
    /**
      * Ember Data > v1.0.0-beta.18
      * requires string model names to be passed
      * around instead of the actual factories.
      */
    var acceptsModelName: Boolean = js.native
    
    /**
      * The container-debug-adapter which is used
      * to list all models.
      */
    var containerDebugAdapter: typings.emberDebug.containerDebugAdapterMod.default = js.native
    
    /**
      * Specifies how records can be filtered.
      * Records returned will need to have a `filterValues`
      * property with a key for every name in the returned array.
      */
    def getFilters(): js.Array[Column] = js.native
    
    /**
      * Fetch the model types and observe them for changes.
      */
    def watchModelTypes(
      typesAdded: js.Function1[/* types */ js.Array[WrappedType], Unit],
      typesUpdated: js.Function1[/* types */ js.Array[WrappedType], Unit]
    ): js.Function0[Unit] = js.native
    
    /**
      * Fetch the records of a given type and observe them for changes.
      */
    def watchRecords(
      modelName: String,
      recordsAdded: js.Function1[/* records */ js.Array[WrappedRecord], Unit],
      recordsUpdated: js.Function1[/* records */ js.Array[WrappedRecord], Unit],
      recordsRemoved: js.Function2[/* idx */ Double, /* count */ Double, Unit]
    ): js.Function0[Unit] = js.native
  }
  object DataAdapter {
    
    @js.native
    trait Column extends StObject {
      
      var desc: String = js.native
      
      var name: String = js.native
    }
    object Column {
      
      @scala.inline
      def apply(desc: String, name: String): Column = {
        val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Column]
      }
      
      @scala.inline
      implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WrappedRecord extends StObject {
      
      var columnValues: js.Object = js.native
      
      var `object`: js.Object = js.native
    }
    object WrappedRecord {
      
      @scala.inline
      def apply(columnValues: js.Object, `object`: js.Object): WrappedRecord = {
        val __obj = js.Dynamic.literal(columnValues = columnValues.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.asInstanceOf[WrappedRecord]
      }
      
      @scala.inline
      implicit class WrappedRecordMutableBuilder[Self <: WrappedRecord] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnValues(value: js.Object): Self = StObject.set(x, "columnValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WrappedType extends StObject {
      
      def release(): Unit = js.native
      
      var `type`: Columns = js.native
    }
    object WrappedType {
      
      @scala.inline
      def apply(release: () => Unit, `type`: Columns): WrappedType = {
        val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[WrappedType]
      }
      
      @scala.inline
      implicit class WrappedTypeMutableBuilder[Self <: WrappedType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
        
        @scala.inline
        def setType(value: Columns): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
