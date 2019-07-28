package typings.finalhandler.finalhandlerMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var env: js.UndefOr[String] = js.undefined
  var onerror: js.UndefOr[
    js.Function3[/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    env: String = null,
    onerror: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3(onerror))
    __obj.asInstanceOf[Options]
  }
}

