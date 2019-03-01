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

object IReader {
  @scala.inline
  def apply(
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getResponseData: js.Function1[/* response */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IResultSet] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    idProperty: java.lang.String = null,
    implicitIncludes: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IReader] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    messageProperty: java.lang.String = null,
    metaData: js.Any = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    rawData: js.Any = null,
    read: js.Function1[/* response */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IResultSet] = null,
    readRecords: js.Function1[/* data */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IResultSet] = null,
    readRecordsOnFailure: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    root: java.lang.String = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    successProperty: java.lang.String = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    totalProperty: java.lang.String = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IReader = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getResponseData != null) __obj.updateDynamic("getResponseData")(getResponseData)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (!js.isUndefined(implicitIncludes)) __obj.updateDynamic("implicitIncludes")(implicitIncludes)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (messageProperty != null) __obj.updateDynamic("messageProperty")(messageProperty)
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (rawData != null) __obj.updateDynamic("rawData")(rawData)
    if (read != null) __obj.updateDynamic("read")(read)
    if (readRecords != null) __obj.updateDynamic("readRecords")(readRecords)
    if (!js.isUndefined(readRecordsOnFailure)) __obj.updateDynamic("readRecordsOnFailure")(readRecordsOnFailure)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (root != null) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (successProperty != null) __obj.updateDynamic("successProperty")(successProperty)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (totalProperty != null) __obj.updateDynamic("totalProperty")(totalProperty)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IReader]
  }
}

