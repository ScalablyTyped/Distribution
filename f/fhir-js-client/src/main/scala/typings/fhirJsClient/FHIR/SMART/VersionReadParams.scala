package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter to be passed to the vread API method
  */
@js.native
trait VersionReadParams extends ReadParams {
  
  /**
    * Version ID of the resource to be fetched
    */
  var versionId: String = js.native
}
object VersionReadParams {
  
  @scala.inline
  def apply(id: String, `type`: String, versionId: String): VersionReadParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionReadParams]
  }
  
  @scala.inline
  implicit class VersionReadParamsMutableBuilder[Self <: VersionReadParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
