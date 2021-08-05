package typings.devextreme.anon

import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.gradientSet
import typings.devextreme.devextremeStrings.indicatingSet
import typings.devextreme.devextremeStrings.simpleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseColorSet extends StObject {
  
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.undefined
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
}
object BaseColorSet {
  
  inline def apply(): BaseColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseColorSet]
  }
  
  extension [Self <: BaseColorSet](x: Self) {
    
    inline def setBaseColorSet(value: simpleSet | indicatingSet | gradientSet): Self = StObject.set(x, "baseColorSet", value.asInstanceOf[js.Any])
    
    inline def setBaseColorSetUndefined: Self = StObject.set(x, "baseColorSet", js.undefined)
    
    inline def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
  }
}
