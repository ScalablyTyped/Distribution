package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends StObject {
  
  var DataType: String = js.native
  
  var Kind: IndexKind = js.native
  
  var Precision: Double = js.native
}
object Index {
  
  @scala.inline
  def apply(DataType: String, Kind: IndexKind, Precision: Double): Index = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: IndexKind): Self = StObject.set(x, "Kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
  }
}
