package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-validator.express-validator/src/matched-data.MatchedDataOptions> */
@js.native
trait PartialMatchedDataOptions extends js.Object {
  var includeOptionals: js.UndefOr[Boolean] = js.native
  var locations: js.UndefOr[js.Array[typings.expressValidator.baseMod.Location]] = js.native
  var onlyValidData: js.UndefOr[Boolean] = js.native
}

object PartialMatchedDataOptions {
  @scala.inline
  def apply(): PartialMatchedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatchedDataOptions]
  }
  @scala.inline
  implicit class PartialMatchedDataOptionsOps[Self <: PartialMatchedDataOptions] (val x: Self) extends AnyVal {
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
    def setIncludeOptionals(value: Boolean): Self = this.set("includeOptionals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeOptionals: Self = this.set("includeOptionals", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: typings.expressValidator.baseMod.Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[typings.expressValidator.baseMod.Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setOnlyValidData(value: Boolean): Self = this.set("onlyValidData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyValidData: Self = this.set("onlyValidData", js.undefined)
  }
  
}

