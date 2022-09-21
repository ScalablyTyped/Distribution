package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Ingest")
@js.native
open class Ingest () extends StObject {
  
  def deletePipeline(params: IngestDeletePipelineParams): js.Promise[Any] = js.native
  def deletePipeline(
    params: IngestDeletePipelineParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def getPipeline(params: IngestGetPipelineParams): js.Promise[Any] = js.native
  def getPipeline(
    params: IngestGetPipelineParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def putPipeline(params: IngestPutPipelineParams): js.Promise[Any] = js.native
  def putPipeline(
    params: IngestPutPipelineParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def simulate(params: IngestSimulateParams): js.Promise[Any] = js.native
  def simulate(
    params: IngestSimulateParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
}
