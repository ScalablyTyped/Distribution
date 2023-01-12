package typings.expoXcpretty

import typings.expoXcpretty.anon.xcodeProjectnamestringund
import typings.expoXcpretty.buildFormatterMod.Formatter
import typings.expoXcpretty.buildMetroParserMod.MetroParser
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoRunFormatterMod {
  
  @JSImport("@expo/xcpretty/build/ExpoRunFormatter", "ExpoRunFormatter")
  @js.native
  open class ExpoRunFormatter protected () extends Formatter {
    def this(props: ExpoRunFormatterProps) = this()
    
    @JSName("_parser")
    var _parser_ExpoRunFormatter: js.UndefOr[MetroParser] = js.native
    
    def formatMetroAssetCollectionError(errorContents: String): String = js.native
    
    def getNodeModuleName(filePath: String): String | Null = js.native
    def getNodeModuleName(filePath: String, target: String): String | Null = js.native
    
    /* private */ var podfileTracer: Any = js.native
    
    @JSName("props")
    var props_ExpoRunFormatter: ExpoRunFormatterProps = js.native
  }
  /* static members */
  object ExpoRunFormatter {
    
    @JSImport("@expo/xcpretty/build/ExpoRunFormatter", "ExpoRunFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(projectRoot: String): ExpoRunFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ExpoRunFormatter]
    inline def create(projectRoot: String, param1: xcodeProjectnamestringund): ExpoRunFormatter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ExpoRunFormatter]
  }
  
  trait ExpoRunFormatterProps extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var isDebug: js.UndefOr[Boolean] = js.undefined
    
    var podfile: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
    
    var projectRoot: String
  }
  object ExpoRunFormatterProps {
    
    inline def apply(projectRoot: String): ExpoRunFormatterProps = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpoRunFormatterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpoRunFormatterProps] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
      
      inline def setIsDebugUndefined: Self = StObject.set(x, "isDebug", js.undefined)
      
      inline def setPodfile(value: Record[String, Record[String, String]]): Self = StObject.set(x, "podfile", value.asInstanceOf[js.Any])
      
      inline def setPodfileUndefined: Self = StObject.set(x, "podfile", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
}
