package typings.googleDashGax.buildSrcApiCallerMod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiCallerSettings extends js.Object {
  var promise: PromiseConstructor
}

object ApiCallerSettings {
  @scala.inline
  def apply(promise: PromiseConstructor): ApiCallerSettings = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiCallerSettings]
  }
}

