package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the font settings of the exported document.
  */
@JSGlobal("ExportFontInfo")
@js.native
open class ExportFontInfo ()
  extends StObject
     with typings.devexpressWeb.ExportFontInfo {
  
  /**
    * Specifies a value that specifies the GDI character set used by the current font.
    */
  /* CompleteClass */
  var GdiCharSet: Any = js.native
  
  /**
    * Specifies the name of the font used in the exported document.
    */
  /* CompleteClass */
  var Name: String = js.native
  
  /**
    * Specifies whether custom font settings are used in the exported document.
    */
  /* CompleteClass */
  var UseCustomFontInfo: Boolean = js.native
}
