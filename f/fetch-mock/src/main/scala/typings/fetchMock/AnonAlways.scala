package typings.fetchMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fetchMock.fetchMockStrings.always
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlways extends js.Object {
  /**
    * Reference to the Headers constructor of a custom fetch
    * implementation.
    */
  var Headers: js.UndefOr[Instantiable0[typings.std.Headers]] = js.undefined
  /**
    * Reference to the Promise constructor of a custom Promise
    * implementation.
    */
  var Promise: js.UndefOr[
    Instantiable1[
      /* executor */ js.Function2[/* resolve */ js.Function0[Unit], /* reject */ js.Function0[Unit], Unit], 
      js.Promise[Response]
    ]
  ] = js.undefined
  /**
    * Reference to the Request constructor of a custom fetch
    * implementation.
    */
  var Request: js.UndefOr[
    Instantiable2[
      /* input */ String | typings.std.Request, 
      js.UndefOr[/* init */ RequestInit], 
      typings.std.Request
    ]
  ] = js.undefined
  /**
    * Reference to the Response constructor of a custom fetch
    * implementation.
    */
  var Response: js.UndefOr[Instantiable0[typings.std.Response]] = js.undefined
  /**
    * - true: Unhandled calls fall through to the network
    * - false: Unhandled calls throw an error
    * - 'always': All calls fall through to the network, effectively
    * disabling fetch-mock.
    * @default false
    */
  var fallbackToNetwork: js.UndefOr[Boolean | always] = js.undefined
  /**
    * Reference to a custom fetch implementation.
    */
  var fetch: js.UndefOr[
    js.Function2[
      /* input */ js.UndefOr[String | Request], 
      /* init */ js.UndefOr[RequestInit], 
      js.Promise[Response]
    ]
  ] = js.undefined
  /**
    * Automatically sets a content-length header on each response.
    * @default true
    */
  var includeContentLength: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines behaviour if a new route has the same name (or
    * inferred name) as an existing one
    * - undefined: An error will be throw when routes clash
    * - true: Overwrites the existing route
    * - false: Appends the new route to the list of routes
    * @default undefined
    */
  var overwriteRoutes: js.UndefOr[Boolean] = js.undefined
  /**
    * Convert objects into JSON before delivering as stub responses.
    * Can be useful to set to false globally if e.g. dealing with a
    * lot of array buffers. If true, will also add
    * content-type: application/json header.
    * @default true
    */
  var sendAsJson: js.UndefOr[Boolean] = js.undefined
  /**
    * Print a warning if any call is caught by a fallback handler (set
    * using the fallbackToNetwork option or catch())
    * @default true
    */
  var warnOnFallback: js.UndefOr[Boolean] = js.undefined
}

object AnonAlways {
  @scala.inline
  def apply(
    Headers: Instantiable0[Headers] = null,
    Promise: Instantiable1[
      /* executor */ js.Function2[/* resolve */ js.Function0[Unit], /* reject */ js.Function0[Unit], Unit], 
      js.Promise[Response]
    ] = null,
    Request: Instantiable2[/* input */ String | Request, js.UndefOr[/* init */ RequestInit], Request] = null,
    Response: Instantiable0[Response] = null,
    fallbackToNetwork: Boolean | always = null,
    fetch: (/* input */ js.UndefOr[String | Request], /* init */ js.UndefOr[RequestInit]) => js.Promise[Response] = null,
    includeContentLength: js.UndefOr[Boolean] = js.undefined,
    overwriteRoutes: js.UndefOr[Boolean] = js.undefined,
    sendAsJson: js.UndefOr[Boolean] = js.undefined,
    warnOnFallback: js.UndefOr[Boolean] = js.undefined
  ): AnonAlways = {
    val __obj = js.Dynamic.literal()
    if (Headers != null) __obj.updateDynamic("Headers")(Headers.asInstanceOf[js.Any])
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (Response != null) __obj.updateDynamic("Response")(Response.asInstanceOf[js.Any])
    if (fallbackToNetwork != null) __obj.updateDynamic("fallbackToNetwork")(fallbackToNetwork.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteRoutes)) __obj.updateDynamic("overwriteRoutes")(overwriteRoutes.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsJson)) __obj.updateDynamic("sendAsJson")(sendAsJson.asInstanceOf[js.Any])
    if (!js.isUndefined(warnOnFallback)) __obj.updateDynamic("warnOnFallback")(warnOnFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlways]
  }
}

