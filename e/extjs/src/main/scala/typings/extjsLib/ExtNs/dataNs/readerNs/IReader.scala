package typings
package extjsLib.ExtNs.dataNs.readerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReader
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Takes a raw response object as passed to the read method and returns the useful data segment from it
  		* @param response Object The response object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var getResponseData: js.UndefOr[
    js.Function1[/* response */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IResultSet]
  ] = js.undefined
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reads the given response object
  		* @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
  		* @returns Ext.data.ResultSet The parsed or default ResultSet object
  		*/
  var read: js.UndefOr[
    js.Function1[/* response */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IResultSet]
  ] = js.undefined
  /** [Method] Abstracts common functionality used by all Reader subclasses
  		* @param data Object The raw data object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IResultSet]] = js.undefined
  /** [Config Option] (Boolean) */
  var readRecordsOnFailure: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[java.lang.String] = js.undefined
}

