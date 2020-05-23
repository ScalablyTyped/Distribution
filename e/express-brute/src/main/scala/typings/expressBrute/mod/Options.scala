package typings.expressBrute.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @summary Specify whether or not a simplified reset method should be attached at req.brute.reset. The simplified method takes only a callback, and resets all ExpressBrute middleware that was called on the current request. If multiple instances of ExpressBrute have middleware on the same request, only those with attachResetToRequest set to true will be reset (default: true)
    */
  var attachResetToRequest: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
  /**
    * @summary The number of retires the user has before they need to start waiting (default: 2)
    */
  var freeRetries: js.UndefOr[Double] = js.undefined
  /**
    * @summary Gets called whenever an error occurs with the persistent store from which ExpressBrute cannot recover. It is passed an object containing the properties message (a description of the message), parent (the error raised by the session store), and [key, ip] or [req, res, next] depending on whether or the error occurs during reset or in the middleware itself.
    */
  var handleStoreError: js.UndefOr[js.Any] = js.undefined
  /**
    * @summary The length of time (in seconds since the last request) to remember the number of requests that have been made by an IP. By default it will be set to maxWait * the number of attempts before you hit maxWait to discourage simply waiting for the lifetime to expire before resuming an attack. With default values this is about 6 hours.
    */
  var lifetime: js.UndefOr[Double] = js.undefined
  /**
    * @summary The maximum amount of time (in milliseconds) between requests the user needs to wait (default: 15 minutes). The wait for a given request is determined by adding the time the user needed to wait for the previous two requests.
    */
  var maxWait: js.UndefOr[Double] = js.undefined
  /**
    * @summary The initial wait time (in milliseconds) after the user runs out of retries (default: 500 milliseconds)
    */
  var minWait: js.UndefOr[Double] = js.undefined
  /**
    * @summary Defines whether the lifetime counts from the time of the last request that ExpressBrute didn't prevent for a given IP (true) or from of that IP's first request (false). Useful for allowing limits over fixed periods of time, for example: a limited number of requests per day. (Default: true).
    */
  var refreshTimeoutOnRequest: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attachResetToRequest: js.UndefOr[Boolean] = js.undefined,
    failCallback: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ js.Function, /* nextValidRequestDate */ js.Any) => Unit = null,
    freeRetries: js.UndefOr[Double] = js.undefined,
    handleStoreError: js.Any = null,
    lifetime: js.UndefOr[Double] = js.undefined,
    maxWait: js.UndefOr[Double] = js.undefined,
    minWait: js.UndefOr[Double] = js.undefined,
    refreshTimeoutOnRequest: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachResetToRequest)) __obj.updateDynamic("attachResetToRequest")(attachResetToRequest.get.asInstanceOf[js.Any])
    if (failCallback != null) __obj.updateDynamic("failCallback")(js.Any.fromFunction4(failCallback))
    if (!js.isUndefined(freeRetries)) __obj.updateDynamic("freeRetries")(freeRetries.get.asInstanceOf[js.Any])
    if (handleStoreError != null) __obj.updateDynamic("handleStoreError")(handleStoreError.asInstanceOf[js.Any])
    if (!js.isUndefined(lifetime)) __obj.updateDynamic("lifetime")(lifetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWait)) __obj.updateDynamic("maxWait")(maxWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWait)) __obj.updateDynamic("minWait")(minWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshTimeoutOnRequest)) __obj.updateDynamic("refreshTimeoutOnRequest")(refreshTimeoutOnRequest.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

