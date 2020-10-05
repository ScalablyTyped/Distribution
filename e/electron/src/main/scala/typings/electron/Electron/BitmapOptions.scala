package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitmapOptions extends js.Object {
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
}

object BitmapOptions {
  @scala.inline
  def apply(): BitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitmapOptions]
  }
  @scala.inline
  implicit class BitmapOptionsOps[Self <: BitmapOptions] (val x: Self) extends AnyVal {
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
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
  }
  
}

