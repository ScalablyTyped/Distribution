package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Add
import typings.expoConfigPlugins.anon.Fallback
import typings.expoConfigPlugins.anon.ItemParent
import typings.expoConfigPlugins.anon.Kind
import typings.expoConfigPlugins.anon.NameParent
import typings.expoConfigPlugins.anon.Parent
import typings.expoConfigPlugins.anon.ParentXml
import typings.expoConfigPlugins.anon.Xml
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceGroupXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidStylesMod {
  
  @JSImport("@expo/config-plugins/build/android/Styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignStylesValue(xml: ResourceXML, param1: Add): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("assignStylesValue")(xml.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def getAppThemeLightNoActionBarGroup(): Parent = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppThemeLightNoActionBarGroup")().asInstanceOf[Parent]
  
  inline def getProjectStylesXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStylesXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getProjectStylesXMLPathAsync(projectRoot: String, param1: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStylesXMLPathAsync")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getStyleParent(xml: ResourceXML, group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleParent")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
  
  inline def getStylesGroupAsObject(xml: ResourceXML, group: NameParent): (Record[String, String]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStylesGroupAsObject")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[(Record[String, String]) | Null]
  
  inline def getStylesItem(param0: Xml): ResourceItemXML | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylesItem")(param0.asInstanceOf[js.Any]).asInstanceOf[ResourceItemXML | Null]
  
  inline def readStylesXMLAsync(param0: Fallback): js.Promise[ResourceXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStylesXMLAsync")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResourceXML]]
  
  inline def removeStylesItem(param0: ParentXml): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesItem")(param0.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
  
  inline def setStylesItem(param0: ItemParent): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("setStylesItem")(param0.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
}
