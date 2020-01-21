package typings.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappableRequest extends js.Object {
  var abort: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var flushHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var getHeader: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var setNoDelay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var setSocketKeepAlive: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var setTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  def removeHeader(args: js.Any*): js.Any
  def setHeader(args: js.Any*): js.Any
}

object WrappableRequest {
  @scala.inline
  def apply(
    removeHeader: /* repeated */ js.Any => js.Any,
    setHeader: /* repeated */ js.Any => js.Any,
    abort: /* repeated */ js.Any => _ = null,
    flushHeaders: /* repeated */ js.Any => _ = null,
    getHeader: /* repeated */ js.Any => _ = null,
    setNoDelay: /* repeated */ js.Any => _ = null,
    setSocketKeepAlive: /* repeated */ js.Any => _ = null,
    setTimeout: /* repeated */ js.Any => _ = null
  ): WrappableRequest = {
    val __obj = js.Dynamic.literal(removeHeader = js.Any.fromFunction1(removeHeader), setHeader = js.Any.fromFunction1(setHeader))
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (flushHeaders != null) __obj.updateDynamic("flushHeaders")(js.Any.fromFunction1(flushHeaders))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction1(getHeader))
    if (setNoDelay != null) __obj.updateDynamic("setNoDelay")(js.Any.fromFunction1(setNoDelay))
    if (setSocketKeepAlive != null) __obj.updateDynamic("setSocketKeepAlive")(js.Any.fromFunction1(setSocketKeepAlive))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    __obj.asInstanceOf[WrappableRequest]
  }
}

