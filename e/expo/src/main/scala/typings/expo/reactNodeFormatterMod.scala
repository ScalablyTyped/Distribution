package typings.expo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNodeFormatterMod {
  
  object default {
    
    @JSImport("expo/build/logs/format/ReactNodeFormatter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def serialize(node: js.Any, config: js.Any, indentation: js.Any, depth: js.Any, refs: js.Any, printer: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def test(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
