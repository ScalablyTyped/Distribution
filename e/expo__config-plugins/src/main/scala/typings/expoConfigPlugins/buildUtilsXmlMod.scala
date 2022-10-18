package typings.expoConfigPlugins

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigPlugins.anon.Fallback
import typings.expoConfigPlugins.anon.IndentLevel
import typings.expoConfigPlugins.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsXmlMod {
  
  @JSImport("@expo/config-plugins/build/utils/XML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeAndroidString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAndroidString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(manifest: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(manifest.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(manifest: Any, hasIndentLevelNewline: IndentLevel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(manifest.asInstanceOf[js.Any], hasIndentLevelNewline.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseXMLAsync(contents: String): js.Promise[XMLObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXMLAsync")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Promise[XMLObject]]
  
  inline def readXMLAsync(options: Fallback): js.Promise[XMLObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("readXMLAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[XMLObject]]
  
  inline def unescapeAndroidString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeAndroidString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeXMLAsync(options: Path): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeXMLAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type XMLArray = js.Array[XMLValue]
  
  trait XMLObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[XMLValue]]
  object XMLObject {
    
    inline def apply(): XMLObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLObject]
    }
  }
  
  type XMLValue = Boolean | Double | String | Null | Any | XMLObject
}
