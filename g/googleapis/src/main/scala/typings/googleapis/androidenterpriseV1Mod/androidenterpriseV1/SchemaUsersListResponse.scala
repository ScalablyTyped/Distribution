package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching user resources.
  */
@js.native
trait SchemaUsersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#usersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A user of an enterprise.
    */
  var user: js.UndefOr[js.Array[SchemaUser]] = js.native
}

object SchemaUsersListResponse {
  @scala.inline
  def apply(): SchemaUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsersListResponse]
  }
  @scala.inline
  implicit class SchemaUsersListResponseOps[Self <: SchemaUsersListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUserVarargs(value: SchemaUser*): Self = this.set("user", js.Array(value :_*))
    @scala.inline
    def setUser(value: js.Array[SchemaUser]): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

