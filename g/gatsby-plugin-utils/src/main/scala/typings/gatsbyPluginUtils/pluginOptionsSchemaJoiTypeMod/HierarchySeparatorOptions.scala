package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.gatsbyPluginUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchySeparatorOptions extends StObject {
  
  /**
    * overrides the default `.` hierarchy separator. Set to false to treat the key as a literal value.
    *
    * @default '.'
    */
  var separator: js.UndefOr[String | `false`] = js.undefined
}
object HierarchySeparatorOptions {
  
  inline def apply(): HierarchySeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchySeparatorOptions]
  }
  
  extension [Self <: HierarchySeparatorOptions](x: Self) {
    
    inline def setSeparator(value: String | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
