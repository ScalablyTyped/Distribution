package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerProxy
  extends extjsLib.ExtNs.dataNs.proxyNs.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[
      /* request */ js.UndefOr[IRequest], 
      /* success */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Method] Creates an Request object from Operation
  		* @param operation Ext.data.Operation The operation to execute
  		* @returns Ext.data.Request The request object
  		*/
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.undefined
  /** [Method] Generates a url based on a given Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns String The url
  		*/
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Performs the given destroy operation  */
  @JSName("destroy")
  var destroy_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Ext.data.Operation The Ext.data.Operation object
  		* @param callback Function The callback function to call when the Operation has completed
  		* @param scope Object The scope in which to execute the callback
  		*/
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[extjsLib.ExtNs.Array], java.lang.String]] = js.undefined
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[extjsLib.ExtNs.Array], java.lang.String]] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupDirectionParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var idParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleGroupMode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var startParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

