package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatedBefore extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object CreatedBefore {
  @scala.inline
  def apply(
    age: js.UndefOr[Double] = js.undefined,
    createdBefore: String = null,
    isLive: js.UndefOr[Boolean] = js.undefined,
    numNewerVersions: js.UndefOr[Double] = js.undefined
  ): CreatedBefore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(age)) __obj.updateDynamic("age")(age.get.asInstanceOf[js.Any])
    if (createdBefore != null) __obj.updateDynamic("createdBefore")(createdBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(isLive)) __obj.updateDynamic("isLive")(isLive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numNewerVersions)) __obj.updateDynamic("numNewerVersions")(numNewerVersions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedBefore]
  }
}

