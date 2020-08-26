package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEHtmlStringBalloon extends GEHtmlBalloon {
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  def getContentString(): String = js.native
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  def setContentString(contentString: String): Unit = js.native
}

object GEHtmlStringBalloon {
  @scala.inline
  def apply(
    getBackgroundColor: () => String,
    getCloseButtonEnabled: () => Boolean,
    getContentString: () => String,
    getFeature: () => KmlFeature,
    getForegroundColor: () => String,
    getId: () => String,
    getMaxHeight: () => Double,
    getMaxWidth: () => Double,
    getMinHeight: () => Double,
    getMinWidth: () => Double,
    setBackgroundColor: String => Unit,
    setCloseButtonEnabled: Boolean => Unit,
    setContentString: String => Unit,
    setFeature: KmlFeature => Unit,
    setForegroundColor: String => Unit,
    setId: String => Unit,
    setMaxHeight: Double => Unit,
    setMaxWidth: Double => Unit,
    setMinHeight: Double => Unit,
    setMinWidth: Double => Unit
  ): GEHtmlStringBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getCloseButtonEnabled = js.Any.fromFunction0(getCloseButtonEnabled), getContentString = js.Any.fromFunction0(getContentString), getFeature = js.Any.fromFunction0(getFeature), getForegroundColor = js.Any.fromFunction0(getForegroundColor), getId = js.Any.fromFunction0(getId), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinHeight = js.Any.fromFunction0(getMinHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setCloseButtonEnabled = js.Any.fromFunction1(setCloseButtonEnabled), setContentString = js.Any.fromFunction1(setContentString), setFeature = js.Any.fromFunction1(setFeature), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setId = js.Any.fromFunction1(setId), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setMaxWidth = js.Any.fromFunction1(setMaxWidth), setMinHeight = js.Any.fromFunction1(setMinHeight), setMinWidth = js.Any.fromFunction1(setMinWidth))
    __obj.asInstanceOf[GEHtmlStringBalloon]
  }
  @scala.inline
  implicit class GEHtmlStringBalloonOps[Self <: GEHtmlStringBalloon] (val x: Self) extends AnyVal {
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
    def setGetContentString(value: () => String): Self = this.set("getContentString", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContentString(value: String => Unit): Self = this.set("setContentString", js.Any.fromFunction1(value))
  }
  
}

