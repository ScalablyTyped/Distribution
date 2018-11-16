package typings
package extjsLib.ExtNs.dataNs.writerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IWriter
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Ext.data.Model The record that we are writing to the server.
  		* @param operation Ext.data.Operation An operation object.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[
    js.Function2[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* operation */ js.UndefOr[extjsLib.ExtNs.dataNs.IOperation], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns Ext.data.Request The modified request object
  		*/
  var write: js.UndefOr[
    js.Function1[
      /* request */ js.UndefOr[extjsLib.ExtNs.dataNs.IRequest], 
      extjsLib.ExtNs.dataNs.IRequest
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var writeRecordId: js.UndefOr[scala.Boolean] = js.undefined
}

