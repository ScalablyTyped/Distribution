package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object CreateChannelOptions {
  @scala.inline
  def apply(userProject: String = null): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelOptions]
  }
}

