package typings
package extjsLib.ExtNs.dataNs.flashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBinaryXhr
  extends extjsLib.ExtNs.IBase {
  /** [Method] Abort this connection  */
  var abort: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest  */
  var getAllResponseHeaders: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param header Object
  		*/
  var getResponseHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest  */
  var onreadystatechange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param method Object
  		* @param url Object
  		* @param async Object
  		* @param user Object
  		* @param password Object
  		*/
  var open: js.UndefOr[
    js.Function5[
      /* method */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[js.Any], 
      /* async */ js.UndefOr[js.Any], 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param mimeType Object
  		*/
  var overrideMimeType: js.UndefOr[js.Function1[/* mimeType */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (number) */
  var readyState: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Array) */
  var responseBytes: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Initiate the request
  		* @param body Array an array of byte values to send.
  		*/
  var send: js.UndefOr[js.Function1[/* body */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param header Object
  		* @param value Object
  		*/
  var setRequestHeader: js.UndefOr[
    js.Function2[/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Property] (number) */
  var status: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (String) */
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

