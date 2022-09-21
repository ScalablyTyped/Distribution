package typings.glidejsGlide.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlComponent
  extends StObject
     with Component {
  
  /**
    * Mounts and initializes a component. Collects all the necessary HTML elements.
    */
  @JSName("mount")
  def mount_MHtmlComponent(): Unit = js.native
  
  /**
    * Holds a reference to the element passed at initialization.
    */
  def root: HTMLElement = js.native
  def root_=(element: String | HTMLElement): Unit = js.native
  
  /**
    * Holds reference to the `[data-glide-el="track"]` element.
    */
  var track: HTMLElement = js.native
  
  /**
    * Holds reference to the `[data-glide-el="track"]` element.
    */
  val wrapper: HTMLElement = js.native
}
