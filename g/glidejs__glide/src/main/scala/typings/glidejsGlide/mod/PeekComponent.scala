package typings.glidejsGlide.mod

import typings.glidejsGlide.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeekComponent
  extends StObject
     with Component {
  
  /**
    * Holds value of a peeking.
    */
  @JSName("mount")
  def mount_MPeekComponent(): Unit
  
  /**
    * Mounts and initializes a component. Setups an initial peeking value.
    */
  val reductor: Double
  
  /**
    * Holds value of a peeking.
    */
  var value: Double | After
}
object PeekComponent {
  
  inline def apply(mount: () => Unit, reductor: Double, value: Double | After): PeekComponent = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction0(mount), reductor = reductor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeekComponent]
  }
  
  extension [Self <: PeekComponent](x: Self) {
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setReductor(value: Double): Self = StObject.set(x, "reductor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | After): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
