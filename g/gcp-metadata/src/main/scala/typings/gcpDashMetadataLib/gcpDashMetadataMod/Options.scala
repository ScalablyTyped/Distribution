package typings
package gcpDashMetadataLib.gcpDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    property: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Options]
  }
}

