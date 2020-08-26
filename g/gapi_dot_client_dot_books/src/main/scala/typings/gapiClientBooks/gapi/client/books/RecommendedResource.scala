package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.MaxAllowedMaturityRating
import typings.gapiClientBooks.anon.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: MaxAllowedMaturityRating): Request[Volumes] = js.native
  /** Rate a recommended book for the current user. */
  def rate(request: Rating): Request[BooksVolumesRecommendedRateResponse] = js.native
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: MaxAllowedMaturityRating => Request[Volumes],
    rate: Rating => Request[BooksVolumesRecommendedRateResponse]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate))
    __obj.asInstanceOf[RecommendedResource]
  }
  @scala.inline
  implicit class RecommendedResourceOps[Self <: RecommendedResource] (val x: Self) extends AnyVal {
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
    def setList(value: MaxAllowedMaturityRating => Request[Volumes]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRate(value: Rating => Request[BooksVolumesRecommendedRateResponse]): Self = this.set("rate", js.Any.fromFunction1(value))
  }
  
}

