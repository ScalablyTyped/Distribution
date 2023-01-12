package typings.fluentuiUtilities

import typings.fluentuiUtilities.anon.ReadonlyICustomizerContex
import typings.fluentuiUtilities.libCreateRefMod.IRefObject
import typings.fluentuiUtilities.libCustomizationsCustomizationsMod.ISettings
import typings.fluentuiUtilities.libCustomizationsCustomizationsMod.ISettingsFunction
import typings.fluentuiUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCustomizationsCustomizerDottypesMod {
  
  /* Inlined @fluentui/utilities.@fluentui/utilities/lib/BaseComponent.types.IBaseProps<any> & std.Partial<{  settings :@fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettings | @fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettingsFunction,   scopedSettings :@fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettings | @fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettingsFunction}> & {  children :react.react.ReactNode | undefined,   contextTransform :(context : std.Readonly<@fluentui/utilities.@fluentui/utilities/lib/customizations/CustomizerContext.ICustomizerContext>): @fluentui/utilities.@fluentui/utilities/lib/customizations/CustomizerContext.ICustomizerContext | undefined} */
  trait ICustomizerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var componentRef: js.UndefOr[IRefObject[Any]] = js.undefined
    
    /**
      * Optional transform function for context. Any implementations should take care to return context without
      * mutating it.
      */
    var contextTransform: js.UndefOr[js.Function1[/* context */ ReadonlyICustomizerContex, ICustomizerContext]] = js.undefined
    
    var scopedSettings: js.UndefOr[ISettings | ISettingsFunction] = js.undefined
    
    var settings: js.UndefOr[ISettings | ISettingsFunction] = js.undefined
  }
  object ICustomizerProps {
    
    inline def apply(): ICustomizerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomizerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICustomizerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponentRef(value: IRefObject[Any]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ Any | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): Self = StObject.set(x, "contextTransform", js.Any.fromFunction1(value))
      
      inline def setContextTransformUndefined: Self = StObject.set(x, "contextTransform", js.undefined)
      
      inline def setScopedSettings(value: ISettings | ISettingsFunction): Self = StObject.set(x, "scopedSettings", value.asInstanceOf[js.Any])
      
      inline def setScopedSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = StObject.set(x, "scopedSettings", js.Any.fromFunction1(value))
      
      inline def setScopedSettingsUndefined: Self = StObject.set(x, "scopedSettings", js.undefined)
      
      inline def setSettings(value: ISettings | ISettingsFunction): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
