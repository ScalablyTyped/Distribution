package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkInsertInstanceResourcePerInstanceProperties extends StObject {
  
  /**
    * This field is only temporary. It will be removed. Do not use it.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaBulkInsertInstanceResourcePerInstanceProperties {
  
  inline def apply(): SchemaBulkInsertInstanceResourcePerInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkInsertInstanceResourcePerInstanceProperties]
  }
  
  extension [Self <: SchemaBulkInsertInstanceResourcePerInstanceProperties](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
