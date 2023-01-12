package typings.glidejsGlide.mod

import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GapsComponent
  extends StObject
     with Component {
  
  /**
    * Applies gaps between slides. First and last slides do not receive it's edge margins.
    */
  @JSName("apply")
  def apply(slides: HTMLCollection): Unit
  
  /**
    * Holds additional dimensions value caused by gaps. Used to increase the width of the slides wrapper.
    */
  val grow: Double
  
  @JSName("mount")
  def mount_MGapsComponent(): Unit
  
  /**
    * Holds reduction value caused by gaps. Used to subtract the width of the slides.
    */
  val reductor: Double
  
  /**
    * Removes gaps from the slides.
    */
  def remove(slides: HTMLCollection): Unit
  
  /**
    * Holds value of gaps.
    */
  val value: Double
}
object GapsComponent {
  
  inline def apply(
    apply: HTMLCollection => Unit,
    grow: Double,
    mount: () => Unit,
    reductor: Double,
    remove: HTMLCollection => Unit,
    value: Double
  ): GapsComponent = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), grow = grow.asInstanceOf[js.Any], mount = js.Any.fromFunction0(mount), reductor = reductor.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapsComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GapsComponent] (val x: Self) extends AnyVal {
    
    inline def setApply(value: HTMLCollection => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setReductor(value: Double): Self = StObject.set(x, "reductor", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: HTMLCollection => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
