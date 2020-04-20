package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebglFilterBackendOptions extends js.Object {
  var tileSize: Double
}

object WebglFilterBackendOptions {
  @scala.inline
  def apply(tileSize: Double): WebglFilterBackendOptions = {
    val __obj = js.Dynamic.literal(tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebglFilterBackendOptions]
  }
}

