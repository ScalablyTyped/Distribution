package typings.googleGax.grpcMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStubOptions
  extends /* index */ StringDictionary[js.UndefOr[String | Double | js.Object]] {
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var servicePath: js.UndefOr[String] = js.undefined
  var sslCreds: js.UndefOr[js.Any] = js.undefined
}

object ClientStubOptions {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[js.UndefOr[String | Double | js.Object]] = null,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    servicePath: String = null,
    sslCreds: js.Any = null
  ): ClientStubOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientStubOptions]
  }
}

