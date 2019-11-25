package typings.atGoogleDashCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCreate extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.undefined
}

object Anon_AutoCreate {
  @scala.inline
  def apply(autoCreate: js.UndefOr[Boolean] = js.undefined): Anon_AutoCreate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoCreate]
  }
}

