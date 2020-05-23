package typings.googleEarth.google.earth

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GEHtmlDivBalloon extends GEHtmlBalloon {
  /**
    * An HTMLDivElement to be used as the contents of the balloon.
    * When the balloon is shown, the HTMLDivElement is attached to the balloon element in the web page.
    * You can manipulate this balloon using ordinary HTML DOM techniques.
    */
  def getContentDiv(): HTMLDivElement
  /**
    * An HTMLDivElement to be used as the contents of the balloon.
    * When the balloon is shown, the HTMLDivElement is attached to the balloon element in the web page.
    * You can manipulate this balloon using ordinary HTML DOM techniques.
    */
  def setContentDiv(contentDiv: HTMLElement): Unit
}

object GEHtmlDivBalloon {
  @scala.inline
  def apply(
    getBackgroundColor: () => String,
    getCloseButtonEnabled: () => Boolean,
    getContentDiv: () => HTMLDivElement,
    getFeature: () => KmlFeature,
    getForegroundColor: () => String,
    getId: () => String,
    getMaxHeight: () => Double,
    getMaxWidth: () => Double,
    getMinHeight: () => Double,
    getMinWidth: () => Double,
    setBackgroundColor: String => Unit,
    setCloseButtonEnabled: Boolean => Unit,
    setContentDiv: HTMLElement => Unit,
    setFeature: KmlFeature => Unit,
    setForegroundColor: String => Unit,
    setId: String => Unit,
    setMaxHeight: Double => Unit,
    setMaxWidth: Double => Unit,
    setMinHeight: Double => Unit,
    setMinWidth: Double => Unit
  ): GEHtmlDivBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getCloseButtonEnabled = js.Any.fromFunction0(getCloseButtonEnabled), getContentDiv = js.Any.fromFunction0(getContentDiv), getFeature = js.Any.fromFunction0(getFeature), getForegroundColor = js.Any.fromFunction0(getForegroundColor), getId = js.Any.fromFunction0(getId), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinHeight = js.Any.fromFunction0(getMinHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setCloseButtonEnabled = js.Any.fromFunction1(setCloseButtonEnabled), setContentDiv = js.Any.fromFunction1(setContentDiv), setFeature = js.Any.fromFunction1(setFeature), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setId = js.Any.fromFunction1(setId), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setMaxWidth = js.Any.fromFunction1(setMaxWidth), setMinHeight = js.Any.fromFunction1(setMinHeight), setMinWidth = js.Any.fromFunction1(setMinWidth))
    __obj.asInstanceOf[GEHtmlDivBalloon]
  }
}

