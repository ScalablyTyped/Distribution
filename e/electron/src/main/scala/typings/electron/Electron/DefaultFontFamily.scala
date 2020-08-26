package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultFontFamily extends js.Object {
  /**
    * Defaults to `Script`.
    */
  var cursive: js.UndefOr[String] = js.native
  /**
    * Defaults to `Impact`.
    */
  var fantasy: js.UndefOr[String] = js.native
  /**
    * Defaults to `Courier New`.
    */
  var monospace: js.UndefOr[String] = js.native
  /**
    * Defaults to `Arial`.
    */
  var sansSerif: js.UndefOr[String] = js.native
  /**
    * Defaults to `Times New Roman`.
    */
  var serif: js.UndefOr[String] = js.native
  /**
    * Defaults to `Times New Roman`.
    */
  var standard: js.UndefOr[String] = js.native
}

object DefaultFontFamily {
  @scala.inline
  def apply(): DefaultFontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultFontFamily]
  }
  @scala.inline
  implicit class DefaultFontFamilyOps[Self <: DefaultFontFamily] (val x: Self) extends AnyVal {
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
    def setMonospace(value: String): Self = this.set("monospace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonospace: Self = this.set("monospace", js.undefined)
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

