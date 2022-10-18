package typings.devexpressUtils

import typings.devexpressUtils.devexpressUtilsStrings.`100`
import typings.devexpressUtils.devexpressUtilsStrings.`200`
import typings.devexpressUtils.devexpressUtilsStrings.`300`
import typings.devexpressUtils.devexpressUtilsStrings.`400`
import typings.devexpressUtils.devexpressUtilsStrings.`500`
import typings.devexpressUtils.devexpressUtilsStrings.`600`
import typings.devexpressUtils.devexpressUtilsStrings.`700`
import typings.devexpressUtils.devexpressUtilsStrings.`800`
import typings.devexpressUtils.devexpressUtilsStrings.`900`
import typings.devexpressUtils.devexpressUtilsStrings.bold
import typings.devexpressUtils.devexpressUtilsStrings.error
import typings.devexpressUtils.devexpressUtilsStrings.italic
import typings.devexpressUtils.devexpressUtilsStrings.loaded
import typings.devexpressUtils.devexpressUtilsStrings.loading
import typings.devexpressUtils.devexpressUtilsStrings.normal
import typings.devexpressUtils.devexpressUtilsStrings.unloaded
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsFontsMod {
  
  @JSImport("@devexpress/utils/lib/utils/fonts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFontToDocument(loadedFace: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFontToDocument")(loadedFace.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def afterFontsLoaded(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFontsLoaded")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkFont(fontFamily: IFontFace): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFont")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def checkFont(fontFamily: IFontFace, text: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFont")(fontFamily.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fontWebApiAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fontWebApiAvailable")().asInstanceOf[Boolean]
  
  inline def loadFont(
    fontFamily: String,
    source: String,
    fontFaceDescriptors: IFontFaceDescriptors,
    callback: js.Function1[/* error */ String | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(fontFamily.asInstanceOf[js.Any], source.asInstanceOf[js.Any], fontFaceDescriptors.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadFont(
    fontFamily: String,
    source: js.typedarray.ArrayBuffer,
    fontFaceDescriptors: IFontFaceDescriptors,
    callback: js.Function1[/* error */ String | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(fontFamily.asInstanceOf[js.Any], source.asInstanceOf[js.Any], fontFaceDescriptors.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IFontFace
    extends StObject
       with IFontFaceDescriptors {
    
    var family: String
    
    val status: unloaded | loading | loaded | error
  }
  object IFontFace {
    
    inline def apply(family: String, status: unloaded | loading | loaded | error): IFontFace = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFontFace]
    }
    
    extension [Self <: IFontFace](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: unloaded | loading | loaded | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFontFaceDescriptors extends StObject {
    
    var display: js.UndefOr[String] = js.undefined
    
    var featureSettings: js.UndefOr[String] = js.undefined
    
    var stretch: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[normal | italic | String] = js.undefined
    
    var unicodeRange: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
    
    var variationSettings: js.UndefOr[String] = js.undefined
    
    var weight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | String | Double
      ] = js.undefined
  }
  object IFontFaceDescriptors {
    
    inline def apply(): IFontFaceDescriptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFontFaceDescriptors]
    }
    
    extension [Self <: IFontFaceDescriptors](x: Self) {
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
      
      inline def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
      
      inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setStyle(value: normal | italic | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariationSettings(value: String): Self = StObject.set(x, "variationSettings", value.asInstanceOf[js.Any])
      
      inline def setVariationSettingsUndefined: Self = StObject.set(x, "variationSettings", js.undefined)
      
      inline def setWeight(
        value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | String | Double
      ): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
