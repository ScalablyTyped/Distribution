package typings.followRedirects.anon

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  var http: js.UndefOr[Agent] = js.undefined
  var https: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
}

object Http {
  @scala.inline
  def apply(http: Agent = null, https: typings.node.httpsMod.Agent = null): Http = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

