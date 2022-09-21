package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animation {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.devextreme.anon.Opacity
    - typings.devextreme.anon.Scale
    - typings.devextreme.anon.Position
    - typings.devextreme.anon.Left
    - typings.devextreme.anon.Top
  */
  type AnimationState = _AnimationState | String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.css
    - typings.devextreme.devextremeStrings.fade
    - typings.devextreme.devextremeStrings.fadeIn
    - typings.devextreme.devextremeStrings.fadeOut
    - typings.devextreme.devextremeStrings.pop
    - typings.devextreme.devextremeStrings.slide
    - typings.devextreme.devextremeStrings.slideIn
    - typings.devextreme.devextremeStrings.slideOut
  */
  trait AnimationType extends StObject
  object AnimationType {
    
    inline def css: typings.devextreme.devextremeStrings.css = "css".asInstanceOf[typings.devextreme.devextremeStrings.css]
    
    inline def fade: typings.devextreme.devextremeStrings.fade = "fade".asInstanceOf[typings.devextreme.devextremeStrings.fade]
    
    inline def fadeIn: typings.devextreme.devextremeStrings.fadeIn = "fadeIn".asInstanceOf[typings.devextreme.devextremeStrings.fadeIn]
    
    inline def fadeOut: typings.devextreme.devextremeStrings.fadeOut = "fadeOut".asInstanceOf[typings.devextreme.devextremeStrings.fadeOut]
    
    inline def pop: typings.devextreme.devextremeStrings.pop = "pop".asInstanceOf[typings.devextreme.devextremeStrings.pop]
    
    inline def slide: typings.devextreme.devextremeStrings.slide = "slide".asInstanceOf[typings.devextreme.devextremeStrings.slide]
    
    inline def slideIn: typings.devextreme.devextremeStrings.slideIn = "slideIn".asInstanceOf[typings.devextreme.devextremeStrings.slideIn]
    
    inline def slideOut: typings.devextreme.devextremeStrings.slideOut = "slideOut".asInstanceOf[typings.devextreme.devextremeStrings.slideOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.fit
    - typings.devextreme.devextremeStrings.flip
    - typings.devextreme.devextremeStrings.flipfit
    - typings.devextreme.devextremeStrings.none
  */
  trait CollisionResolution extends StObject
  object CollisionResolution {
    
    inline def fit: typings.devextreme.devextremeStrings.fit = "fit".asInstanceOf[typings.devextreme.devextremeStrings.fit]
    
    inline def flip: typings.devextreme.devextremeStrings.flip = "flip".asInstanceOf[typings.devextreme.devextremeStrings.flip]
    
    inline def flipfit: typings.devextreme.devextremeStrings.flipfit = "flipfit".asInstanceOf[typings.devextreme.devextremeStrings.flipfit]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.fit
    - typings.devextreme.devextremeStrings.`fit flip`
    - typings.devextreme.devextremeStrings.`fit flipfit`
    - typings.devextreme.devextremeStrings.`fit none`
    - typings.devextreme.devextremeStrings.flip
    - typings.devextreme.devextremeStrings.`flip fit`
    - typings.devextreme.devextremeStrings.`flip none`
    - typings.devextreme.devextremeStrings.flipfit
    - typings.devextreme.devextremeStrings.`flipfit fit`
    - typings.devextreme.devextremeStrings.`flipfit none`
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.`none fit`
    - typings.devextreme.devextremeStrings.`none flip`
    - typings.devextreme.devextremeStrings.`none flipfit`
  */
  trait CollisionResolutionCombination extends StObject
  object CollisionResolutionCombination {
    
    inline def fit: typings.devextreme.devextremeStrings.fit = "fit".asInstanceOf[typings.devextreme.devextremeStrings.fit]
    
    inline def `fit flip`: typings.devextreme.devextremeStrings.`fit flip` = ("fit flip").asInstanceOf[typings.devextreme.devextremeStrings.`fit flip`]
    
    inline def `fit flipfit`: typings.devextreme.devextremeStrings.`fit flipfit` = ("fit flipfit").asInstanceOf[typings.devextreme.devextremeStrings.`fit flipfit`]
    
    inline def `fit none`: typings.devextreme.devextremeStrings.`fit none` = ("fit none").asInstanceOf[typings.devextreme.devextremeStrings.`fit none`]
    
    inline def flip: typings.devextreme.devextremeStrings.flip = "flip".asInstanceOf[typings.devextreme.devextremeStrings.flip]
    
    inline def `flip fit`: typings.devextreme.devextremeStrings.`flip fit` = ("flip fit").asInstanceOf[typings.devextreme.devextremeStrings.`flip fit`]
    
    inline def `flip none`: typings.devextreme.devextremeStrings.`flip none` = ("flip none").asInstanceOf[typings.devextreme.devextremeStrings.`flip none`]
    
    inline def flipfit: typings.devextreme.devextremeStrings.flipfit = "flipfit".asInstanceOf[typings.devextreme.devextremeStrings.flipfit]
    
    inline def `flipfit fit`: typings.devextreme.devextremeStrings.`flipfit fit` = ("flipfit fit").asInstanceOf[typings.devextreme.devextremeStrings.`flipfit fit`]
    
    inline def `flipfit none`: typings.devextreme.devextremeStrings.`flipfit none` = ("flipfit none").asInstanceOf[typings.devextreme.devextremeStrings.`flipfit none`]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def `none fit`: typings.devextreme.devextremeStrings.`none fit` = ("none fit").asInstanceOf[typings.devextreme.devextremeStrings.`none fit`]
    
    inline def `none flip`: typings.devextreme.devextremeStrings.`none flip` = ("none flip").asInstanceOf[typings.devextreme.devextremeStrings.`none flip`]
    
    inline def `none flipfit`: typings.devextreme.devextremeStrings.`none flipfit` = ("none flipfit").asInstanceOf[typings.devextreme.devextremeStrings.`none flipfit`]
  }
  
  trait _AnimationState extends StObject
  object _AnimationState {
    
    inline def Left(left: Double): typings.devextreme.anon.Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.anon.Left]
    }
    
    inline def Opacity(opacity: Double): typings.devextreme.anon.Opacity = {
      val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.anon.Opacity]
    }
    
    inline def Position(position: PositionConfig): typings.devextreme.anon.Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.anon.Position]
    }
    
    inline def Scale(scale: Double): typings.devextreme.anon.Scale = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.anon.Scale]
    }
    
    inline def Top(top: Double): typings.devextreme.anon.Top = {
      val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.anon.Top]
    }
  }
  
  type animationConfig = AnimationConfig
  
  type positionConfig = PositionConfig
}
