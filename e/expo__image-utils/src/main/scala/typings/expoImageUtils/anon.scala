package typings.expoImageUtils

import typings.expoImageUtils.buildImageDottypesMod.ResizeMode
import typings.expoImageUtils.buildSharpDottypesMod.Position
import typings.expoImageUtils.expoImageUtilsStrings.cubic
import typings.expoImageUtils.expoImageUtilsStrings.lanczos2
import typings.expoImageUtils.expoImageUtilsStrings.lanczos3
import typings.expoImageUtils.expoImageUtilsStrings.mitchell
import typings.expoImageUtils.expoImageUtilsStrings.nearest
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Background extends StObject {
    
    var background: Buffer
    
    var foreground: Buffer
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Background {
    
    inline def apply(background: Buffer, foreground: Buffer): Background = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    extension [Self <: Background](x: Self) {
      
      inline def setBackground(value: Buffer): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setForeground(value: Buffer): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait CacheType extends StObject {
    
    var cacheType: js.UndefOr[String] = js.undefined
    
    var projectRoot: String
  }
  object CacheType {
    
    inline def apply(projectRoot: String): CacheType = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheType]
    }
    
    extension [Self <: CacheType](x: Self) {
      
      inline def setCacheType(value: String): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
      
      inline def setCacheTypeUndefined: Self = StObject.set(x, "cacheType", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var source: Buffer
  }
  object Name {
    
    inline def apply(name: String, source: Buffer): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@expo/image-utils.@expo/image-utils/build/sharp.types.ResizeOptions, 'operation'> */
  trait OmitResizeOptionsoperatio extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var fastShrinkOnLoad: js.UndefOr[Boolean] = js.undefined
    
    var fit: js.UndefOr[ResizeMode] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var kernel: js.UndefOr[nearest | cubic | mitchell | lanczos2 | lanczos3] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var width: Double
    
    var withoutEnlargement: js.UndefOr[Boolean] = js.undefined
  }
  object OmitResizeOptionsoperatio {
    
    inline def apply(width: Double): OmitResizeOptionsoperatio = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitResizeOptionsoperatio]
    }
    
    extension [Self <: OmitResizeOptionsoperatio](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setFastShrinkOnLoad(value: Boolean): Self = StObject.set(x, "fastShrinkOnLoad", value.asInstanceOf[js.Any])
      
      inline def setFastShrinkOnLoadUndefined: Self = StObject.set(x, "fastShrinkOnLoad", js.undefined)
      
      inline def setFit(value: ResizeMode): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKernel(value: nearest | cubic | mitchell | lanczos2 | lanczos3): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWithoutEnlargement(value: Boolean): Self = StObject.set(x, "withoutEnlargement", value.asInstanceOf[js.Any])
      
      inline def setWithoutEnlargementUndefined: Self = StObject.set(x, "withoutEnlargement", js.undefined)
    }
  }
}
