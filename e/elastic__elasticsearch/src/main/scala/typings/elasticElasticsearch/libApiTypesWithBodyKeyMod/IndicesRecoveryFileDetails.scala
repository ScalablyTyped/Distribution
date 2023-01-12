package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryFileDetails extends StObject {
  
  var length: long
  
  var name: String
  
  var recovered: long
}
object IndicesRecoveryFileDetails {
  
  inline def apply(length: long, name: String, recovered: long): IndicesRecoveryFileDetails = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recovered = recovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryFileDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesRecoveryFileDetails] (val x: Self) extends AnyVal {
    
    inline def setLength(value: long): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecovered(value: long): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
  }
}
