package typings
package gaxiosLib.buildSrcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosOptions extends js.Object {
  /**
    * Optional method to override making the actual HTTP request. Useful
    * for writing tests.
    */
  var adapter: js.UndefOr[js.Function1[/* options */ GaxiosOptions, GaxiosPromise[_]]] = js.undefined
  var agent: js.UndefOr[nodeLib.httpsMod.Agent] = js.undefined
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  /**
    * The maximum size of the http response content in bytes allowed.
    */
  var maxContentLength: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[
    gaxiosLib.gaxiosLibStrings.GET | gaxiosLib.gaxiosLibStrings.HEAD | gaxiosLib.gaxiosLibStrings.POST | gaxiosLib.gaxiosLibStrings.DELETE | gaxiosLib.gaxiosLibStrings.PUT | gaxiosLib.gaxiosLibStrings.CONNECT | gaxiosLib.gaxiosLibStrings.OPTIONS | gaxiosLib.gaxiosLibStrings.TRACE | gaxiosLib.gaxiosLibStrings.PATCH
  ] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, scala.Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var paramsSerializer: js.UndefOr[
    js.Function1[
      /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double], 
      java.lang.String
    ]
  ] = js.undefined
  var responseType: js.UndefOr[
    gaxiosLib.gaxiosLibStrings.arraybuffer | gaxiosLib.gaxiosLibStrings.blob | gaxiosLib.gaxiosLibStrings.json | gaxiosLib.gaxiosLibStrings.text | gaxiosLib.gaxiosLibStrings.stream
  ] = js.undefined
  var retry: js.UndefOr[scala.Boolean] = js.undefined
  var retryConfig: js.UndefOr[RetryConfig] = js.undefined
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var validateStatus: js.UndefOr[js.Function1[/* status */ scala.Double, scala.Boolean]] = js.undefined
}

