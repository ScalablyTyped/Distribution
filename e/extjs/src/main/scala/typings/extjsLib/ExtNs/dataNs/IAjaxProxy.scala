package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAjaxProxy
  extends extjsLib.ExtNs.dataNs.proxyNs.IServer {
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the HTTP method name for a given request
  		* @param request Ext.data.Request The request object
  		* @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE')
  		*/
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String]] = js.undefined
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.undefined
}

