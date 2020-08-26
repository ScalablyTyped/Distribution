package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCountryTargeting extends js.Object {
  var countries: js.UndefOr[js.Array[String]] = js.native
  var includeRestOfWorld: js.UndefOr[Boolean] = js.native
}

object SchemaCountryTargeting {
  @scala.inline
  def apply(): SchemaCountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountryTargeting]
  }
  @scala.inline
  implicit class SchemaCountryTargetingOps[Self <: SchemaCountryTargeting] (val x: Self) extends AnyVal {
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
    def setCountriesVarargs(value: String*): Self = this.set("countries", js.Array(value :_*))
    @scala.inline
    def setCountries(value: js.Array[String]): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setIncludeRestOfWorld(value: Boolean): Self = this.set("includeRestOfWorld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRestOfWorld: Self = this.set("includeRestOfWorld", js.undefined)
  }
  
}

