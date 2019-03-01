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

object IBinaryXhr {
  @scala.inline
  def apply(
    abort: js.Function0[scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getAllResponseHeaders: js.Function0[scala.Unit] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getResponseHeader: js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IBinaryXhr] = null,
    mixins: js.Any = null,
    onreadystatechange: js.Function0[scala.Unit] = null,
    open: js.Function5[
      /* method */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[js.Any], 
      /* async */ js.UndefOr[js.Any], 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    overrideMimeType: js.Function1[/* mimeType */ js.UndefOr[js.Any], scala.Unit] = null,
    readyState: scala.Int | scala.Double = null,
    requires: extjsLib.ExtNs.Array = null,
    responseBytes: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    send: js.Function1[/* body */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit] = null,
    setRequestHeader: js.Function2[/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null
  ): IBinaryXhr = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAllResponseHeaders != null) __obj.updateDynamic("getAllResponseHeaders")(getAllResponseHeaders)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getResponseHeader != null) __obj.updateDynamic("getResponseHeader")(getResponseHeader)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange)
    if (open != null) __obj.updateDynamic("open")(open)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (readyState != null) __obj.updateDynamic("readyState")(readyState.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes)
    if (self != null) __obj.updateDynamic("self")(self)
    if (send != null) __obj.updateDynamic("send")(send)
    if (setRequestHeader != null) __obj.updateDynamic("setRequestHeader")(setRequestHeader)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBinaryXhr]
  }
}

