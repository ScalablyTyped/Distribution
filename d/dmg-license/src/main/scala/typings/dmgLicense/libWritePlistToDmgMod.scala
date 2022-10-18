package typings.dmgLicense

import typings.plist.mod.PlistValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritePlistToDmgMod {
  
  @JSImport("dmg-license/lib/writePlistToDmg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(imagePath: String, plist: PlistValue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imagePath.asInstanceOf[js.Any], plist.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
