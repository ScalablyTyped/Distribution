package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Register options
  */
trait RegisterOptions[HttpServer, HttpRequest, HttpResponse]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply[HttpServer, HttpRequest, HttpResponse](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    prefix: java.lang.String = null
  ): RegisterOptions[HttpServer, HttpRequest, HttpResponse] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[RegisterOptions[HttpServer, HttpRequest, HttpResponse]]
  }
}

