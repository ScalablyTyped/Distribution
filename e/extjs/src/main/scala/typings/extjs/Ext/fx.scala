package typings.extjs.Ext

import typings.extjs.Ext.fx.target.ITarget
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fx {
  
  trait CubicBezier extends StObject
  
  trait Easing extends StObject
  
  trait IAnim
    extends StObject
       with IObservable {
    
    /** [Config Option] (Boolean) */
    var alternate: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Function) */
    var callback: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Number) */
    var currentIteration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Fire afteranimate event and end the animation  */
    var end: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var from: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Boolean) */
    var isAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var iterations: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var keyframes: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Boolean) */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var running: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Function) */
    var scope: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Date) */
    var startTime: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String/Object) */
    var target: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var to: js.UndefOr[Any] = js.undefined
  }
  object IAnim {
    
    inline def apply(): IAnim = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnim] (val x: Self) extends AnyVal {
      
      inline def setAlternate(value: Boolean): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
      
      inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
      
      inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
      
      inline def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setIsAnimation(value: Boolean): Self = StObject.set(x, "isAnimation", value.asInstanceOf[js.Any])
      
      inline def setIsAnimationUndefined: Self = StObject.set(x, "isAnimation", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setKeyframes(value: Any): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait IAnimator
    extends StObject
       with IObservable {
    
    /** [Property] (Number) */
    var currentIteration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Fire afteranimate event and end the animation  */
    var end: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var isAnimator: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var iterations: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var keyframeStep: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var keyframes: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Boolean) */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var running: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.fx.target.Target) */
    var target: js.UndefOr[ITarget] = js.undefined
  }
  object IAnimator {
    
    inline def apply(): IAnimator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnimator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnimator] (val x: Self) extends AnyVal {
      
      inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
      
      inline def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setIsAnimator(value: Boolean): Self = StObject.set(x, "isAnimator", value.asInstanceOf[js.Any])
      
      inline def setIsAnimatorUndefined: Self = StObject.set(x, "isAnimator", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setKeyframeStep(value: Double): Self = StObject.set(x, "keyframeStep", value.asInstanceOf[js.Any])
      
      inline def setKeyframeStepUndefined: Self = StObject.set(x, "keyframeStep", js.undefined)
      
      inline def setKeyframes(value: Any): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      inline def setTarget(value: ITarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type ICubicBezier = IBase
  
  trait IEasing extends StObject
  
  trait IManager
    extends StObject
       with IBase
  object IManager {
    
    inline def apply(): IManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IManager]
    }
  }
  
  type IPropertyHandler = IBase
  
  type IQueue = IBase
  
  trait Manager extends StObject
  
  object target {
    
    type IComponent = ITarget
    
    trait ICompositeElement
      extends StObject
         with IBase {
      
      /** [Property] (Boolean) */
      var isComposite: js.UndefOr[Boolean] = js.undefined
    }
    object ICompositeElement {
      
      inline def apply(): typings.extjs.Ext.fx.target.ICompositeElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.extjs.Ext.fx.target.ICompositeElement]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.extjs.Ext.fx.target.ICompositeElement] (val x: Self) extends AnyVal {
        
        inline def setIsComposite(value: Boolean): Self = StObject.set(x, "isComposite", value.asInstanceOf[js.Any])
        
        inline def setIsCompositeUndefined: Self = StObject.set(x, "isComposite", js.undefined)
      }
    }
    
    type ICompositeElementCSS = typings.extjs.Ext.fx.target.ICompositeElement
    
    type ICompositeSprite = ISprite
    
    type IElement = ITarget
    
    type IElementCSS = typings.extjs.Ext.fx.target.IElement
    
    type ISprite = ITarget
    
    type ITarget = IBase
  }
}
