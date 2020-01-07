package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AgeCreatedBefore extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object Anon_AgeCreatedBefore {
  @scala.inline
  def apply(
    age: Int | Double = null,
    createdBefore: String = null,
    isLive: js.UndefOr[Boolean] = js.undefined,
    numNewerVersions: Int | Double = null
  ): Anon_AgeCreatedBefore = {
    val __obj = js.Dynamic.literal()
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (createdBefore != null) __obj.updateDynamic("createdBefore")(createdBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(isLive)) __obj.updateDynamic("isLive")(isLive.asInstanceOf[js.Any])
    if (numNewerVersions != null) __obj.updateDynamic("numNewerVersions")(numNewerVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AgeCreatedBefore]
  }
}

