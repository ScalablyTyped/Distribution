package typings.gcpMetadata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
  var property: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    headers: OutgoingHttpHeaders = null,
    params: StringDictionary[String] = null,
    property: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

