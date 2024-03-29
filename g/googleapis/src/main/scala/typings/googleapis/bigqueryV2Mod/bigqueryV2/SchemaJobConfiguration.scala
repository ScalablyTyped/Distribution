package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobConfiguration extends StObject {
  
  /**
    * [Pick one] Copies a table.
    */
  var copy: js.UndefOr[SchemaJobConfigurationTableCopy] = js.undefined
  
  /**
    * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
    */
  var dryRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Pick one] Configures an extract job.
    */
  var extract: js.UndefOr[SchemaJobConfigurationExtract] = js.undefined
  
  /**
    * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
    */
  var jobTimeoutMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN.
    */
  var jobType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * [Pick one] Configures a load job.
    */
  var load: js.UndefOr[SchemaJobConfigurationLoad] = js.undefined
  
  /**
    * [Pick one] Configures a query job.
    */
  var query: js.UndefOr[SchemaJobConfigurationQuery] = js.undefined
}
object SchemaJobConfiguration {
  
  inline def apply(): SchemaJobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobConfiguration]
  }
  
  extension [Self <: SchemaJobConfiguration](x: Self) {
    
    inline def setCopy(value: SchemaJobConfigurationTableCopy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunNull: Self = StObject.set(x, "dryRun", null)
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setExtract(value: SchemaJobConfigurationExtract): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setJobTimeoutMs(value: String): Self = StObject.set(x, "jobTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutMsNull: Self = StObject.set(x, "jobTimeoutMs", null)
    
    inline def setJobTimeoutMsUndefined: Self = StObject.set(x, "jobTimeoutMs", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeNull: Self = StObject.set(x, "jobType", null)
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLoad(value: SchemaJobConfigurationLoad): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setQuery(value: SchemaJobConfigurationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
