package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashPipelineMetadata extends StObject {
  
  var `type`: String
  
  var version: String
}
object LogstashPipelineMetadata {
  
  inline def apply(`type`: String, version: String): LogstashPipelineMetadata = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashPipelineMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogstashPipelineMetadata] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
