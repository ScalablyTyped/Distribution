package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconParams
  extends StObject
     with Params {
  
  var mask: js.UndefOr[IconLookup] = js.undefined
  
  var maskId: js.UndefOr[String] = js.undefined
  
  var symbol: js.UndefOr[FaSymbol] = js.undefined
  
  var transform: js.UndefOr[Transform] = js.undefined
}
object IconParams {
  
  @scala.inline
  def apply(): IconParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconParams]
  }
  
  @scala.inline
  implicit class IconParamsMutableBuilder[Self <: IconParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: IconLookup): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskId(value: String): Self = StObject.set(x, "maskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskIdUndefined: Self = StObject.set(x, "maskId", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setSymbol(value: FaSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
