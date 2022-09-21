package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Host
import typings.expoConfigPlugins.anon.PickExpoConfigschemeandro
import typings.expoConfigPlugins.anon.Scheme
import typings.expoConfigPlugins.manifestMod.AndroidManifest
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemeMod {
  
  @JSImport("@expo/config-plugins/build/android/Scheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendScheme(scheme: String, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScheme")(scheme.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  inline def ensureManifestHasValidIntentFilter(androidManifest: AndroidManifest): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureManifestHasValidIntentFilter")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getScheme(config: Scheme): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheme")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getSchemesFromManifest(androidManifest: AndroidManifest): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromManifest")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getSchemesFromManifest(androidManifest: AndroidManifest, requestedHost: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromManifest")(androidManifest.asInstanceOf[js.Any], requestedHost.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def hasScheme(scheme: String, androidManifest: AndroidManifest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScheme")(scheme.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeScheme(scheme: String, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("removeScheme")(scheme.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  inline def setScheme(config: PickExpoConfigschemeandro, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setScheme")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/Scheme", "withScheme")
  @js.native
  val withScheme: ConfigPlugin[Unit] = js.native
  
  trait IntentFilterProps extends StObject {
    
    var actions: js.Array[String]
    
    var categories: js.Array[String]
    
    var data: js.Array[Host]
  }
  object IntentFilterProps {
    
    inline def apply(actions: js.Array[String], categories: js.Array[String], data: js.Array[Host]): IntentFilterProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentFilterProps]
    }
    
    extension [Self <: IntentFilterProps](x: Self) {
      
      inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setData(value: js.Array[Host]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Host*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
}
