package typings.googleSpreadsheet

import typings.googleSpreadsheet.mod.WorksheetBasicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var properties: WorksheetBasicProperties = js.native
  }
  object Data {
    
    @scala.inline
    def apply(properties: WorksheetBasicProperties): Data = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setProperties(value: WorksheetBasicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Insert extends StObject {
    
    var insert: Boolean = js.native
    
    var raw: Boolean = js.native
  }
  object Insert {
    
    @scala.inline
    def apply(insert: Boolean, raw: Boolean): Insert = {
      val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insert]
    }
    
    @scala.inline
    implicit class InsertMutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
