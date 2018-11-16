package typings
package elasticsearchLib.srcLibConnectorsHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch/src/lib/connectors/http", JSImport.Namespace)
@js.native
class namespaced protected () extends HttpConnector {
  def this(host: js.Any, config: js.Any) = this()
  // onStatusSet(handler: (status: any) => void): void;
  /* CompleteClass */
  override def createAgent(config: js.Any): js.Any = js.native
  /* CompleteClass */
  override def makeAgentConfig(config: js.Any): js.Any = js.native
  /* CompleteClass */
  override def makeReqParams(params: js.Any): js.Any = js.native
  /* CompleteClass */
  override def request(
    params: js.Any,
    callback: js.Function4[
      /* error */ js.Any, 
      /* response */ js.Any, 
      /* status */ js.Any, 
      /* headers */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

