package typings.egjsAgent

import typings.egjsAgent.typesMod.NavigatorUABrandVersion
import typings.egjsAgent.typesMod.PresetInfo
import typings.egjsAgent.typesMod.PresetResult
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@egjs/agent/declaration/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertVersion(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertVersion")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def execRegExp(pattern: String, text: String): RegExpExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("execRegExp")(pattern.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[RegExpExecArray | Null]
  
  inline def find[T](arr: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Any]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def findBrand(brands: js.Array[NavigatorUABrandVersion], preset: PresetInfo): NavigatorUABrandVersion | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findBrand")(brands.asInstanceOf[js.Any], preset.asInstanceOf[js.Any])).asInstanceOf[NavigatorUABrandVersion | Null]
  
  inline def findPreset(presets: js.Array[PresetInfo], userAgent: String): PresetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findPreset")(presets.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[PresetResult]
  
  inline def findPresetBrand(presets: js.Array[PresetInfo], brands: js.Array[NavigatorUABrandVersion]): NavigatorUABrandVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("findPresetBrand")(presets.asInstanceOf[js.Any], brands.asInstanceOf[js.Any])).asInstanceOf[NavigatorUABrandVersion]
  
  inline def findVersion(versionTest: String, userAgent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findVersion")(versionTest.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUserAgentString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentString")().asInstanceOf[String]
  inline def getUserAgentString(agent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentString")(agent.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasUserAgentData(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUserAgentData")().asInstanceOf[Boolean]
  
  inline def some[T](arr: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
