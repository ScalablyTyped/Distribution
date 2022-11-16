package typings.expoPlist

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.xmlbuilder.mod.XMLToStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  object default {
    
    @JSImport("@expo/plist/build", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/plist/build", "default.build")
    @js.native
    def build: js.Function2[/* obj */ Any, /* opts */ js.UndefOr[StringDictionary[Any]], String] = js.native
    inline def build(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def build(obj: Any, opts: StringDictionary[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def build_=(x: js.Function2[/* obj */ Any, /* opts */ js.UndefOr[StringDictionary[Any]], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/plist/build", "default.parse")
    @js.native
    def parse: js.Function1[/* xml */ String, Any] = js.native
    inline def parse(xml: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def parse_=(x: js.Function1[/* xml */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  }
  
  type PlistArray = js.Array[PlistValue]
  
  type PlistBuildOptions = XMLToStringOptions
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PlistObject = {readonly [x: string] : @expo/plist.@expo/plist/build.PlistValue}
  }}}
  to avoid circular code involving: 
  - @expo/plist.@expo/plist/build.PlistArray
  - @expo/plist.@expo/plist/build.PlistObject
  - @expo/plist.@expo/plist/build.PlistValue
  */
  trait PlistObject
    extends StObject
       with /* x */ StringDictionary[PlistValue]
  object PlistObject {
    
    inline def apply(): PlistObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlistObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PlistValue = string | number | boolean | std.Date | node.buffer.<global>.Buffer | @expo/plist.@expo/plist/build.PlistObject | @expo/plist.@expo/plist/build.PlistArray
  }}}
  to avoid circular code involving: 
  - @expo/plist.@expo/plist/build.PlistArray
  - @expo/plist.@expo/plist/build.PlistValue
  */
  type PlistValue = String | Double | Boolean | js.Date | Buffer | PlistObject | Any
}
