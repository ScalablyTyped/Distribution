package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.Page.Viewport
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDeviceMetricsOverrideRequest extends js.Object {
  /**
    * Overriding device scale factor value. 0 disables the override.
    */
  var deviceScaleFactor: Double = js.native
  /**
    * Do not set visible view size, rely upon explicit setVisibleSize call.
    */
  var dontSetVisibleSize: js.UndefOr[Boolean] = js.native
  /**
    * Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
    */
  var height: integer = js.native
  /**
    * Whether to emulate mobile device. This includes viewport meta tag, overlay scrollbars, text
    * autosizing and more.
    */
  var mobile: Boolean = js.native
  /**
    * Overriding view X position on screen in pixels (minimum 0, maximum 10000000).
    */
  var positionX: js.UndefOr[integer] = js.native
  /**
    * Overriding view Y position on screen in pixels (minimum 0, maximum 10000000).
    */
  var positionY: js.UndefOr[integer] = js.native
  /**
    * Scale to apply to resulting view image.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Overriding screen height value in pixels (minimum 0, maximum 10000000).
    */
  var screenHeight: js.UndefOr[integer] = js.native
  /**
    * Screen orientation override.
    */
  var screenOrientation: js.UndefOr[ScreenOrientation] = js.native
  /**
    * Overriding screen width value in pixels (minimum 0, maximum 10000000).
    */
  var screenWidth: js.UndefOr[integer] = js.native
  /**
    * If set, the visible area of the page will be overridden to this viewport. This viewport
    * change is not observed by the page, e.g. viewport-relative elements do not change positions.
    */
  var viewport: js.UndefOr[Viewport] = js.native
  /**
    * Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
    */
  var width: integer = js.native
}

object SetDeviceMetricsOverrideRequest {
  @scala.inline
  def apply(deviceScaleFactor: Double, height: integer, mobile: Boolean, width: integer): SetDeviceMetricsOverrideRequest = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDeviceMetricsOverrideRequest]
  }
  @scala.inline
  implicit class SetDeviceMetricsOverrideRequestOps[Self <: SetDeviceMetricsOverrideRequest] (val x: Self) extends AnyVal {
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
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setDontSetVisibleSize(value: Boolean): Self = this.set("dontSetVisibleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontSetVisibleSize: Self = this.set("dontSetVisibleSize", js.undefined)
    @scala.inline
    def setPositionX(value: integer): Self = this.set("positionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionX: Self = this.set("positionX", js.undefined)
    @scala.inline
    def setPositionY(value: integer): Self = this.set("positionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionY: Self = this.set("positionY", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScreenHeight(value: integer): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenHeight: Self = this.set("screenHeight", js.undefined)
    @scala.inline
    def setScreenOrientation(value: ScreenOrientation): Self = this.set("screenOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenOrientation: Self = this.set("screenOrientation", js.undefined)
    @scala.inline
    def setScreenWidth(value: integer): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenWidth: Self = this.set("screenWidth", js.undefined)
    @scala.inline
    def setViewport(value: Viewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

