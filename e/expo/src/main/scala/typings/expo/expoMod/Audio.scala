package typings.expo.expoMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLAudioElement
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Audio")
@js.native
class Audio ()
  extends typings.std.Audio {
  def this(src: String) = this()
}

@JSImport("expo", "Audio")
@js.native
class AudioCls () extends HTMLAudioElement {
  def this(src: String) = this()
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

@JSImport("expo", "Audio")
@js.native
object Audio
  extends Instantiable0[HTMLAudioElement]
     with Instantiable1[/* src */ String, HTMLAudioElement]

