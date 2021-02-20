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
import typings.std.ArrayBuffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontsMod {
  
  @JSImport("@devexpress/utils/lib/utils/fonts", "addFontToDocument")
  @js.native
  def addFontToDocument(loadedFace: Record[String, _]): Unit = js.native
  
  @JSImport("@devexpress/utils/lib/utils/fonts", "afterFontsLoaded")
  @js.native
  def afterFontsLoaded(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@devexpress/utils/lib/utils/fonts", "checkFont")
  @js.native
  def checkFont(fontFamily: IFontFace): Boolean = js.native
  @JSImport("@devexpress/utils/lib/utils/fonts", "checkFont")
  @js.native
  def checkFont(fontFamily: IFontFace, text: String): Boolean = js.native
  
  @JSImport("@devexpress/utils/lib/utils/fonts", "fontWebApiAvailable")
  @js.native
  def fontWebApiAvailable(): Boolean = js.native
  
  @JSImport("@devexpress/utils/lib/utils/fonts", "loadFont")
  @js.native
  def loadFont(
    fontFamily: String,
    source: String,
    fontFaceDescriptors: IFontFaceDescriptors,
    callback: js.Function1[/* error */ String | Null, Unit]
  ): Unit = js.native
  @JSImport("@devexpress/utils/lib/utils/fonts", "loadFont")
  @js.native
  def loadFont(
    fontFamily: String,
    source: ArrayBuffer,
    fontFaceDescriptors: IFontFaceDescriptors,
    callback: js.Function1[/* error */ String | Null, Unit]
  ): Unit = js.native
  
  @js.native
  trait IFontFace extends IFontFaceDescriptors {
    
    var family: String = js.native
    
    val status: unloaded | loading | loaded | error = js.native
  }
  object IFontFace {
    
    @scala.inline
    def apply(family: String, status: unloaded | loading | loaded | error): IFontFace = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFontFace]
    }
    
    @scala.inline
    implicit class IFontFaceMutableBuilder[Self <: IFontFace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: unloaded | loading | loaded | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFontFaceDescriptors extends StObject {
    
    var display: js.UndefOr[String] = js.native
    
    var featureSettings: js.UndefOr[String] = js.native
    
    var stretch: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[normal | italic | String] = js.native
    
    var unicodeRange: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
    
    var variationSettings: js.UndefOr[String] = js.native
    
    var weight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | String | Double
      ] = js.native
  }
  object IFontFaceDescriptors {
    
    @scala.inline
    def apply(): IFontFaceDescriptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFontFaceDescriptors]
    }
    
    @scala.inline
    implicit class IFontFaceDescriptorsMutableBuilder[Self <: IFontFaceDescriptors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
      
      @scala.inline
      def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setStyle(value: normal | italic | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      @scala.inline
      def setVariationSettings(value: String): Self = StObject.set(x, "variationSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariationSettingsUndefined: Self = StObject.set(x, "variationSettings", js.undefined)
      
      @scala.inline
      def setWeight(
        value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | String | Double
      ): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
