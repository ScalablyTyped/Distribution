package typings
package extjsLib.ExtNs.formNs.actionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectSubmit extends ISubmit

object IDirectSubmit {
  @scala.inline
  def apply(
    CLIENT_INVALID: java.lang.String = null,
    CONNECT_FAILURE: java.lang.String = null,
    LOAD_FAILURE: java.lang.String = null,
    SERVER_INVALID: java.lang.String = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clientValidation: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    extend: java.lang.String = null,
    failure: js.Any = null,
    failureType: java.lang.String = null,
    form: extjsLib.ExtNs.formNs.IBasic = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    headers: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDirectSubmit = null,
    method: java.lang.String = null,
    mixins: js.Any = null,
    params: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    reset: js.UndefOr[scala.Boolean] = js.undefined,
    response: js.Any = null,
    result: js.Any = null,
    run: () => scala.Unit = null,
    scope: js.Any = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    submitEmptyText: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null,
    waitMsg: java.lang.String = null,
    waitTitle: java.lang.String = null
  ): IDirectSubmit = {
    val __obj = js.Dynamic.literal()
    if (CLIENT_INVALID != null) __obj.updateDynamic("CLIENT_INVALID")(CLIENT_INVALID)
    if (CONNECT_FAILURE != null) __obj.updateDynamic("CONNECT_FAILURE")(CONNECT_FAILURE)
    if (LOAD_FAILURE != null) __obj.updateDynamic("LOAD_FAILURE")(LOAD_FAILURE)
    if (SERVER_INVALID != null) __obj.updateDynamic("SERVER_INVALID")(SERVER_INVALID)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(clientValidation)) __obj.updateDynamic("clientValidation")(clientValidation)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (failureType != null) __obj.updateDynamic("failureType")(failureType)
    if (form != null) __obj.updateDynamic("form")(form)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (method != null) __obj.updateDynamic("method")(method)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (params != null) __obj.updateDynamic("params")(params)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    if (response != null) __obj.updateDynamic("response")(response)
    if (result != null) __obj.updateDynamic("result")(result)
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction0(run))
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(submitEmptyText)) __obj.updateDynamic("submitEmptyText")(submitEmptyText)
    if (success != null) __obj.updateDynamic("success")(success)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (waitMsg != null) __obj.updateDynamic("waitMsg")(waitMsg)
    if (waitTitle != null) __obj.updateDynamic("waitTitle")(waitTitle)
    __obj.asInstanceOf[IDirectSubmit]
  }
}

