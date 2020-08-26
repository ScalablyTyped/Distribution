package typings.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappableRequest extends js.Object {
  var abort: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var flushHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var getHeader: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var setNoDelay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var setSocketKeepAlive: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var setTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  def removeHeader(args: js.Any*): js.Any = js.native
  def setHeader(args: js.Any*): js.Any = js.native
}

object WrappableRequest {
  @scala.inline
  def apply(removeHeader: /* repeated */ js.Any => js.Any, setHeader: /* repeated */ js.Any => js.Any): WrappableRequest = {
    val __obj = js.Dynamic.literal(removeHeader = js.Any.fromFunction1(removeHeader), setHeader = js.Any.fromFunction1(setHeader))
    __obj.asInstanceOf[WrappableRequest]
  }
  @scala.inline
  implicit class WrappableRequestOps[Self <: WrappableRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRemoveHeader(value: /* repeated */ js.Any => js.Any): Self = this.set("removeHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeader(value: /* repeated */ js.Any => js.Any): Self = this.set("setHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setAbort(value: /* repeated */ js.Any => _): Self = this.set("abort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setFlushHeaders(value: /* repeated */ js.Any => _): Self = this.set("flushHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFlushHeaders: Self = this.set("flushHeaders", js.undefined)
    @scala.inline
    def setGetHeader(value: /* repeated */ js.Any => _): Self = this.set("getHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeader: Self = this.set("getHeader", js.undefined)
    @scala.inline
    def setSetNoDelay(value: /* repeated */ js.Any => _): Self = this.set("setNoDelay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNoDelay: Self = this.set("setNoDelay", js.undefined)
    @scala.inline
    def setSetSocketKeepAlive(value: /* repeated */ js.Any => _): Self = this.set("setSocketKeepAlive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSocketKeepAlive: Self = this.set("setSocketKeepAlive", js.undefined)
    @scala.inline
    def setSetTimeout(value: /* repeated */ js.Any => _): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
  }
  
}

