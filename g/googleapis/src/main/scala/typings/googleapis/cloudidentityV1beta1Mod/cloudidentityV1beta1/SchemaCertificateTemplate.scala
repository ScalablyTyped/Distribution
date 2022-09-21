package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateTemplate extends StObject {
  
  /**
    * The template id of the template. Example: "1.3.6.1.4.1.311.21.8.15608621.11768144.5720724.16068415.6889630.81.2472537.7784047".
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Major version of the template. Example: 100.
    */
  var majorVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minor version of the template. Example: 12.
    */
  var minorVersion: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCertificateTemplate {
  
  inline def apply(): SchemaCertificateTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateTemplate]
  }
  
  extension [Self <: SchemaCertificateTemplate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionNull: Self = StObject.set(x, "majorVersion", null)
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionNull: Self = StObject.set(x, "minorVersion", null)
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
  }
}
