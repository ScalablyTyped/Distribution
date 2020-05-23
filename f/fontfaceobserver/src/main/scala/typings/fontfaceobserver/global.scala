package typings.fontfaceobserver

import typings.fontfaceobserver.FontFaceObserver.FontVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class FontFaceObserver protected ()
    extends typings.fontfaceobserver.FontFaceObserver {
    /**
      * Creates a new FontFaceObserver.
      * @param fontFamilyName Name of the font family to observe.
      * @param variant Description of the font variant to observe. If a property is not present it will default to normal.
      */
    def this(fontFamilyName: String) = this()
    def this(fontFamilyName: String, variant: FontVariant) = this()
  }
  
}

