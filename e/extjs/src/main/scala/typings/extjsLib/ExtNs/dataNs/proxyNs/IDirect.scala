package typings
package extjsLib.ExtNs.dataNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDirect extends IServer {
  /** [Method] inherit docs
  		* @returns String The url
  		*/
  @JSName("buildUrl")
  var buildUrl_IDirect: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("doRequest")
  var doRequest_IDirect: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined
}

