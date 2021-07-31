package typings.dmgBuilder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseDefaultButtonsMod {
  
  @JSImport("dmg-builder/out/licenseDefaultButtons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDefaultButtons(langWithRegion: String, id: Double, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultButtons")(langWithRegion.asInstanceOf[js.Any], id.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
