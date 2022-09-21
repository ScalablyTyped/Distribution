package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildComponent
  extends StObject
     with Component {
  
  /**
    * Applies an active class to slides based on the current index.
    */
  def activeClass(): Unit
  
  @JSName("mount")
  def mount_MBuildComponent(): Unit
  
  /**
    * Removes all classes applied by component.
    */
  def removeClasses(): Unit
  
  /**
    * Applies type class based on the instance settings.
    */
  def typeClass(): Unit
}
object BuildComponent {
  
  inline def apply(activeClass: () => Unit, mount: () => Unit, removeClasses: () => Unit, typeClass: () => Unit): BuildComponent = {
    val __obj = js.Dynamic.literal(activeClass = js.Any.fromFunction0(activeClass), mount = js.Any.fromFunction0(mount), removeClasses = js.Any.fromFunction0(removeClasses), typeClass = js.Any.fromFunction0(typeClass))
    __obj.asInstanceOf[BuildComponent]
  }
  
  extension [Self <: BuildComponent](x: Self) {
    
    inline def setActiveClass(value: () => Unit): Self = StObject.set(x, "activeClass", js.Any.fromFunction0(value))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setRemoveClasses(value: () => Unit): Self = StObject.set(x, "removeClasses", js.Any.fromFunction0(value))
    
    inline def setTypeClass(value: () => Unit): Self = StObject.set(x, "typeClass", js.Any.fromFunction0(value))
  }
}
