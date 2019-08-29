package typings.fundamentalDashReact.libMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLImageElement
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib", "Image")
@js.native
class Image ()
  extends typings.std.Image {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
}

@JSImport("fundamental-react/lib", "Image")
@js.native
class ImageCls () extends HTMLImageElement {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSImport("fundamental-react/lib", "Image")
@js.native
object Image
  extends Instantiable0[HTMLImageElement]
     with Instantiable1[/* width */ Double, HTMLImageElement]
     with Instantiable2[/* width */ Double, /* height */ Double, HTMLImageElement]

