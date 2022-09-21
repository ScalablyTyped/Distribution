package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEAbstractBalloon")
@js.native
open class GEAbstractBalloon ()
  extends StObject
     with typings.googleEarth.google.earth.GEAbstractBalloon {
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  /* CompleteClass */
  override def getCloseButtonEnabled(): Boolean = js.native
  
  /**
    * Determines what the balloon is attached to.
    */
  /* CompleteClass */
  override def getFeature(): typings.googleEarth.google.earth.KmlFeature = js.native
  
  /**
    * The ID of the balloon.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * Maximum height of the balloon.
    */
  /* CompleteClass */
  override def getMaxHeight(): Double = js.native
  
  /**
    * Maximum width of the balloon.
    */
  /* CompleteClass */
  override def getMaxWidth(): Double = js.native
  
  /**
    * Minimum height of the balloon.
    */
  /* CompleteClass */
  override def getMinHeight(): Double = js.native
  
  /**
    * Minimum width of the balloon.
    */
  /* CompleteClass */
  override def getMinWidth(): Double = js.native
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  /* CompleteClass */
  override def setCloseButtonEnabled(closeButtonEnabled: Boolean): Unit = js.native
  
  /**
    * Determines what the balloon is attached to.
    */
  /* CompleteClass */
  override def setFeature(feature: typings.googleEarth.google.earth.KmlFeature): Unit = js.native
  
  /**
    * The ID of the balloon.
    */
  /* CompleteClass */
  override def setId(id: String): Unit = js.native
  
  /**
    * Maximum height of the balloon.
    */
  /* CompleteClass */
  override def setMaxHeight(maxHeight: Double): Unit = js.native
  
  /**
    * Maximum width of the balloon.
    */
  /* CompleteClass */
  override def setMaxWidth(maxWidth: Double): Unit = js.native
  
  /**
    * Minimum height of the balloon.
    */
  /* CompleteClass */
  override def setMinHeight(minHeight: Double): Unit = js.native
  
  /**
    * Minimum width of the balloon.
    */
  /* CompleteClass */
  override def setMinWidth(minWidth: Double): Unit = js.native
}
