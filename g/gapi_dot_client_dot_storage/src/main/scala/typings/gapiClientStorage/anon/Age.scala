package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Age extends js.Object {
  /** Age of an object (in days). This condition is satisfied when an object reaches the specified age. */
  var age: js.UndefOr[Double] = js.undefined
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when an object is created before midnight
    * of the specified date in UTC.
    */
  var createdBefore: js.UndefOr[String] = js.undefined
  /** Relevant only for versioned objects. If the value is true, this condition matches live objects; if the value is false, it matches archived objects. */
  var isLive: js.UndefOr[Boolean] = js.undefined
  /**
    * Objects having any of the storage classes specified by this condition will be matched. Values include MULTI_REGIONAL, REGIONAL, NEARLINE, COLDLINE,
    * STANDARD, and DURABLE_REDUCED_AVAILABILITY.
    */
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Relevant only for versioned objects. If the value is N, this condition is satisfied when there are at least N versions (including the live version)
    * newer than this version of the object.
    */
  var numNewerVersions: js.UndefOr[Double] = js.undefined
}

object Age {
  @scala.inline
  def apply(
    age: js.UndefOr[Double] = js.undefined,
    createdBefore: String = null,
    isLive: js.UndefOr[Boolean] = js.undefined,
    matchesStorageClass: js.Array[String] = null,
    numNewerVersions: js.UndefOr[Double] = js.undefined
  ): Age = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(age)) __obj.updateDynamic("age")(age.get.asInstanceOf[js.Any])
    if (createdBefore != null) __obj.updateDynamic("createdBefore")(createdBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(isLive)) __obj.updateDynamic("isLive")(isLive.get.asInstanceOf[js.Any])
    if (matchesStorageClass != null) __obj.updateDynamic("matchesStorageClass")(matchesStorageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(numNewerVersions)) __obj.updateDynamic("numNewerVersions")(numNewerVersions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
}

