package typings.electronInstallerDmg

import typings.appdmg.mod.SpecificationCodeSign
import typings.appdmg.mod.SpecificationContents
import typings.appdmg.mod.SpecificationWindow
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDBZ
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDCO
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDRO
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDRW
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDZO
import typings.electronInstallerDmg.electronInstallerDmgStrings.ULFO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<appdmg.appdmg.Specification> */
  trait PartialSpecification extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var `background-color`: js.UndefOr[String] = js.undefined
    
    var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.undefined
    
    var contents: js.UndefOr[js.Array[SpecificationContents]] = js.undefined
    
    var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var `icon-size`: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var window: js.UndefOr[SpecificationWindow] = js.undefined
  }
  object PartialSpecification {
    
    inline def apply(): PartialSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpecification]
    }
    
    extension [Self <: PartialSpecification](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
      
      inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def `setCode-sign`(value: SpecificationCodeSign): Self = StObject.set(x, "code-sign", value.asInstanceOf[js.Any])
      
      inline def `setCode-signUndefined`: Self = StObject.set(x, "code-sign", js.undefined)
      
      inline def setContents(value: js.Array[SpecificationContents]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setContentsVarargs(value: SpecificationContents*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def `setIcon-size`(value: Double): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
      
      inline def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWindow(value: SpecificationWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
