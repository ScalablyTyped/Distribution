package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var Description: String
  
  var Name: String
  
  var Settable: js.Array[String]
  
  var Value: String
}
object Args {
  
  inline def apply(Description: String, Name: String, Settable: js.Array[String], Value: String): Args = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSettable(value: js.Array[String]): Self = StObject.set(x, "Settable", value.asInstanceOf[js.Any])
    
    inline def setSettableVarargs(value: String*): Self = StObject.set(x, "Settable", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
