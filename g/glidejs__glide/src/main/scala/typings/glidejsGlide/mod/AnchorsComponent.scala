package typings.glidejsGlide.mod

import typings.std.HTMLAnchorElement
import typings.std.HTMLCollectionOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorsComponent
  extends StObject
     with Component {
  
  /**
    * Restores href attribute on anchors and allows for redirections on click.
    */
  def attach(): this.type
  
  /**
    * Detaches href attribute from anchors and prevents redirections after click or swipe.
    */
  def detach(): this.type
  
  /**
    * Holds collection of `<a>` elements located inside slides.
    */
  val items: HTMLCollectionOf[HTMLAnchorElement]
  
  @JSName("mount")
  def mount_MAnchorsComponent(): Unit
}
object AnchorsComponent {
  
  inline def apply(
    attach: () => AnchorsComponent,
    detach: () => AnchorsComponent,
    items: HTMLCollectionOf[HTMLAnchorElement],
    mount: () => Unit
  ): AnchorsComponent = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), detach = js.Any.fromFunction0(detach), items = items.asInstanceOf[js.Any], mount = js.Any.fromFunction0(mount))
    __obj.asInstanceOf[AnchorsComponent]
  }
  
  extension [Self <: AnchorsComponent](x: Self) {
    
    inline def setAttach(value: () => AnchorsComponent): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    inline def setDetach(value: () => AnchorsComponent): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setItems(value: HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
  }
}
