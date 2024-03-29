package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Kind
import typings.expoConfigPlugins.anon.Name
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidColorsMod {
  
  @JSImport("@expo/config-plugins/build/android/Colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignColorValue(xml: ResourceXML, param1: Name): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("assignColorValue")(xml.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def getColorsAsObject(xml: ResourceXML): (Record[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorsAsObject")(xml.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String]) | Null]
  
  inline def getObjectAsColorsXml(obj: Record[String, String]): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsColorsXml")(obj.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
  
  inline def getProjectColorsXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectColorsXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getProjectColorsXMLPathAsync(projectRoot: String, param1: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectColorsXMLPathAsync")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def removeColorItem(named: String, contents: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColorItem")(named.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def setColorItem(itemToAdd: ResourceItemXML, colorFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setColorItem")(itemToAdd.asInstanceOf[js.Any], colorFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
}
