package typings.fluentuiStyleUtilities

import typings.fluentuiMergeStyles.libIrawstyleMod.IRawStyle
import typings.fluentuiMergeStyles.libIrawstylebaseMod.ICSSRule
import typings.fluentuiStyleUtilities.fluentuiStyleUtilitiesStrings.absolute
import typings.fluentuiStyleUtilities.fluentuiStyleUtilitiesStrings.relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfacesIgetfocusstylesMod {
  
  trait IGetFocusStylesOptions extends StObject {
    
    /**
      * Color of the border.
      * @defaultvalue theme.palette.white
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /**
      * If the style should include a rounded border.
      */
    var borderRadius: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Style for high contrast mode.
      */
    var highContrastStyle: js.UndefOr[IRawStyle] = js.undefined
    
    /**
      * The number of pixels to inset the border.
      * @defaultvalue 0
      */
    var inset: js.UndefOr[Double] = js.undefined
    
    /**
      * If the styles should apply on `:focus` pseudo element.
      * @defaultvalue true
      */
    var isFocusedOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color of the outline.
      * @defaultvalue theme.palette.neutralSecondary
      */
    var outlineColor: js.UndefOr[String] = js.undefined
    
    /**
      * If default pointer events should be overridden.
      * @defaultvalue undefined
      */
    var pointerEvents: js.UndefOr[ICSSRule | String] = js.undefined
    
    /**
      * The positioning applied to the container.
      * Must be 'relative' or 'absolute' so that the focus border can live around it.
      * @defaultvalue 'relative'
      */
    var position: js.UndefOr[relative | absolute] = js.undefined
    
    /**
      * The width of the border in pixels.
      * @defaultvalue 1
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IGetFocusStylesOptions {
    
    inline def apply(): IGetFocusStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGetFocusStylesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetFocusStylesOptions] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setHighContrastStyle(value: IRawStyle): Self = StObject.set(x, "highContrastStyle", value.asInstanceOf[js.Any])
      
      inline def setHighContrastStyleUndefined: Self = StObject.set(x, "highContrastStyle", js.undefined)
      
      inline def setInset(value: Double): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setIsFocusedOnly(value: Boolean): Self = StObject.set(x, "isFocusedOnly", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedOnlyUndefined: Self = StObject.set(x, "isFocusedOnly", js.undefined)
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setPointerEvents(value: ICSSRule | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPosition(value: relative | absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
