package typings.dmgBuilder

import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLicenseButtonsMod {
  
  @JSImport("dmg-builder/out/licenseButtons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLicenseButtons(licenseButtonFiles: js.Array[LicenseButtonsFile], langWithRegion: String, id: Double, name: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLicenseButtons")(licenseButtonFiles.asInstanceOf[js.Any], langWithRegion.asInstanceOf[js.Any], id.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getLicenseButtonsFile(packager: PlatformPackager[Any]): js.Promise[js.Array[LicenseButtonsFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLicenseButtonsFile")(packager.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LicenseButtonsFile]]]
  
  trait LicenseButtonsFile extends StObject {
    
    var file: String
    
    var lang: String
    
    var langName: String
    
    var langWithRegion: String
  }
  object LicenseButtonsFile {
    
    inline def apply(file: String, lang: String, langName: String, langWithRegion: String): LicenseButtonsFile = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseButtonsFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LicenseButtonsFile] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangName(value: String): Self = StObject.set(x, "langName", value.asInstanceOf[js.Any])
      
      inline def setLangWithRegion(value: String): Self = StObject.set(x, "langWithRegion", value.asInstanceOf[js.Any])
    }
  }
}
