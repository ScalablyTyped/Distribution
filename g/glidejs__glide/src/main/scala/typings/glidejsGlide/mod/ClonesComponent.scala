package typings.glidejsGlide.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClonesComponent
  extends StObject
     with Component {
  
  /**
    * Appends collection of clones into DOM using indexes pattern.
    */
  def append(): Unit
  
  /**
    * Creates a collection of cloned slides using indexes pattern.
    */
  def collect(items: js.Array[Element]): js.Array[Element]
  
  /**
    * Holds additional dimentions value caused by clone HTML elements.
    */
  val grow: Double
  
  /**
    * Holds collection HTML elements of the cloned slides.
    */
  var items: js.Array[Element]
  
  @JSName("mount")
  def mount_MClonesComponent(): Unit
  
  /**
    * Removes HTML elements of clones from the DOM.
    */
  def remove(): Unit
}
object ClonesComponent {
  
  inline def apply(
    append: () => Unit,
    collect: js.Array[Element] => js.Array[Element],
    grow: Double,
    items: js.Array[Element],
    mount: () => Unit,
    remove: () => Unit
  ): ClonesComponent = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction0(append), collect = js.Any.fromFunction1(collect), grow = grow.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mount = js.Any.fromFunction0(mount), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ClonesComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClonesComponent] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: () => Unit): Self = StObject.set(x, "append", js.Any.fromFunction0(value))
    
    inline def setCollect(value: js.Array[Element] => js.Array[Element]): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
    
    inline def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Element*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
