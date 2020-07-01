package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Age extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var matchesPattern: js.UndefOr[String] = js.native
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object Age {
  @scala.inline
  def apply(
    age: js.UndefOr[Double] = js.undefined,
    createdBefore: String = null,
    isLive: js.UndefOr[Boolean] = js.undefined,
    matchesPattern: String = null,
    matchesStorageClass: js.Array[String] = null,
    numNewerVersions: js.UndefOr[Double] = js.undefined
  ): Age = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(age)) __obj.updateDynamic("age")(age.get.asInstanceOf[js.Any])
    if (createdBefore != null) __obj.updateDynamic("createdBefore")(createdBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(isLive)) __obj.updateDynamic("isLive")(isLive.get.asInstanceOf[js.Any])
    if (matchesPattern != null) __obj.updateDynamic("matchesPattern")(matchesPattern.asInstanceOf[js.Any])
    if (matchesStorageClass != null) __obj.updateDynamic("matchesStorageClass")(matchesStorageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(numNewerVersions)) __obj.updateDynamic("numNewerVersions")(numNewerVersions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
}

