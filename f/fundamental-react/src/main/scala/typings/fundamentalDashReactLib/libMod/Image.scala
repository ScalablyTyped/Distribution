package typings
package fundamentalDashReactLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib", "Image")
@js.native
class Image ()
  extends stdLib.Image {
  def this(width: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double) = this()
}

@JSImport("fundamental-react/lib", "Image")
@js.native
class ImageCls ()
  extends stdLib.HTMLImageElement {
  def this(width: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double) = this()
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
}

@JSImport("fundamental-react/lib", "Image")
@js.native
object Image
  extends org.scalablytyped.runtime.Instantiable0[stdLib.HTMLImageElement]
     with org.scalablytyped.runtime.Instantiable1[/* width */ scala.Double, stdLib.HTMLImageElement]
     with org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, stdLib.HTMLImageElement]

