package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJob extends StObject {
  
  /**
    * [Required] Describes the job configuration.
    */
  var configuration: js.UndefOr[SchemaJobConfiguration] = js.undefined
  
  /**
    * [Output-only] A hash of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Opaque ID field of the job
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] Reference describing the unique-per-user name of the job.
    */
  var jobReference: js.UndefOr[SchemaJobReference] = js.undefined
  
  /**
    * [Output-only] The type of the resource.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] A URL that can be used to access this resource again.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Information about the job, including starting time and ending time of the job.
    */
  var statistics: js.UndefOr[SchemaJobStatistics] = js.undefined
  
  /**
    * [Output-only] The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
    */
  var status: js.UndefOr[SchemaJobStatus] = js.undefined
  
  /**
    * [Output-only] Email address of the user who ran the job.
    */
  var user_email: js.UndefOr[String | Null] = js.undefined
}
object SchemaJob {
  
  inline def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  
  extension [Self <: SchemaJob](x: Self) {
    
    inline def setConfiguration(value: SchemaJobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobReference(value: SchemaJobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
    
    inline def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatistics(value: SchemaJobStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatus(value: SchemaJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
    
    inline def setUser_emailNull: Self = StObject.set(x, "user_email", null)
    
    inline def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
  }
}
