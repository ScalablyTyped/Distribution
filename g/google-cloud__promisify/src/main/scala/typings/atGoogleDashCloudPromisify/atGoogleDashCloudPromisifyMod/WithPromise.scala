package typings.atGoogleDashCloudPromisify.atGoogleDashCloudPromisifyMod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithPromise extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
}

object WithPromise {
  @scala.inline
  def apply(Promise: PromiseConstructor = null): WithPromise = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithPromise]
  }
}

