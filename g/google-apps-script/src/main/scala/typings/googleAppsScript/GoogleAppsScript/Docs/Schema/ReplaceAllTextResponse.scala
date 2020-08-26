package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllTextResponse extends js.Object {
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object ReplaceAllTextResponse {
  @scala.inline
  def apply(): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
  @scala.inline
  implicit class ReplaceAllTextResponseOps[Self <: ReplaceAllTextResponse] (val x: Self) extends AnyVal {
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
    def setOccurrencesChanged(value: Double): Self = this.set("occurrencesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrencesChanged: Self = this.set("occurrencesChanged", js.undefined)
  }
  
}

