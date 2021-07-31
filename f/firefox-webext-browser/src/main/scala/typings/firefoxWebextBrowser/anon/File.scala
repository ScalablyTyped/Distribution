package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File
  extends StObject
     with ExtensionFileOrCode {
  
  var file: ExtensionURL
}
object File {
  
  @scala.inline
  def apply(file: ExtensionURL): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: ExtensionURL): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
