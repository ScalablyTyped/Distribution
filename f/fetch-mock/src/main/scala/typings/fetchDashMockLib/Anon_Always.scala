package typings
package fetchDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  /**
    * Reference to the Headers constructor of a custom fetch
    * implementation.
    */
  var Headers: js.UndefOr[org.scalablytyped.runtime.Instantiable0[stdLib.Headers]] = js.undefined
  /**
    * Reference to the Promise constructor of a custom Promise
    * implementation.
    */
  var Promise: js.UndefOr[
    org.scalablytyped.runtime.Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function0[scala.Unit], 
        /* reject */ js.Function0[scala.Unit], 
        scala.Unit
      ], 
      js.Promise[stdLib.Response]
    ]
  ] = js.undefined
  /**
    * Reference to the Request constructor of a custom fetch
    * implementation.
    */
  var Request: js.UndefOr[
    org.scalablytyped.runtime.Instantiable2[
      /* input */ java.lang.String | stdLib.Request, 
      /* init */ js.UndefOr[/* init */ stdLib.RequestInit], 
      stdLib.Request
    ]
  ] = js.undefined
  /**
    * Reference to the Response constructor of a custom fetch
    * implementation.
    */
  var Response: js.UndefOr[org.scalablytyped.runtime.Instantiable0[stdLib.Response]] = js.undefined
  /**
    * - true: Unhandled calls fall through to the network
    * - false: Unhandled calls throw an error
    * - 'always': All calls fall through to the network, effectively
    * disabling fetch-mock.
    * @default false
    */
  var fallbackToNetwork: js.UndefOr[scala.Boolean | fetchDashMockLib.fetchDashMockLibStrings.always] = js.undefined
  /**
    * Reference to a custom fetch implementation.
    */
  var fetch: js.UndefOr[
    js.Function2[
      /* input */ js.UndefOr[java.lang.String | stdLib.Request], 
      /* init */ js.UndefOr[stdLib.RequestInit], 
      js.Promise[stdLib.Response]
    ]
  ] = js.undefined
  /**
    * Automatically sets a content-length header on each response.
    * @default true
    */
  var includeContentLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines behaviour if a new route has the same name (or
    * inferred name) as an existing one
    * - undefined: An error will be throw when routes clash
    * - true: Overwrites the existing route
    * - false: Appends the new route to the list of routes
    * @default undefined
    */
  var overwriteRoutes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Convert objects into JSON before delivering as stub reponses.
    * Can be useful to set to false globally if e.g. dealing with a
    * lot of array buffers. If true, will also add
    * content-type: application/json header.
    * @default true
    */
  var sendAsJson: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Print a warning if any call is caught by a fallback handler (set
    * using the fallbackToNetwork option or catch())
    * @default true
    */
  var warnOnFallback: js.UndefOr[scala.Boolean] = js.undefined
}

