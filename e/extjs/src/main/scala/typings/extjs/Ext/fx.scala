package typings.extjs.Ext

import typings.extjs.Ext.fx.target.ITarget
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fx {
  
  @js.native
  trait CubicBezier extends StObject
  
  @js.native
  trait Easing extends StObject
  
  @js.native
  trait IAnim extends IObservable {
    
    /** [Config Option] (Boolean) */
    var alternate: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Function) */
    var callback: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Number) */
    var currentIteration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var delay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var duration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Fire afteranimate event and end the animation  */
    var end: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Object) */
    var from: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var isAnimation: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var iterations: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Object) */
    var keyframes: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var paused: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var reverse: js.UndefOr[Boolean] = js.native
    
    /** [Property] (Boolean) */
    var running: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Function) */
    var scope: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Date) */
    var startTime: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String/Object) */
    var target: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object) */
    var to: js.UndefOr[js.Any] = js.native
  }
  object IAnim {
    
    @scala.inline
    def apply(): IAnim = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnim]
    }
    
    @scala.inline
    implicit class IAnimMutableBuilder[Self <: IAnim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternate(value: Boolean): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
      
      @scala.inline
      def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      @scala.inline
      def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setIsAnimation(value: Boolean): Self = StObject.set(x, "isAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnimationUndefined: Self = StObject.set(x, "isAnimation", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setKeyframes(value: js.Any): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setStartTime(value: js.Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait IAnimator extends IObservable {
    
    /** [Property] (Number) */
    var currentIteration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var delay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var duration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Fire afteranimate event and end the animation  */
    var end: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (Boolean) */
    var isAnimator: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var iterations: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var keyframeStep: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Object) */
    var keyframes: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var paused: js.UndefOr[Boolean] = js.native
    
    /** [Property] (Boolean) */
    var running: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Ext.fx.target.Target) */
    var target: js.UndefOr[ITarget] = js.native
  }
  object IAnimator {
    
    @scala.inline
    def apply(): IAnimator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnimator]
    }
    
    @scala.inline
    implicit class IAnimatorMutableBuilder[Self <: IAnimator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      @scala.inline
      def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setIsAnimator(value: Boolean): Self = StObject.set(x, "isAnimator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnimatorUndefined: Self = StObject.set(x, "isAnimator", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setKeyframeStep(value: Double): Self = StObject.set(x, "keyframeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframeStepUndefined: Self = StObject.set(x, "keyframeStep", js.undefined)
      
      @scala.inline
      def setKeyframes(value: js.Any): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      @scala.inline
      def setTarget(value: ITarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type ICubicBezier = IBase
  
  @js.native
  trait IEasing extends StObject
  
  @js.native
  trait IManager extends IBase
  object IManager {
    
    @scala.inline
    def apply(): IManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IManager]
    }
  }
  
  type IPropertyHandler = IBase
  
  type IQueue = IBase
  
  @js.native
  trait Manager extends StObject
  
  object target {
    
    type IComponent = ITarget
    
    @js.native
    trait ICompositeElement extends IBase {
      
      /** [Property] (Boolean) */
      var isComposite: js.UndefOr[Boolean] = js.native
    }
    object ICompositeElement {
      
      @scala.inline
      def apply(): typings.extjs.Ext.fx.target.ICompositeElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.extjs.Ext.fx.target.ICompositeElement]
      }
      
      @scala.inline
      implicit class ICompositeElementMutableBuilder[Self <: typings.extjs.Ext.fx.target.ICompositeElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsComposite(value: Boolean): Self = StObject.set(x, "isComposite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCompositeUndefined: Self = StObject.set(x, "isComposite", js.undefined)
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
