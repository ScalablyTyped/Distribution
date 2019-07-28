package typings.firefoxDashWebextDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chromeresources extends js.Object {
  var chrome_resources: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]]
  var version: String
}

object Anon_Chromeresources {
  @scala.inline
  def apply(chrome_resources: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]], version: String): Anon_Chromeresources = {
    val __obj = js.Dynamic.literal(chrome_resources = chrome_resources, version = version)
  
    __obj.asInstanceOf[Anon_Chromeresources]
  }
}

