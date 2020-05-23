package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequesterPays extends js.Object {
  /** When set to true, bucket is requester pays. */
  var requesterPays: js.UndefOr[Boolean] = js.undefined
}

object RequesterPays {
  @scala.inline
  def apply(requesterPays: js.UndefOr[Boolean] = js.undefined): RequesterPays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requesterPays)) __obj.updateDynamic("requesterPays")(requesterPays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterPays]
  }
}

