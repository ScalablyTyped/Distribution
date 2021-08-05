package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var DataType: String
  
  var Kind: IndexKind
  
  var Precision: Double
}
object Index {
  
  inline def apply(DataType: String, Kind: IndexKind, Precision: Double): Index = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: IndexKind): Self = StObject.set(x, "Kind", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
  }
}
