package typings.expoFont

import typings.expoAsset.mod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontTypesMod {
  
  @js.native
  sealed trait FontDisplay extends StObject
  @JSImport("expo-font/build/Font.types", "FontDisplay")
  @js.native
  object FontDisplay extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FontDisplay with String] = js.native
    
    /**
      * (Default on web) The font display strategy is defined by the user agent or platform.
      * This generally defaults to the text being invisible until the font is loaded.
      * Good for buttons or banners that require a specific treatment.
      */
    @js.native
    sealed trait AUTO extends FontDisplay
    /* "auto" */ val AUTO: typings.expoFont.fontTypesMod.FontDisplay.AUTO with String = js.native
    
    /**
      * The text will be invisible until the font has loaded.
      * If the font fails to load, nothing will appear.
      */
    @js.native
    sealed trait BLOCK extends FontDisplay
    /* "block" */ val BLOCK: typings.expoFont.fontTypesMod.FontDisplay.BLOCK with String = js.native
    
    /**
      * Splits the behavior between `SWAP` and `BLOCK`.
      * There will be a [100ms timeout](https://developers.google.com/web/updates/2016/02/font-display?hl=en) where the text with a custom font is invisible,
      * after that the text will either swap to the styled text or it'll show the unstyled text and continue to load the custom font.
      * This is good for buttons that need a custom font but should also be quickly available to screen-readers.
      */
    @js.native
    sealed trait FALLBACK extends FontDisplay
    /* "fallback" */ val FALLBACK: typings.expoFont.fontTypesMod.FontDisplay.FALLBACK with String = js.native
    
    /**
      * This works almost identically to `FALLBACK`,
      * the only difference is that the browser will decide to load the font based on slow connection speed or critical resource demand.
      */
    @js.native
    sealed trait OPTIONAL extends FontDisplay
    /* "optional" */ val OPTIONAL: typings.expoFont.fontTypesMod.FontDisplay.OPTIONAL with String = js.native
    
    /**
      * Fallback text is rendered immediately with a default font while the desired font is loaded.
      * This is good for making the content appear to load instantly and is usally preferred.
      */
    @js.native
    sealed trait SWAP extends FontDisplay
    /* "swap" */ val SWAP: typings.expoFont.fontTypesMod.FontDisplay.SWAP with String = js.native
  }
  
  @js.native
  trait FontResource extends StObject {
    
    var display: js.UndefOr[FontDisplay] = js.native
    
    var uri: String | Double = js.native
  }
  object FontResource {
    
    @scala.inline
    def apply(uri: String | Double): FontResource = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontResource]
    }
    
    @scala.inline
    implicit class FontResourceMutableBuilder[Self <: FontResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setUri(value: String | Double): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type FontSource = String | Double | Asset | FontResource
  
  /* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
  @js.native
  trait UnloadFontOptions extends StObject {
    
    var display: js.UndefOr[FontDisplay] = js.native
  }
  object UnloadFontOptions {
    
    @scala.inline
    def apply(): UnloadFontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnloadFontOptions]
    }
    
    @scala.inline
    implicit class UnloadFontOptionsMutableBuilder[Self <: UnloadFontOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
}
