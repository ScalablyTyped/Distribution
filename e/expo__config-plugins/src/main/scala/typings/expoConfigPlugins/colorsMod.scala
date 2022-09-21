package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Kind
import typings.expoConfigPlugins.anon.Name
import typings.expoConfigPlugins.resourcesMod.ResourceItemXML
import typings.expoConfigPlugins.resourcesMod.ResourceXML
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("@expo/config-plugins/build/android/Colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignColorValue(xml: ResourceXML, hasValueName: Name): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("assignColorValue")(xml.asInstanceOf[js.Any], hasValueName.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def getColorsAsObject(xml: ResourceXML): (Record[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorsAsObject")(xml.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String]) | Null]
  
  inline def getObjectAsColorsXml(obj: Record[String, String]): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsColorsXml")(obj.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
  
  inline def getProjectColorsXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectColorsXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getProjectColorsXMLPathAsync(projectRoot: String, hasKind: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectColorsXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKind.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def removeColorItem(named: String, contents: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColorItem")(named.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def setColorItem(itemToAdd: ResourceItemXML, colorFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setColorItem")(itemToAdd.asInstanceOf[js.Any], colorFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
}
