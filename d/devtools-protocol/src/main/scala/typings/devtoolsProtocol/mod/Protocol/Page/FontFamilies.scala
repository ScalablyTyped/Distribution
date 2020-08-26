package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFamilies extends js.Object {
  /**
    * The cursive font-family.
    */
  var cursive: js.UndefOr[String] = js.native
  /**
    * The fantasy font-family.
    */
  var fantasy: js.UndefOr[String] = js.native
  /**
    * The fixed font-family.
    */
  var fixed: js.UndefOr[String] = js.native
  /**
    * The pictograph font-family.
    */
  var pictograph: js.UndefOr[String] = js.native
  /**
    * The sansSerif font-family.
    */
  var sansSerif: js.UndefOr[String] = js.native
  /**
    * The serif font-family.
    */
  var serif: js.UndefOr[String] = js.native
  /**
    * The standard font-family.
    */
  var standard: js.UndefOr[String] = js.native
}

object FontFamilies {
  @scala.inline
  def apply(): FontFamilies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilies]
  }
  @scala.inline
  implicit class FontFamiliesOps[Self <: FontFamilies] (val x: Self) extends AnyVal {
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
    def setCursive(value: String): Self = this.set("cursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursive: Self = this.set("cursive", js.undefined)
    @scala.inline
    def setFantasy(value: String): Self = this.set("fantasy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFantasy: Self = this.set("fantasy", js.undefined)
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setPictograph(value: String): Self = this.set("pictograph", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePictograph: Self = this.set("pictograph", js.undefined)
    @scala.inline
    def setSansSerif(value: String): Self = this.set("sansSerif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSansSerif: Self = this.set("sansSerif", js.undefined)
    @scala.inline
    def setSerif(value: String): Self = this.set("serif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerif: Self = this.set("serif", js.undefined)
    @scala.inline
    def setStandard(value: String): Self = this.set("standard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
  }
  
}

