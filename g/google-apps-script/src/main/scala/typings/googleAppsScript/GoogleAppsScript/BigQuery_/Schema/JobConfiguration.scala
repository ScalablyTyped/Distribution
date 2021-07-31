package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfiguration extends StObject {
  
  var copy: js.UndefOr[JobConfigurationTableCopy] = js.undefined
  
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  var extract: js.UndefOr[JobConfigurationExtract] = js.undefined
  
  var jobTimeoutMs: js.UndefOr[String] = js.undefined
  
  var jobType: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Object] = js.undefined
  
  var load: js.UndefOr[JobConfigurationLoad] = js.undefined
  
  var query: js.UndefOr[JobConfigurationQuery] = js.undefined
}
object JobConfiguration {
  
  @scala.inline
  def apply(): JobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfiguration]
  }
  
  @scala.inline
  implicit class JobConfigurationMutableBuilder[Self <: JobConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: JobConfigurationTableCopy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setExtract(value: JobConfigurationExtract): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    @scala.inline
    def setJobTimeoutMs(value: String): Self = StObject.set(x, "jobTimeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTimeoutMsUndefined: Self = StObject.set(x, "jobTimeoutMs", js.undefined)
    
    @scala.inline
    def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLoad(value: JobConfigurationLoad): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setQuery(value: JobConfigurationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
