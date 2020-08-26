package typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenshotParams extends js.Object {
  /**
    * Image compression format (defaults to png). (ScreenshotParamsFormat enum)
    */
  var format: js.UndefOr[jpeg | png] = js.native
  /**
    * Compression quality from range [0..100] (jpeg only).
    */
  var quality: js.UndefOr[integer] = js.native
}

object ScreenshotParams {
  @scala.inline
  def apply(): ScreenshotParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotParams]
  }
  @scala.inline
  implicit class ScreenshotParamsOps[Self <: ScreenshotParams] (val x: Self) extends AnyVal {
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
    def setFormat(value: jpeg | png): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setQuality(value: integer): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

