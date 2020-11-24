package typings.expoConfigureSplashScreen.xmlManipulationMod

import typings.xmlJs.mod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/xml-manipulation", "readXmlFile")
@js.native
object readXmlFile extends js.Object {
  
  def apply(filePath: String): js.Promise[Element] = js.native
  def apply(filePath: String, fallbackContent: String): js.Promise[Element] = js.native
  def apply(filePath: String, fallbackContent: Element): js.Promise[Element] = js.native
}
