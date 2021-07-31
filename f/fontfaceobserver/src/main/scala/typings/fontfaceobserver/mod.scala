package typings.fontfaceobserver

import typings.fontfaceobserver.FontFaceObserver.FontVariant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fontfaceobserver", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with FontFaceObserver {
    /**
      * Creates a new FontFaceObserver.
      * @param fontFamilyName Name of the font family to observe.
      * @param variant Description of the font variant to observe. If a property is not present it will default to normal.
      */
    def this(fontFamilyName: String) = this()
    def this(fontFamilyName: String, variant: FontVariant) = this()
  }
}
