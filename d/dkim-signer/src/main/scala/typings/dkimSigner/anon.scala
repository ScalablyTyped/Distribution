package typings.dkimSigner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FieldNames extends StObject {
    
    var fieldNames: String
    
    var headers: String
  }
  object FieldNames {
    
    inline def apply(fieldNames: String, headers: String): FieldNames = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldNames]
    }
    
    extension [Self <: FieldNames](x: Self) {
      
      inline def setFieldNames(value: String): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
