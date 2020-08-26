package typings.gapiClientUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url extends js.Object {
  /** A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable. */
  var analytics: js.UndefOr[AnalyticsSummary] = js.native
  /** Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format, e.g. "2010-10-14T19:01:24.944+00:00". */
  var created: js.UndefOr[String] = js.native
  /** Short URL, e.g. "http://goo.gl/l6MS". */
  var id: js.UndefOr[String] = js.native
  /** The fixed string "urlshortener#url". */
  var kind: js.UndefOr[String] = js.native
  /** Long URL, e.g. "http://www.google.com/". Might not be present if the status is "REMOVED". */
  var longUrl: js.UndefOr[String] = js.native
  /**
    * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED". A URL might be marked "REMOVED" if it was flagged as spam, for
    * example.
    */
  var status: js.UndefOr[String] = js.native
}

object Url {
  @scala.inline
  def apply(): Url = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Url]
  }
  @scala.inline
  implicit class UrlOps[Self <: Url] (val x: Self) extends AnyVal {
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
    def setAnalytics(value: AnalyticsSummary): Self = this.set("analytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLongUrl(value: String): Self = this.set("longUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongUrl: Self = this.set("longUrl", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

