package typings.dmgBuilder

import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseButtonsMod {
  
  @JSImport("dmg-builder/out/licenseButtons", "getLicenseButtons")
  @js.native
  def getLicenseButtons(licenseButtonFiles: js.Array[LicenseButtonsFile], langWithRegion: String, id: Double, name: String): js.Promise[String] = js.native
  
  @JSImport("dmg-builder/out/licenseButtons", "getLicenseButtonsFile")
  @js.native
  def getLicenseButtonsFile(packager: PlatformPackager[_]): js.Promise[js.Array[LicenseButtonsFile]] = js.native
  
  @js.native
  trait LicenseButtonsFile extends StObject {
    
    var file: String = js.native
    
    var lang: String = js.native
    
    var langName: String = js.native
    
    var langWithRegion: String = js.native
  }
  object LicenseButtonsFile {
    
    @scala.inline
    def apply(file: String, lang: String, langName: String, langWithRegion: String): LicenseButtonsFile = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseButtonsFile]
    }
    
    @scala.inline
    implicit class LicenseButtonsFileMutableBuilder[Self <: LicenseButtonsFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangName(value: String): Self = StObject.set(x, "langName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangWithRegion(value: String): Self = StObject.set(x, "langWithRegion", value.asInstanceOf[js.Any])
    }
  }
}
