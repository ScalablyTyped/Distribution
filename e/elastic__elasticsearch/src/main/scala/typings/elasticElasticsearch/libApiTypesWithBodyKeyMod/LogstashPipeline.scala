package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashPipeline extends StObject {
  
  var description: String
  
  var last_modified: DateTime
  
  var pipeline: String
  
  var pipeline_metadata: LogstashPipelineMetadata
  
  var pipeline_settings: LogstashPipelineSettings
  
  var username: String
}
object LogstashPipeline {
  
  inline def apply(
    description: String,
    last_modified: DateTime,
    pipeline: String,
    pipeline_metadata: LogstashPipelineMetadata,
    pipeline_settings: LogstashPipelineSettings,
    username: String
  ): LogstashPipeline = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], pipeline_metadata = pipeline_metadata.asInstanceOf[js.Any], pipeline_settings = pipeline_settings.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogstashPipeline] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLast_modified(value: DateTime): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipeline_metadata(value: LogstashPipelineMetadata): Self = StObject.set(x, "pipeline_metadata", value.asInstanceOf[js.Any])
    
    inline def setPipeline_settings(value: LogstashPipelineSettings): Self = StObject.set(x, "pipeline_settings", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
