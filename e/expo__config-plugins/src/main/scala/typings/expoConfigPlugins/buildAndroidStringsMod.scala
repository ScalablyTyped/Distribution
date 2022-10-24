package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Kind
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidStringsMod {
  
  @JSImport("@expo/config-plugins/build/android/Strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProjectStringsXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStringsXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getProjectStringsXMLPathAsync(projectRoot: String, param1: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStringsXMLPathAsync")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def removeStringItem(named: String, stringFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStringItem")(named.asInstanceOf[js.Any], stringFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def setStringItem(itemToAdd: js.Array[ResourceItemXML], stringFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setStringItem")(itemToAdd.asInstanceOf[js.Any], stringFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
}
