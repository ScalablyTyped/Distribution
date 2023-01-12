package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEAbstractBalloon extends StObject {
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def getCloseButtonEnabled(): Boolean
  
  /**
    * Determines what the balloon is attached to.
    */
  def getFeature(): KmlFeature
  
  /**
    * The ID of the balloon.
    */
  def getId(): String
  
  /**
    * Maximum height of the balloon.
    */
  def getMaxHeight(): Double
  
  /**
    * Maximum width of the balloon.
    */
  def getMaxWidth(): Double
  
  /**
    * Minimum height of the balloon.
    */
  def getMinHeight(): Double
  
  /**
    * Minimum width of the balloon.
    */
  def getMinWidth(): Double
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def setCloseButtonEnabled(closeButtonEnabled: Boolean): Unit
  
  /**
    * Determines what the balloon is attached to.
    */
  def setFeature(feature: KmlFeature): Unit
  
  /**
    * The ID of the balloon.
    */
  def setId(id: String): Unit
  
  /**
    * Maximum height of the balloon.
    */
  def setMaxHeight(maxHeight: Double): Unit
  
  /**
    * Maximum width of the balloon.
    */
  def setMaxWidth(maxWidth: Double): Unit
  
  /**
    * Minimum height of the balloon.
    */
  def setMinHeight(minHeight: Double): Unit
  
  /**
    * Minimum width of the balloon.
    */
  def setMinWidth(minWidth: Double): Unit
}
object GEAbstractBalloon {
  
  inline def apply(
    getCloseButtonEnabled: () => Boolean,
    getFeature: () => KmlFeature,
    getId: () => String,
    getMaxHeight: () => Double,
    getMaxWidth: () => Double,
    getMinHeight: () => Double,
    getMinWidth: () => Double,
    setCloseButtonEnabled: Boolean => Unit,
    setFeature: KmlFeature => Unit,
    setId: String => Unit,
    setMaxHeight: Double => Unit,
    setMaxWidth: Double => Unit,
    setMinHeight: Double => Unit,
    setMinWidth: Double => Unit
  ): GEAbstractBalloon = {
    val __obj = js.Dynamic.literal(getCloseButtonEnabled = js.Any.fromFunction0(getCloseButtonEnabled), getFeature = js.Any.fromFunction0(getFeature), getId = js.Any.fromFunction0(getId), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinHeight = js.Any.fromFunction0(getMinHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), setCloseButtonEnabled = js.Any.fromFunction1(setCloseButtonEnabled), setFeature = js.Any.fromFunction1(setFeature), setId = js.Any.fromFunction1(setId), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setMaxWidth = js.Any.fromFunction1(setMaxWidth), setMinHeight = js.Any.fromFunction1(setMinHeight), setMinWidth = js.Any.fromFunction1(setMinWidth))
    __obj.asInstanceOf[GEAbstractBalloon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GEAbstractBalloon] (val x: Self) extends AnyVal {
    
    inline def setGetCloseButtonEnabled(value: () => Boolean): Self = StObject.set(x, "getCloseButtonEnabled", js.Any.fromFunction0(value))
    
    inline def setGetFeature(value: () => KmlFeature): Self = StObject.set(x, "getFeature", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetMaxHeight(value: () => Double): Self = StObject.set(x, "getMaxHeight", js.Any.fromFunction0(value))
    
    inline def setGetMaxWidth(value: () => Double): Self = StObject.set(x, "getMaxWidth", js.Any.fromFunction0(value))
    
    inline def setGetMinHeight(value: () => Double): Self = StObject.set(x, "getMinHeight", js.Any.fromFunction0(value))
    
    inline def setGetMinWidth(value: () => Double): Self = StObject.set(x, "getMinWidth", js.Any.fromFunction0(value))
    
    inline def setSetCloseButtonEnabled(value: Boolean => Unit): Self = StObject.set(x, "setCloseButtonEnabled", js.Any.fromFunction1(value))
    
    inline def setSetFeature(value: KmlFeature => Unit): Self = StObject.set(x, "setFeature", js.Any.fromFunction1(value))
    
    inline def setSetId(value: String => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetMaxHeight(value: Double => Unit): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
    
    inline def setSetMaxWidth(value: Double => Unit): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
    
    inline def setSetMinHeight(value: Double => Unit): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
    
    inline def setSetMinWidth(value: Double => Unit): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
  }
}
