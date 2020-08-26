package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedTarget extends js.Object {
  var country: js.UndefOr[String] = js.native
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  var language: js.UndefOr[String] = js.native
}

object DatafeedTarget {
  @scala.inline
  def apply(): DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedTarget]
  }
  @scala.inline
  implicit class DatafeedTargetOps[Self <: DatafeedTarget] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setExcludedDestinationsVarargs(value: String*): Self = this.set("excludedDestinations", js.Array(value :_*))
    @scala.inline
    def setExcludedDestinations(value: js.Array[String]): Self = this.set("excludedDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedDestinations: Self = this.set("excludedDestinations", js.undefined)
    @scala.inline
    def setIncludedDestinationsVarargs(value: String*): Self = this.set("includedDestinations", js.Array(value :_*))
    @scala.inline
    def setIncludedDestinations(value: js.Array[String]): Self = this.set("includedDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedDestinations: Self = this.set("includedDestinations", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

