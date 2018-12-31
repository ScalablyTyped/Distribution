package typings
package elasticsearchLib.srcLibConnectorsHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConnector extends js.Object {
  // onStatusSet(handler: (status: any) => void): void;
  def createAgent(config: js.Any): js.Any
  def makeAgentConfig(config: js.Any): js.Any
  def makeReqParams(params: js.Any): js.Any
  def request(
    params: js.Any,
    callback: js.Function4[
      /* error */ js.Any, 
      /* response */ js.Any, 
      /* status */ js.Any, 
      /* headers */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit
}

