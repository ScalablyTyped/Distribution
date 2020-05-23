package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var server: js.UndefOr[Double] = js.undefined
  var sync: js.UndefOr[Double] = js.undefined
}

object Server {
  @scala.inline
  def apply(server: js.UndefOr[Double] = js.undefined, sync: js.UndefOr[Double] = js.undefined): Server = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

