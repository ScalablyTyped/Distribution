package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains in-line picture settings.
  */
trait InlinePictureInfo extends StObject {
  
  /**
    * Gets the actual image height.
    */
  val actualHeight: Double
  
  val actualHeigth: Double
  
  /**
    * Gets the actual image width.
    */
  val actualWidth: Double
  
  /**
    * Gets the image identifier.
    */
  val id: Double
  
  /**
    * Gets the initial image height.
    */
  val initialHeight: Double
  
  /**
    * Gets the initial image width.
    */
  val initialWidth: Double
  
  /**
    * Gets the image position.
    */
  val position: Double
  
  /**
    * Gets the X-scaling factor of the inline image.
    */
  val scaleX: Double
  
  /**
    * Gets the Y-scaling factor of the inline image.
    */
  val scaleY: Double
}
object InlinePictureInfo {
  
  @scala.inline
  def apply(
    actualHeight: Double,
    actualHeigth: Double,
    actualWidth: Double,
    id: Double,
    initialHeight: Double,
    initialWidth: Double,
    position: Double,
    scaleX: Double,
    scaleY: Double
  ): InlinePictureInfo = {
    val __obj = js.Dynamic.literal(actualHeight = actualHeight.asInstanceOf[js.Any], actualHeigth = actualHeigth.asInstanceOf[js.Any], actualWidth = actualWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialHeight = initialHeight.asInstanceOf[js.Any], initialWidth = initialWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureInfo]
  }
  
  @scala.inline
  implicit class InlinePictureInfoMutableBuilder[Self <: InlinePictureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualHeight(value: Double): Self = StObject.set(x, "actualHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualHeigth(value: Double): Self = StObject.set(x, "actualHeigth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualWidth(value: Double): Self = StObject.set(x, "actualWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialHeight(value: Double): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialWidth(value: Double): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
