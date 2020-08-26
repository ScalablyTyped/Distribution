package typings.expressBrute.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @summary Specify whether or not a simplified reset method should be attached at req.brute.reset. The simplified method takes only a callback, and resets all ExpressBrute middleware that was called on the current request. If multiple instances of ExpressBrute have middleware on the same request, only those with attachResetToRequest set to true will be reset (default: true)
    */
  var attachResetToRequest: js.UndefOr[Boolean] = js.native
  /**
    * @summary Gets called with (req, res, next, nextValidRequestDate) when a request is rejected (default: ExpressBrute.FailForbidden)
    */
  var failCallback: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ js.Function, 
      /* nextValidRequestDate */ js.Any, 
      Unit
    ]
  ] = js.native
  /**
    * @summary The number of retires the user has before they need to start waiting (default: 2)
    */
  var freeRetries: js.UndefOr[Double] = js.native
  /**
    * @summary Gets called whenever an error occurs with the persistent store from which ExpressBrute cannot recover. It is passed an object containing the properties message (a description of the message), parent (the error raised by the session store), and [key, ip] or [req, res, next] depending on whether or the error occurs during reset or in the middleware itself.
    */
  var handleStoreError: js.UndefOr[js.Any] = js.native
  /**
    * @summary The length of time (in seconds since the last request) to remember the number of requests that have been made by an IP. By default it will be set to maxWait * the number of attempts before you hit maxWait to discourage simply waiting for the lifetime to expire before resuming an attack. With default values this is about 6 hours.
    */
  var lifetime: js.UndefOr[Double] = js.native
  /**
    * @summary The maximum amount of time (in milliseconds) between requests the user needs to wait (default: 15 minutes). The wait for a given request is determined by adding the time the user needed to wait for the previous two requests.
    */
  var maxWait: js.UndefOr[Double] = js.native
  /**
    * @summary The initial wait time (in milliseconds) after the user runs out of retries (default: 500 milliseconds)
    */
  var minWait: js.UndefOr[Double] = js.native
  /**
    * @summary Defines whether the lifetime counts from the time of the last request that ExpressBrute didn't prevent for a given IP (true) or from of that IP's first request (false). Useful for allowing limits over fixed periods of time, for example: a limited number of requests per day. (Default: true).
    */
  var refreshTimeoutOnRequest: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAttachResetToRequest(value: Boolean): Self = this.set("attachResetToRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachResetToRequest: Self = this.set("attachResetToRequest", js.undefined)
    @scala.inline
    def setFailCallback(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ js.Function, /* nextValidRequestDate */ js.Any) => Unit
    ): Self = this.set("failCallback", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFailCallback: Self = this.set("failCallback", js.undefined)
    @scala.inline
    def setFreeRetries(value: Double): Self = this.set("freeRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeRetries: Self = this.set("freeRetries", js.undefined)
    @scala.inline
    def setHandleStoreError(value: js.Any): Self = this.set("handleStoreError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleStoreError: Self = this.set("handleStoreError", js.undefined)
    @scala.inline
    def setLifetime(value: Double): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    @scala.inline
    def setMaxWait(value: Double): Self = this.set("maxWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWait: Self = this.set("maxWait", js.undefined)
    @scala.inline
    def setMinWait(value: Double): Self = this.set("minWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWait: Self = this.set("minWait", js.undefined)
    @scala.inline
    def setRefreshTimeoutOnRequest(value: Boolean): Self = this.set("refreshTimeoutOnRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshTimeoutOnRequest: Self = this.set("refreshTimeoutOnRequest", js.undefined)
  }
  
}

