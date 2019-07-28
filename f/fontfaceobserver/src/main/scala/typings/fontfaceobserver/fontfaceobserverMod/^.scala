package typings.fontfaceobserver.fontfaceobserverMod

import typings.fontfaceobserver.FontFaceObserver
import typings.fontfaceobserver.FontFaceObserverNs.FontVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fontfaceobserver", JSImport.Namespace)
@js.native
class ^ protected () extends FontFaceObserver {
  /**
    * Creates a new FontFaceObserver.
    * @param fontFamilyName Name of the font family to observe.
    * @param variant Description of the font variant to observe. If a property is not present it will default to normal.
    */
  def this(fontFamilyName: String) = this()
  def this(fontFamilyName: String, variant: FontVariant) = this()
}

