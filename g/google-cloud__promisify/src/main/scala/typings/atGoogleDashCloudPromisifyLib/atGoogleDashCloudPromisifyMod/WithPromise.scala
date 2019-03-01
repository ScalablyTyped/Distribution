package typings
package atGoogleDashCloudPromisifyLib.atGoogleDashCloudPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithPromise extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
}

object WithPromise {
  @scala.inline
  def apply(Promise: stdLib.PromiseConstructor = null): WithPromise = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    __obj.asInstanceOf[WithPromise]
  }
}

