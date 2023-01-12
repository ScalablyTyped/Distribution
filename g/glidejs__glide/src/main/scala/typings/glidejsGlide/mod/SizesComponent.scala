package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizesComponent
  extends StObject
     with Component {
  
  /**
    * Holds a number of slides.
    */
  val length: Double
  
  /**
    * Clears all applied dimensions from instance elements.
    */
  def remove(): Unit
  
  /**
    * Applies dimensions to the slide elements.
    */
  def setupSlides(): Unit
  
  /**
    * Applies dimensions to the slides wrapper element.
    */
  def setupWrapper(): Unit
  
  /**
    * Holds a dimension of the single slide reduced by settings.
    */
  val slideWidth: Double
  
  /**
    * Holds a dimension of the instance viewport.
    */
  val width: Double
  
  /**
    * Holds a dimension of the slides wrapper.
    */
  val wrapperWidth: Double
}
object SizesComponent {
  
  inline def apply(
    length: Double,
    remove: () => Unit,
    setupSlides: () => Unit,
    setupWrapper: () => Unit,
    slideWidth: Double,
    width: Double,
    wrapperWidth: Double
  ): SizesComponent = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setupSlides = js.Any.fromFunction0(setupSlides), setupWrapper = js.Any.fromFunction0(setupWrapper), slideWidth = slideWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wrapperWidth = wrapperWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizesComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizesComponent] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetupSlides(value: () => Unit): Self = StObject.set(x, "setupSlides", js.Any.fromFunction0(value))
    
    inline def setSetupWrapper(value: () => Unit): Self = StObject.set(x, "setupWrapper", js.Any.fromFunction0(value))
    
    inline def setSlideWidth(value: Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWrapperWidth(value: Double): Self = StObject.set(x, "wrapperWidth", value.asInstanceOf[js.Any])
  }
}
