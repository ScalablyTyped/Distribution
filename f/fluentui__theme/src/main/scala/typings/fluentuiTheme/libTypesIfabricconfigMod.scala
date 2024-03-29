package typings.fluentuiTheme

import typings.fluentuiMergeStyles.libStylesheetMod.ISerializedStylesheet
import typings.fluentuiMergeStyles.libStylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesIfabricconfigMod {
  
  trait IFabricConfig extends StObject {
    
    /**
      * An override for where the fonts should be downloaded from.
      */
    var fontBaseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The mergeStyles stylesheet config.
      */
    var mergeStyles: js.UndefOr[IStyleSheetConfig] = js.undefined
    
    /**
      * Serialized form of Stylesheet used for rehydration.
      */
    var serializedStylesheet: js.UndefOr[ISerializedStylesheet] = js.undefined
  }
  object IFabricConfig {
    
    inline def apply(): IFabricConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFabricConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFabricConfig] (val x: Self) extends AnyVal {
      
      inline def setFontBaseUrl(value: String): Self = StObject.set(x, "fontBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setFontBaseUrlUndefined: Self = StObject.set(x, "fontBaseUrl", js.undefined)
      
      inline def setMergeStyles(value: IStyleSheetConfig): Self = StObject.set(x, "mergeStyles", value.asInstanceOf[js.Any])
      
      inline def setMergeStylesUndefined: Self = StObject.set(x, "mergeStyles", js.undefined)
      
      inline def setSerializedStylesheet(value: ISerializedStylesheet): Self = StObject.set(x, "serializedStylesheet", value.asInstanceOf[js.Any])
      
      inline def setSerializedStylesheetUndefined: Self = StObject.set(x, "serializedStylesheet", js.undefined)
    }
  }
}
