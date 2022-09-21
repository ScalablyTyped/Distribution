package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persistent extends StObject {
  
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
  
  var scripts: js.Array[ExtensionURL]
}
object Persistent {
  
  inline def apply(scripts: js.Array[ExtensionURL]): Persistent = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistent]
  }
  
  extension [Self <: Persistent](x: Self) {
    
    inline def setPersistent(value: PersistentBackgroundProperty): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setScripts(value: js.Array[ExtensionURL]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: ExtensionURL*): Self = StObject.set(x, "scripts", js.Array(value*))
  }
}
