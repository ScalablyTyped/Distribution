package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClientDotBooks.Anon_BannerImageUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Series extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[js.Array[Anon_BannerImageUrl]] = js.undefined
}

object Series {
  @scala.inline
  def apply(kind: String = null, series: js.Array[Anon_BannerImageUrl] = null): Series = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[Series]
  }
}

