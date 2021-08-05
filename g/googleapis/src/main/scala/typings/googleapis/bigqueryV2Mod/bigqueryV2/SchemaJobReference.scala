package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobReference extends StObject {
  
  /**
    * [Required] The ID of the job. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length
    * is 1,024 characters.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic location of the job. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The ID of the project containing this job.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object SchemaJobReference {
  
  inline def apply(): SchemaJobReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobReference]
  }
  
  extension [Self <: SchemaJobReference](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
