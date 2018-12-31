package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnection
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Aborts an active request
  		* @param request Object Defaults to the last request
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Aborts all active requests */
  var abortAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoAbort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var cors: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object Defaults to the last transaction
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code
  		* @returns Object An object containing success/status state
  		*/
  var parseStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform postprocessing in a callback because it is passed to callback functions.)
  		* @returns Object The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options
  		* @param scope Object The scope to execute in
  		* @returns Object The params for the request
  		*/
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload
  		* @param url String The url to post to
  		* @param params String Any extra parameters to pass
  		* @param options Object The initial options
  		*/
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[java.lang.String], 
      /* params */ js.UndefOr[java.lang.String], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

