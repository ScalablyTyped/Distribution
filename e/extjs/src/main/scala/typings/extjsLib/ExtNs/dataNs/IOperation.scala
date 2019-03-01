package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (RegExp) */
  var actionCommitRecordsRe: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Property] (RegExp) */
  var actionSkipSyncRe: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Method] Checks whether this operation should cause writing to occur
  		* @returns Boolean Whether the operation should cause a write to occur.
  		*/
  var allowWrite: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method is called to commit data to this instance s records given the records in the server response
  		* @param serverRecords Ext.data.Model[] An array of Ext.data.Model objects returned by the server.
  		*/
  var commitRecords: js.UndefOr[js.Function1[/* serverRecords */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the error string or object that was set using setException
  		* @returns String/Object The error object
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the records associated with this operation
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the ResultSet object if set by the Proxy
  		* @returns Ext.data.ResultSet The ResultSet object
  		*/
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  /** [Config Option] (Ext.util.Grouper[]) */
  var groupers: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Returns true if this Operation encountered an exception see also getError
  		* @returns Boolean True if there was an exception
  		*/
  var hasException: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been completed
  		* @returns Boolean True if the Operation is complete
  		*/
  var isComplete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started but has not yet completed
  		* @returns Boolean True if the Operation is currently running
  		*/
  var isRunning: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started
  		* @returns Boolean True if the Operation has started
  		*/
  var isStarted: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as having experienced an exception
  		* @param error String/Object error string/object
  		*/
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Number) */
  var start: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the Operation has completed and was successful
  		* @returns Boolean True if successful
  		*/
  var wasSuccessful: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object IOperation {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    actionCommitRecordsRe: stdLib.RegExp = null,
    actionSkipSyncRe: stdLib.RegExp = null,
    alias: extjsLib.ExtNs.Array = null,
    allowWrite: js.Function0[scala.Boolean] = null,
    alternateClassName: js.Any = null,
    batch: IBatch = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callback: js.Any = null,
    commitRecords: js.Function1[/* serverRecords */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    filters: extjsLib.ExtNs.Array = null,
    getError: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getResultSet: js.Function0[IResultSet] = null,
    groupers: extjsLib.ExtNs.Array = null,
    hasException: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IOperation] = null,
    isComplete: js.Function0[scala.Boolean] = null,
    isRunning: js.Function0[scala.Boolean] = null,
    isStarted: js.Function0[scala.Boolean] = null,
    limit: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    params: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    scope: js.Any = null,
    self: extjsLib.ExtNs.IClass = null,
    setCompleted: js.Function0[scala.Unit] = null,
    setException: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    setStarted: js.Function0[scala.Unit] = null,
    setSuccessful: js.Function0[scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sorters: extjsLib.ExtNs.Array = null,
    start: scala.Int | scala.Double = null,
    statics: js.Any = null,
    synchronous: js.UndefOr[scala.Boolean] = js.undefined,
    uses: extjsLib.ExtNs.Array = null,
    wasSuccessful: js.Function0[scala.Boolean] = null
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (actionCommitRecordsRe != null) __obj.updateDynamic("actionCommitRecordsRe")(actionCommitRecordsRe)
    if (actionSkipSyncRe != null) __obj.updateDynamic("actionSkipSyncRe")(actionSkipSyncRe)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (allowWrite != null) __obj.updateDynamic("allowWrite")(allowWrite)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (commitRecords != null) __obj.updateDynamic("commitRecords")(commitRecords)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (getError != null) __obj.updateDynamic("getError")(getError)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRecords != null) __obj.updateDynamic("getRecords")(getRecords)
    if (getResultSet != null) __obj.updateDynamic("getResultSet")(getResultSet)
    if (groupers != null) __obj.updateDynamic("groupers")(groupers)
    if (hasException != null) __obj.updateDynamic("hasException")(hasException)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isComplete != null) __obj.updateDynamic("isComplete")(isComplete)
    if (isRunning != null) __obj.updateDynamic("isRunning")(isRunning)
    if (isStarted != null) __obj.updateDynamic("isStarted")(isStarted)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (params != null) __obj.updateDynamic("params")(params)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCompleted != null) __obj.updateDynamic("setCompleted")(setCompleted)
    if (setException != null) __obj.updateDynamic("setException")(setException)
    if (setStarted != null) __obj.updateDynamic("setStarted")(setStarted)
    if (setSuccessful != null) __obj.updateDynamic("setSuccessful")(setSuccessful)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (wasSuccessful != null) __obj.updateDynamic("wasSuccessful")(wasSuccessful)
    __obj.asInstanceOf[IOperation]
  }
}

