package typings
package extjsLib.ExtNs.dataNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRest extends IAjax {
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object IRest {
  @scala.inline
  def apply(
    actionMethods: js.Any = null,
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
    afterRequest: js.Function2[
      /* request */ js.UndefOr[extjsLib.ExtNs.dataNs.IRequest], 
      /* success */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    appendId: js.UndefOr[scala.Boolean] = js.undefined,
    batch: js.Function1[/* options */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IBatch] = null,
    batchActions: js.UndefOr[scala.Boolean] = js.undefined,
    batchOrder: java.lang.String = null,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    buildRequest: js.Function1[
      /* operation */ js.UndefOr[extjsLib.ExtNs.dataNs.IOperation], 
      extjsLib.ExtNs.dataNs.IRequest
    ] = null,
    buildUrl: js.Function1[/* request */ js.UndefOr[extjsLib.ExtNs.dataNs.IRequest], java.lang.String] = null,
    cacheString: java.lang.String = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    create: js.Function0[scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    directionParam: java.lang.String = null,
    doRequest: js.Function3[
      /* operation */ js.UndefOr[extjsLib.ExtNs.dataNs.IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    encodeFilters: js.Function1[/* filters */ js.UndefOr[extjsLib.ExtNs.Array], java.lang.String] = null,
    encodeSorters: js.Function1[/* sorters */ js.UndefOr[extjsLib.ExtNs.Array], java.lang.String] = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    filterParam: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    format: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMethod: js.Function1[/* request */ js.UndefOr[extjsLib.ExtNs.dataNs.IRequest], java.lang.String] = null,
    getModel: js.Function0[extjsLib.ExtNs.dataNs.IModel] = null,
    getReader: js.Function0[extjsLib.ExtNs.dataNs.readerNs.IReader] = null,
    getWriter: js.Function0[extjsLib.ExtNs.dataNs.writerNs.IWriter] = null,
    groupDirectionParam: java.lang.String = null,
    groupParam: java.lang.String = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    headers: js.Any = null,
    idParam: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IRest] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isProxy: js.UndefOr[scala.Boolean] = js.undefined,
    isSynchronous: js.UndefOr[scala.Boolean] = js.undefined,
    limitParam: java.lang.String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
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
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    pageParam: java.lang.String = null,
    read: js.Function0[scala.Unit] = null,
    reader: js.Any = null,
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
    self: extjsLib.ExtNs.IClass = null,
    setExtraParam: js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setModel: js.Function2[
      /* model */ js.UndefOr[js.Any], 
      /* setOnStore */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    setReader: js.Function1[/* reader */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.readerNs.IReader] = null,
    setWriter: js.Function1[/* writer */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.writerNs.IWriter] = null,
    simpleGroupMode: js.UndefOr[scala.Boolean] = js.undefined,
    simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sortParam: java.lang.String = null,
    startParam: java.lang.String = null,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    timeout: scala.Int | scala.Double = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    update: js.Function0[scala.Unit] = null,
    url: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null,
    writer: js.Any = null
  ): IRest = {
    val __obj = js.Dynamic.literal()
    if (actionMethods != null) __obj.updateDynamic("actionMethods")(actionMethods)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(afterRequest)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (api != null) __obj.updateDynamic("api")(api)
    if (!js.isUndefined(appendId)) __obj.updateDynamic("appendId")(appendId)
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions)
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(buildRequest)
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(buildUrl)
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam)
    if (doRequest != null) __obj.updateDynamic("doRequest")(doRequest)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(encodeFilters)
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(encodeSorters)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams)
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getReader != null) __obj.updateDynamic("getReader")(getReader)
    if (getWriter != null) __obj.updateDynamic("getWriter")(getWriter)
    if (groupDirectionParam != null) __obj.updateDynamic("groupDirectionParam")(groupDirectionParam)
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (idParam != null) __obj.updateDynamic("idParam")(idParam)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isProxy)) __obj.updateDynamic("isProxy")(isProxy)
    if (!js.isUndefined(isSynchronous)) __obj.updateDynamic("isSynchronous")(isSynchronous)
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (on != null) __obj.updateDynamic("on")(on)
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam)
    if (read != null) __obj.updateDynamic("read")(read)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(setExtraParam)
    if (setModel != null) __obj.updateDynamic("setModel")(setModel)
    if (setReader != null) __obj.updateDynamic("setReader")(setReader)
    if (setWriter != null) __obj.updateDynamic("setWriter")(setWriter)
    if (!js.isUndefined(simpleGroupMode)) __obj.updateDynamic("simpleGroupMode")(simpleGroupMode)
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam)
    if (startParam != null) __obj.updateDynamic("startParam")(startParam)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (update != null) __obj.updateDynamic("update")(update)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[IRest]
  }
}

