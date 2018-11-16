package typings
package extjsLib.ExtNs.dataNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IJsonP extends IServer {
  /** [Method] Aborts the current server request if one is currently running */
  var abort: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Encodes an array of records into a value suitable to be added to the request params as the recordParam parameter
  		* @param records Ext.data.Model[] The records array
  		* @returns Array An array of record data objects
  		*/
  var encodeRecords: js.UndefOr[
    js.Function1[/* records */ js.UndefOr[extjsLib.ExtNs.Array], extjsLib.ExtNs.Array]
  ] = js.undefined
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[java.lang.String] = js.undefined
}

