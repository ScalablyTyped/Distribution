package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.BannerImageUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSeries extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  var series: js.UndefOr[js.Array[BannerImageUrl]] = js.native
}

object SchemaSeries {
  @scala.inline
  def apply(): SchemaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeries]
  }
  @scala.inline
  implicit class SchemaSeriesOps[Self <: SchemaSeries] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: BannerImageUrl*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[BannerImageUrl]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
  
}

