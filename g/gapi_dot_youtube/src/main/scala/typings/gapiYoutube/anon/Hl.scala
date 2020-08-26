package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hl extends js.Object {
  /**
    * The hl parameter specifies the language that should be used for text values in the API response.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: String = js.native
  /**
    * The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.native
}

object Hl {
  @scala.inline
  def apply(part: String): Hl = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hl]
  }
  @scala.inline
  implicit class HlOps[Self <: Hl] (val x: Self) extends AnyVal {
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
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
  
}

