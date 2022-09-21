package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@expo/config-plugins.@expo/config-plugins/build/plugins/withMod.BaseModOptions, 'skipEmptyMod' | 'saveToInternal'>> */
trait PartialPickBaseModOptions extends StObject {
  
  var saveToInternal: js.UndefOr[Boolean] = js.undefined
  
  var skipEmptyMod: js.UndefOr[Boolean] = js.undefined
}
object PartialPickBaseModOptions {
  
  inline def apply(): PartialPickBaseModOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickBaseModOptions]
  }
  
  extension [Self <: PartialPickBaseModOptions](x: Self) {
    
    inline def setSaveToInternal(value: Boolean): Self = StObject.set(x, "saveToInternal", value.asInstanceOf[js.Any])
    
    inline def setSaveToInternalUndefined: Self = StObject.set(x, "saveToInternal", js.undefined)
    
    inline def setSkipEmptyMod(value: Boolean): Self = StObject.set(x, "skipEmptyMod", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyModUndefined: Self = StObject.set(x, "skipEmptyMod", js.undefined)
  }
}
