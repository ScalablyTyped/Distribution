package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure containing the information of a second factor entity.
  */
@js.native
trait MultiFactorInfo extends js.Object {
  /**
    * The user friendly name of the current second factor.
    */
  var displayName: js.UndefOr[String | Null] = js.native
  /**
    * The enrollment date of the second factor formatted as a UTC string.
    */
  var enrollmentTime: String = js.native
  /**
    * The identifier of the second factor.
    */
  var factorId: String = js.native
  /**
    * The multi-factor enrollment ID.
    */
  var uid: String = js.native
}

object MultiFactorInfo {
  @scala.inline
  def apply(enrollmentTime: String, factorId: String, uid: String): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
  @scala.inline
  implicit class MultiFactorInfoOps[Self <: MultiFactorInfo] (val x: Self) extends AnyVal {
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
    def setEnrollmentTime(value: String): Self = this.set("enrollmentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactorId(value: String): Self = this.set("factorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
  }
  
}

