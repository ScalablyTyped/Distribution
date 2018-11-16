package typings
package fetchDotIoLib.fetchDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends stdLib.RequestInit {
  var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, scala.Unit]] = js.undefined
  var afterResponse: js.UndefOr[js.Function1[/* res */ stdLib.Response, scala.Unit]] = js.undefined
  var beforeRequest: js.UndefOr[
    js.Function2[/* url */ TUrl, /* body */ stdLib.BodyInit, scala.Boolean | scala.Unit]
  ] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

