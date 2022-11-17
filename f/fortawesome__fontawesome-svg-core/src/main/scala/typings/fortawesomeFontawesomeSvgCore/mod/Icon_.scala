package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition
import typings.fortawesomeFontawesomeCommonTypes.mod.IconName
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPathData
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon_
  extends StObject
     with FontawesomeObject
     with IconDefinition {
  
  val `type`: "icon"
}
object Icon_ {
  
  inline def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    icon: js.Tuple5[
      Double, 
      // width
  Double, 
      js.Array[// height
  String], 
      // ligatures
  String, 
      // unicode
  IconPathData
    ],
    iconName: IconName,
    node: HTMLCollection,
    prefix: IconPrefix
  ): Icon_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icon")
    __obj.asInstanceOf[Icon_]
  }
  
  extension [Self <: Icon_](x: Self) {
    
    inline def setType(value: "icon"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
