package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter to be passed to the vread API method
  */
trait VersionReadParams
  extends StObject
     with ReadParams {
  
  /**
    * Version ID of the resource to be fetched
    */
  var versionId: String
}
object VersionReadParams {
  
  inline def apply(id: String, `type`: String, versionId: String): VersionReadParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionReadParams]
  }
  
  extension [Self <: VersionReadParams](x: Self) {
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
