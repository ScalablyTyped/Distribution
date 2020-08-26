package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flag extends js.Object {
  /** For STRING flags, a list of strings that the value can be set to. */
  var allowedStringValues: js.UndefOr[js.Array[String]] = js.native
  /** The database version this flag applies to. Can be MYSQL_5_5, MYSQL_5_6, or MYSQL_5_7. MYSQL_5_7 is applicable only to Second Generation instances. */
  var appliesTo: js.UndefOr[js.Array[String]] = js.native
  /** This is always sql#flag. */
  var kind: js.UndefOr[String] = js.native
  /** For INTEGER flags, the maximum allowed value. */
  var maxValue: js.UndefOr[String] = js.native
  /** For INTEGER flags, the minimum allowed value. */
  var minValue: js.UndefOr[String] = js.native
  /** This is the name of the flag. Flag names always use underscores, not hyphens, e.g. max_allowed_packet */
  var name: js.UndefOr[String] = js.native
  /** Indicates whether changing this flag will trigger a database restart. Only applicable to Second Generation instances. */
  var requiresRestart: js.UndefOr[Boolean] = js.native
  /**
    * The type of the flag. Flags are typed to being BOOLEAN, STRING, INTEGER or NONE. NONE is used for flags which do not take a value, such as
    * skip_grant_tables.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Flag {
  @scala.inline
  def apply(): Flag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flag]
  }
  @scala.inline
  implicit class FlagOps[Self <: Flag] (val x: Self) extends AnyVal {
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
    def setAllowedStringValuesVarargs(value: String*): Self = this.set("allowedStringValues", js.Array(value :_*))
    @scala.inline
    def setAllowedStringValues(value: js.Array[String]): Self = this.set("allowedStringValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedStringValues: Self = this.set("allowedStringValues", js.undefined)
    @scala.inline
    def setAppliesToVarargs(value: String*): Self = this.set("appliesTo", js.Array(value :_*))
    @scala.inline
    def setAppliesTo(value: js.Array[String]): Self = this.set("appliesTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliesTo: Self = this.set("appliesTo", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxValue(value: String): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: String): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequiresRestart(value: Boolean): Self = this.set("requiresRestart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresRestart: Self = this.set("requiresRestart", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

