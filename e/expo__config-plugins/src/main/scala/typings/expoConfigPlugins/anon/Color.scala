package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceGroupXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  @JSName("$")
  var $: js.UndefOr[Xmlnstools] = js.undefined
  
  var color: js.UndefOr[js.Array[ResourceItemXML]] = js.undefined
  
  var string: js.UndefOr[js.Array[ResourceItemXML]] = js.undefined
  
  var style: js.UndefOr[js.Array[ResourceGroupXML]] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def set$(value: Xmlnstools): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def set$Undefined: Self = StObject.set(x, "$", js.undefined)
    
    inline def setColor(value: js.Array[ResourceItemXML]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: ResourceItemXML*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setString(value: js.Array[ResourceItemXML]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setStringVarargs(value: ResourceItemXML*): Self = StObject.set(x, "string", js.Array(value*))
    
    inline def setStyle(value: js.Array[ResourceGroupXML]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ResourceGroupXML*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
