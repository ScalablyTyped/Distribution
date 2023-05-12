package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGroupOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * Indicates if click, mouseover, mouseout events & hoverCursor should also check for subtargets
    */
  var subTargetCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * setOnGroup is a method used for TextBox that is no more used since 2.0.0 The behavior is still
    * available setting this boolean to true.
    * @since 2.0.0
    * @default
    */
  var useSetOnGroup: js.UndefOr[Boolean] = js.undefined
}
object IGroupOptions {
  
  inline def apply(): IGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGroupOptions] (val x: Self) extends AnyVal {
    
    inline def setSubTargetCheck(value: Boolean): Self = StObject.set(x, "subTargetCheck", value.asInstanceOf[js.Any])
    
    inline def setSubTargetCheckUndefined: Self = StObject.set(x, "subTargetCheck", js.undefined)
    
    inline def setUseSetOnGroup(value: Boolean): Self = StObject.set(x, "useSetOnGroup", value.asInstanceOf[js.Any])
    
    inline def setUseSetOnGroupUndefined: Self = StObject.set(x, "useSetOnGroup", js.undefined)
  }
}
