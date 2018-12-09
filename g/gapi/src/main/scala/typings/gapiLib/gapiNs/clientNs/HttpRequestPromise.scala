package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * HttpRequest supports promises.
     * See Google API Client JavaScript Using Promises https://developers.google.com/api-client-library/javascript/features/promises
     */
@JSGlobal("gapi.client.HttpRequestPromise")
@js.native
class HttpRequestPromise[T] () extends js.Object {
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]]
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]],
    opt_context: js.Any
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
    onrejected: js.UndefOr[scala.Nothing],
    opt_context: js.Any
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
    onrejected: scala.Null,
    opt_context: js.Any
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]],
    opt_context: js.Any
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](onfulfilled: js.UndefOr[scala.Nothing], onrejected: js.UndefOr[scala.Nothing], opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](onfulfilled: js.UndefOr[scala.Nothing], onrejected: scala.Null, opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]],
    opt_context: js.Any
  ): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](onfulfilled: scala.Null, onrejected: js.UndefOr[scala.Nothing], opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
  // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
  def `then`[TResult1, TResult2](onfulfilled: scala.Null, onrejected: scala.Null, opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
}

