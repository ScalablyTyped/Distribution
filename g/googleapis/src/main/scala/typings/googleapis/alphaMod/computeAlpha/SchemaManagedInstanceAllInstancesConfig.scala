package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedInstanceAllInstancesConfig extends StObject {
  
  /**
    * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
    */
  var revision: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedInstanceAllInstancesConfig {
  
  inline def apply(): SchemaManagedInstanceAllInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceAllInstancesConfig]
  }
  
  extension [Self <: SchemaManagedInstanceAllInstancesConfig](x: Self) {
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
