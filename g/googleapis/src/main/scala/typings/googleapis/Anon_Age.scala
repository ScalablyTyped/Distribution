package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Age extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var matchesPattern: js.UndefOr[String] = js.native
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object Anon_Age {
  @scala.inline
  def apply(
    age: Int | Double = null,
    createdBefore: String = null,
    isLive: js.UndefOr[Boolean] = js.undefined,
    matchesPattern: String = null,
    matchesStorageClass: js.Array[String] = null,
    numNewerVersions: Int | Double = null
  ): Anon_Age = {
    val __obj = js.Dynamic.literal()
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (createdBefore != null) __obj.updateDynamic("createdBefore")(createdBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(isLive)) __obj.updateDynamic("isLive")(isLive.asInstanceOf[js.Any])
    if (matchesPattern != null) __obj.updateDynamic("matchesPattern")(matchesPattern.asInstanceOf[js.Any])
    if (matchesStorageClass != null) __obj.updateDynamic("matchesStorageClass")(matchesStorageClass.asInstanceOf[js.Any])
    if (numNewerVersions != null) __obj.updateDynamic("numNewerVersions")(numNewerVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Age]
  }
}

