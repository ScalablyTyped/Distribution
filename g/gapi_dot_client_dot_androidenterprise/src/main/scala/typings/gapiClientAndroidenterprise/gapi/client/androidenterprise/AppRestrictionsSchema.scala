package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRestrictionsSchema extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#appRestrictionsSchema". */
  var kind: js.UndefOr[String] = js.native
  /** The set of restrictions that make up this schema. */
  var restrictions: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.native
}

object AppRestrictionsSchema {
  @scala.inline
  def apply(): AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchema]
  }
  @scala.inline
  implicit class AppRestrictionsSchemaOps[Self <: AppRestrictionsSchema] (val x: Self) extends AnyVal {
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
    def setRestrictionsVarargs(value: AppRestrictionsSchemaRestriction*): Self = this.set("restrictions", js.Array(value :_*))
    @scala.inline
    def setRestrictions(value: js.Array[AppRestrictionsSchemaRestriction]): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
  }
  
}

