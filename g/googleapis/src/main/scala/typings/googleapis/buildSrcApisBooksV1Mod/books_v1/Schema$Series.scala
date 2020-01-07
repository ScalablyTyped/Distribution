package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_BannerImageUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Series extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  var series: js.UndefOr[js.Array[Anon_BannerImageUrl]] = js.native
}

object Schema$Series {
  @scala.inline
  def apply(kind: String = null, series: js.Array[Anon_BannerImageUrl] = null): Schema$Series = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Series]
  }
}

