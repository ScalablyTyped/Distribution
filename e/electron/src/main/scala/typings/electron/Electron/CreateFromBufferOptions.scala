package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFromBufferOptions extends js.Object {
  /**
    * Required for bitmap buffers.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
  /**
    * Required for bitmap buffers.
    */
  var width: js.UndefOr[Double] = js.native
}

object CreateFromBufferOptions {
  @scala.inline
  def apply(): CreateFromBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFromBufferOptions]
  }
  @scala.inline
  implicit class CreateFromBufferOptionsOps[Self <: CreateFromBufferOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

