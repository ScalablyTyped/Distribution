package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEHtmlBalloon
  extends StObject
     with GEAbstractBalloon {
  
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def getBackgroundColor(): String
  
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def getForegroundColor(): String
  
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def setBackgroundColor(backgroundColor: String): Unit
  
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def setForegroundColor(foregroundColor: String): Unit
}
object GEHtmlBalloon {
  
  @scala.inline
  def apply(
    getBackgroundColor: () => String,
    getCloseButtonEnabled: () => Boolean,
    getFeature: () => KmlFeature,
    getForegroundColor: () => String,
    getId: () => String,
    getMaxHeight: () => Double,
    getMaxWidth: () => Double,
    getMinHeight: () => Double,
    getMinWidth: () => Double,
    setBackgroundColor: String => Unit,
    setCloseButtonEnabled: Boolean => Unit,
    setFeature: KmlFeature => Unit,
    setForegroundColor: String => Unit,
    setId: String => Unit,
    setMaxHeight: Double => Unit,
    setMaxWidth: Double => Unit,
    setMinHeight: Double => Unit,
    setMinWidth: Double => Unit
  ): GEHtmlBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getCloseButtonEnabled = js.Any.fromFunction0(getCloseButtonEnabled), getFeature = js.Any.fromFunction0(getFeature), getForegroundColor = js.Any.fromFunction0(getForegroundColor), getId = js.Any.fromFunction0(getId), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinHeight = js.Any.fromFunction0(getMinHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setCloseButtonEnabled = js.Any.fromFunction1(setCloseButtonEnabled), setFeature = js.Any.fromFunction1(setFeature), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setId = js.Any.fromFunction1(setId), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setMaxWidth = js.Any.fromFunction1(setMaxWidth), setMinHeight = js.Any.fromFunction1(setMinHeight), setMinWidth = js.Any.fromFunction1(setMinWidth))
    __obj.asInstanceOf[GEHtmlBalloon]
  }
  
  @scala.inline
  implicit class GEHtmlBalloonMutableBuilder[Self <: GEHtmlBalloon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBackgroundColor(value: () => String): Self = StObject.set(x, "getBackgroundColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetForegroundColor(value: () => String): Self = StObject.set(x, "getForegroundColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBackgroundColor(value: String => Unit): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForegroundColor(value: String => Unit): Self = StObject.set(x, "setForegroundColor", js.Any.fromFunction1(value))
  }
}
