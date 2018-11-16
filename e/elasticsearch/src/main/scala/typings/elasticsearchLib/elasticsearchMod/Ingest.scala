package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Ingest")
@js.native
class Ingest () extends js.Object {
  def deletePipeline(params: IngestDeletePipelineParams): stdLib.Promise[_] = js.native
  def deletePipeline(
    params: IngestDeletePipelineParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getPipeline(params: IngestGetPipelineParams): stdLib.Promise[_] = js.native
  def getPipeline(
    params: IngestGetPipelineParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putPipeline(params: IngestPutPipelineParams): stdLib.Promise[_] = js.native
  def putPipeline(
    params: IngestPutPipelineParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def simulate(params: IngestSimulateParams): stdLib.Promise[_] = js.native
  def simulate(
    params: IngestSimulateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

