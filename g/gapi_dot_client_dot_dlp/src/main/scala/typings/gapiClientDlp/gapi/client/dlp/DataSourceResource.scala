package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDlp.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceResource extends js.Object {
  /**
    * Schedules a job to compute risk analysis metrics over content in a Google
    * Cloud Platform repository.
    */
  def analyze(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
}

object DataSourceResource {
  @scala.inline
  def apply(analyze: Accesstoken => Request[GoogleLongrunningOperation]): DataSourceResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
    __obj.asInstanceOf[DataSourceResource]
  }
  @scala.inline
  implicit class DataSourceResourceOps[Self <: DataSourceResource] (val x: Self) extends AnyVal {
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
    def setAnalyze(value: Accesstoken => Request[GoogleLongrunningOperation]): Self = this.set("analyze", js.Any.fromFunction1(value))
  }
  
}

