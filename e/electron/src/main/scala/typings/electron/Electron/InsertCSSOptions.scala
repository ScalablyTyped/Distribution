package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertCSSOptions extends js.Object {
  /**
    * Can be either 'user' or 'author'; Specifying 'user' enables you to prevent
    * websites from overriding the CSS you insert. Default is 'author'.
    */
  var cssOrigin: js.UndefOr[String] = js.native
}

object InsertCSSOptions {
  @scala.inline
  def apply(): InsertCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertCSSOptions]
  }
  @scala.inline
  implicit class InsertCSSOptionsOps[Self <: InsertCSSOptions] (val x: Self) extends AnyVal {
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
    def setCssOrigin(value: String): Self = this.set("cssOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssOrigin: Self = this.set("cssOrigin", js.undefined)
  }
  
}

