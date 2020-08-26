package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Age extends js.Object {
  /** Age of an object (in days). This condition is satisfied when an object reaches the specified age. */
  var age: js.UndefOr[Double] = js.native
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when an object is created before midnight
    * of the specified date in UTC.
    */
  var createdBefore: js.UndefOr[String] = js.native
  /** Relevant only for versioned objects. If the value is true, this condition matches live objects; if the value is false, it matches archived objects. */
  var isLive: js.UndefOr[Boolean] = js.native
  /**
    * Objects having any of the storage classes specified by this condition will be matched. Values include MULTI_REGIONAL, REGIONAL, NEARLINE, COLDLINE,
    * STANDARD, and DURABLE_REDUCED_AVAILABILITY.
    */
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.native
  /**
    * Relevant only for versioned objects. If the value is N, this condition is satisfied when there are at least N versions (including the live version)
    * newer than this version of the object.
    */
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object Age {
  @scala.inline
  def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  @scala.inline
  implicit class AgeOps[Self <: Age] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    @scala.inline
    def setCreatedBefore(value: String): Self = this.set("createdBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBefore: Self = this.set("createdBefore", js.undefined)
    @scala.inline
    def setIsLive(value: Boolean): Self = this.set("isLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLive: Self = this.set("isLive", js.undefined)
    @scala.inline
    def setMatchesStorageClassVarargs(value: String*): Self = this.set("matchesStorageClass", js.Array(value :_*))
    @scala.inline
    def setMatchesStorageClass(value: js.Array[String]): Self = this.set("matchesStorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchesStorageClass: Self = this.set("matchesStorageClass", js.undefined)
    @scala.inline
    def setNumNewerVersions(value: Double): Self = this.set("numNewerVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumNewerVersions: Self = this.set("numNewerVersions", js.undefined)
  }
  
}

