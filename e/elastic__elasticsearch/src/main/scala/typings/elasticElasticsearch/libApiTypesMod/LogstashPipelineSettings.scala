package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogstashPipelineSettings extends StObject {
  
  @JSName("pipeline.batch.delay")
  var pipelineDotbatchDotdelay: integer
  
  @JSName("pipeline.batch.size")
  var pipelineDotbatchDotsize: integer
  
  @JSName("pipeline.workers")
  var pipelineDotworkers: integer
  
  @JSName("queue.checkpoint.writes")
  var queueDotcheckpointDotwrites: integer
  
  @JSName("queue.max_bytes.number")
  var queueDotmax_bytesDotnumber: integer
  
  @JSName("queue.max_bytes.units")
  var queueDotmax_bytesDotunits: String
  
  @JSName("queue.type")
  var queueDottype: String
}
object LogstashPipelineSettings {
  
  inline def apply(
    pipelineDotbatchDotdelay: integer,
    pipelineDotbatchDotsize: integer,
    pipelineDotworkers: integer,
    queueDotcheckpointDotwrites: integer,
    queueDotmax_bytesDotnumber: integer,
    queueDotmax_bytesDotunits: String,
    queueDottype: String
  ): LogstashPipelineSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pipeline.batch.delay")(pipelineDotbatchDotdelay.asInstanceOf[js.Any])
    __obj.updateDynamic("pipeline.batch.size")(pipelineDotbatchDotsize.asInstanceOf[js.Any])
    __obj.updateDynamic("pipeline.workers")(pipelineDotworkers.asInstanceOf[js.Any])
    __obj.updateDynamic("queue.checkpoint.writes")(queueDotcheckpointDotwrites.asInstanceOf[js.Any])
    __obj.updateDynamic("queue.max_bytes.number")(queueDotmax_bytesDotnumber.asInstanceOf[js.Any])
    __obj.updateDynamic("queue.max_bytes.units")(queueDotmax_bytesDotunits.asInstanceOf[js.Any])
    __obj.updateDynamic("queue.type")(queueDottype.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogstashPipelineSettings]
  }
  
  extension [Self <: LogstashPipelineSettings](x: Self) {
    
    inline def setPipelineDotbatchDotdelay(value: integer): Self = StObject.set(x, "pipeline.batch.delay", value.asInstanceOf[js.Any])
    
    inline def setPipelineDotbatchDotsize(value: integer): Self = StObject.set(x, "pipeline.batch.size", value.asInstanceOf[js.Any])
    
    inline def setPipelineDotworkers(value: integer): Self = StObject.set(x, "pipeline.workers", value.asInstanceOf[js.Any])
    
    inline def setQueueDotcheckpointDotwrites(value: integer): Self = StObject.set(x, "queue.checkpoint.writes", value.asInstanceOf[js.Any])
    
    inline def setQueueDotmax_bytesDotnumber(value: integer): Self = StObject.set(x, "queue.max_bytes.number", value.asInstanceOf[js.Any])
    
    inline def setQueueDotmax_bytesDotunits(value: String): Self = StObject.set(x, "queue.max_bytes.units", value.asInstanceOf[js.Any])
    
    inline def setQueueDottype(value: String): Self = StObject.set(x, "queue.type", value.asInstanceOf[js.Any])
  }
}
