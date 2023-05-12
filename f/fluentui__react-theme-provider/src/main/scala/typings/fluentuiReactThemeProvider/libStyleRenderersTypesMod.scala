package typings.fluentuiReactThemeProvider

import typings.std.Window
import typings.uifabricMergeStyles.libIkeyframesMod.IKeyframes
import typings.uifabricMergeStyles.libIrawstylebaseMod.IFontFace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyleRenderersTypesMod {
  
  type FontFace = IFontFace
  
  type KeyFrames = IKeyframes
  
  trait StyleRenderer extends StObject {
    
    /**
      * Returns a unique id for the renderer; used as part of the cache key when determining if new
      * styles need to be rendered.
      */
    def getId(): Double
    
    /**
      * Renders fontfaces.
      */
    def renderFontFace(fontFace: FontFace, options: StyleRendererOptions): Unit
    
    /**
      * Renders keyframes and returns the keyframe name.
      */
    def renderKeyframes(keyframes: KeyFrames, options: StyleRendererOptions): String
    
    /**
      * Renders a stylesheet and returns the map of key to class name.
      */
    def renderStyles[TRuleSet](ruleSet: TRuleSet, options: StyleRendererOptions): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TRuleSet ]: string} */ js.Any
    
    /**
      * Expected to initialize or re-initialize the renderer. Primarily for testing purposes.
      */
    def reset(): Unit
  }
  object StyleRenderer {
    
    inline def apply(
      getId: () => Double,
      renderFontFace: (FontFace, StyleRendererOptions) => Unit,
      renderKeyframes: (KeyFrames, StyleRendererOptions) => String,
      renderStyles: (Any, StyleRendererOptions) => /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TRuleSet ]: string} */ js.Any,
      reset: () => Unit
    ): StyleRenderer = {
      val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), renderFontFace = js.Any.fromFunction2(renderFontFace), renderKeyframes = js.Any.fromFunction2(renderKeyframes), renderStyles = js.Any.fromFunction2(renderStyles), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[StyleRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleRenderer] (val x: Self) extends AnyVal {
      
      inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setRenderFontFace(value: (FontFace, StyleRendererOptions) => Unit): Self = StObject.set(x, "renderFontFace", js.Any.fromFunction2(value))
      
      inline def setRenderKeyframes(value: (KeyFrames, StyleRendererOptions) => String): Self = StObject.set(x, "renderKeyframes", js.Any.fromFunction2(value))
      
      inline def setRenderStyles(
        value: (Any, StyleRendererOptions) => /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TRuleSet ]: string} */ js.Any
      ): Self = StObject.set(x, "renderStyles", js.Any.fromFunction2(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait StyleRendererOptions extends StObject {
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var targetWindow: js.UndefOr[Window] = js.undefined
  }
  object StyleRendererOptions {
    
    inline def apply(): StyleRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleRendererOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleRendererOptions] (val x: Self) extends AnyVal {
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      inline def setTargetWindowUndefined: Self = StObject.set(x, "targetWindow", js.undefined)
    }
  }
}
