package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var connectionClass: js.UndefOr[
    java.lang.String | (org.scalablytyped.runtime.Instantiable2[
      /* host */ js.Any, 
      /* config */ js.Any, 
      elasticsearchLib.srcLibConnectorsHttpMod.namespaced
    ])
  ] = js.undefined
  var createNodeAgent: js.UndefOr[js.Any] = js.undefined
  var deadTimeout: js.UndefOr[scala.Double] = js.undefined
  var defer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var host: js.UndefOr[js.Any] = js.undefined
  var hosts: js.UndefOr[js.Any] = js.undefined
  var httpAuth: js.UndefOr[java.lang.String] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  var nodesToHostCallback: js.UndefOr[js.Any] = js.undefined
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var selector: js.UndefOr[js.Any] = js.undefined
  var sniffInterval: js.UndefOr[scala.Double] = js.undefined
  var sniffOnConnectionFault: js.UndefOr[scala.Boolean] = js.undefined
  var sniffOnStart: js.UndefOr[scala.Boolean] = js.undefined
  var sniffedNodesProtocol: js.UndefOr[java.lang.String] = js.undefined
  var ssl: js.UndefOr[js.Object] = js.undefined
  var suggestCompression: js.UndefOr[scala.Boolean] = js.undefined
}

