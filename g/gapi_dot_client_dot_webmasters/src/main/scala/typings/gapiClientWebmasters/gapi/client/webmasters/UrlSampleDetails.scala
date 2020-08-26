package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlSampleDetails extends js.Object {
  /** List of sitemaps pointing at this URL. */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.native
  /** A sample set of URLs linking to this URL. */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.native
}

object UrlSampleDetails {
  @scala.inline
  def apply(): UrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlSampleDetails]
  }
  @scala.inline
  implicit class UrlSampleDetailsOps[Self <: UrlSampleDetails] (val x: Self) extends AnyVal {
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
    def setContainingSitemapsVarargs(value: String*): Self = this.set("containingSitemaps", js.Array(value :_*))
    @scala.inline
    def setContainingSitemaps(value: js.Array[String]): Self = this.set("containingSitemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainingSitemaps: Self = this.set("containingSitemaps", js.undefined)
    @scala.inline
    def setLinkedFromUrlsVarargs(value: String*): Self = this.set("linkedFromUrls", js.Array(value :_*))
    @scala.inline
    def setLinkedFromUrls(value: js.Array[String]): Self = this.set("linkedFromUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedFromUrls: Self = this.set("linkedFromUrls", js.undefined)
  }
  
}

