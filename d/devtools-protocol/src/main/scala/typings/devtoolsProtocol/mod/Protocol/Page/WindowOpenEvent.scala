package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOpenEvent extends js.Object {
  /**
    * The URL for the new window.
    */
  var url: String = js.native
  /**
    * Whether or not it was triggered by user gesture.
    */
  var userGesture: Boolean = js.native
  /**
    * An array of enabled window features.
    */
  var windowFeatures: js.Array[String] = js.native
  /**
    * Window name.
    */
  var windowName: String = js.native
}

object WindowOpenEvent {
  @scala.inline
  def apply(url: String, userGesture: Boolean, windowFeatures: js.Array[String], windowName: String): WindowOpenEvent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], userGesture = userGesture.asInstanceOf[js.Any], windowFeatures = windowFeatures.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOpenEvent]
  }
  @scala.inline
  implicit class WindowOpenEventOps[Self <: WindowOpenEvent] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserGesture(value: Boolean): Self = this.set("userGesture", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowFeaturesVarargs(value: String*): Self = this.set("windowFeatures", js.Array(value :_*))
    @scala.inline
    def setWindowFeatures(value: js.Array[String]): Self = this.set("windowFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowName(value: String): Self = this.set("windowName", value.asInstanceOf[js.Any])
  }
  
}

