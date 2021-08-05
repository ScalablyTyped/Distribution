package typings.googleSpreadsheet

import typings.googleSpreadsheet.mod.WorksheetBasicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var properties: WorksheetBasicProperties
  }
  object Data {
    
    inline def apply(properties: WorksheetBasicProperties): Data = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setProperties(value: WorksheetBasicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Insert extends StObject {
    
    var insert: Boolean
    
    var raw: Boolean
  }
  object Insert {
    
    inline def apply(insert: Boolean, raw: Boolean): Insert = {
      val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insert]
    }
    
    extension [Self <: Insert](x: Self) {
      
      inline def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
