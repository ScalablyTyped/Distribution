package typings.firefoxDashWebextDashBrowser.browser.extensionTypes

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.Anon_File
  - typings.firefoxDashWebextDashBrowser.Anon_Code
*/
trait ExtensionFileOrCode extends js.Object

object ExtensionFileOrCode {
  @scala.inline
  def Anon_File(file: ExtensionURL): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
  @scala.inline
  def Anon_Code(code: String): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
}

