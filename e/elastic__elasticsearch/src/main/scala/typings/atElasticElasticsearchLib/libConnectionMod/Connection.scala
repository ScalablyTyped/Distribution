package typings
package atElasticElasticsearchLib.libConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var _agent: nodeLib.httpMod.Agent = js.native
  var _openRequests: scala.Double = js.native
  var _status: java.lang.String = js.native
  var deadCount: scala.Double = js.native
  var headers: js.Any = js.native
  var id: java.lang.String = js.native
  var makeRequest: js.Any = js.native
  var resurrectTimeout: scala.Double = js.native
  var roles: js.Any = js.native
  var ssl: nodeLib.tlsMod.ConnectionOptions | scala.Null = js.native
  var status: java.lang.String = js.native
  var statuses: js.Any = js.native
  var url: nodeLib.urlMod.URL = js.native
  def buildRequestObject(params: js.Any): nodeLib.httpMod.ClientRequestArgs = js.native
  def close(): Connection = js.native
  def request(
    params: RequestOptions,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* response */ nodeLib.httpMod.IncomingMessage | scala.Null, 
      scala.Unit
    ]
  ): nodeLib.httpMod.ClientRequest = js.native
  def setRole(role: java.lang.String, enabled: scala.Boolean): Connection = js.native
  def toJSON(): js.Any = js.native
}

