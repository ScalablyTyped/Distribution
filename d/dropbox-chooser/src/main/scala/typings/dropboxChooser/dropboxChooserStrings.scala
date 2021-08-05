package typings.dropboxChooser

import typings.dropboxChooser.Dropbox.ChooserFileMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropboxChooserStrings {
  
  @js.native
  sealed trait crop
    extends StObject
       with ChooserFileMode
  inline def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait direct extends StObject
  inline def direct: direct = "direct".asInstanceOf[direct]
  
  @js.native
  sealed trait fit
    extends StObject
       with ChooserFileMode
  inline def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait fit_one_and_overflow
    extends StObject
       with ChooserFileMode
  inline def fit_one_and_overflow: fit_one_and_overflow = "fit_one_and_overflow".asInstanceOf[fit_one_and_overflow]
  
  @js.native
  sealed trait preview extends StObject
  inline def preview: preview = "preview".asInstanceOf[preview]
}
