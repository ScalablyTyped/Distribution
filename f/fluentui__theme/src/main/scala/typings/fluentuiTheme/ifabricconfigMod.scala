package typings.fluentuiTheme

import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifabricconfigMod {
  
  @js.native
  trait IFabricConfig extends StObject {
    
    /**
      * An override for where the fonts should be downloaded from.
      */
    var fontBaseUrl: js.UndefOr[String] = js.native
    
    /**
      * The mergeStyles stylesheet config.
      */
    var mergeStyles: js.UndefOr[IStyleSheetConfig] = js.native
  }
  object IFabricConfig {
    
    @scala.inline
    def apply(): IFabricConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFabricConfig]
    }
    
    @scala.inline
    implicit class IFabricConfigMutableBuilder[Self <: IFabricConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontBaseUrl(value: String): Self = StObject.set(x, "fontBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontBaseUrlUndefined: Self = StObject.set(x, "fontBaseUrl", js.undefined)
      
      @scala.inline
      def setMergeStyles(value: IStyleSheetConfig): Self = StObject.set(x, "mergeStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeStylesUndefined: Self = StObject.set(x, "mergeStyles", js.undefined)
    }
  }
}
