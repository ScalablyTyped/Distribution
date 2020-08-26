package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartCustomNumberFormatOptions extends js.Object {
  /**
    * Custom prefix to be prepended to the chart attribute.
    * This field is optional.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Custom suffix to be appended to the chart attribute.
    * This field is optional.
    */
  var suffix: js.UndefOr[String] = js.native
}

object ChartCustomNumberFormatOptions {
  @scala.inline
  def apply(): ChartCustomNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCustomNumberFormatOptions]
  }
  @scala.inline
  implicit class ChartCustomNumberFormatOptionsOps[Self <: ChartCustomNumberFormatOptions] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

