package typings.egjsAxes

import typings.egjsAxes.declarationAxesMod.AxesOption
import typings.egjsAxes.declarationAxisManagerMod.Axis
import typings.egjsAxes.declarationEventManagerMod.EventManager
import typings.egjsAxes.declarationInterruptManagerMod.InterruptManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnimationManager extends StObject {
    
    var animationManager: typings.egjsAxes.declarationAnimationAnimationManagerMod.AnimationManager
    
    var axisManager: typings.egjsAxes.declarationAxisManagerMod.AxisManager
    
    var eventManager: EventManager
    
    var interruptManager: InterruptManager
    
    var options: AxesOption
  }
  object AnimationManager {
    
    inline def apply(
      animationManager: typings.egjsAxes.declarationAnimationAnimationManagerMod.AnimationManager,
      axisManager: typings.egjsAxes.declarationAxisManagerMod.AxisManager,
      eventManager: EventManager,
      interruptManager: InterruptManager,
      options: AxesOption
    ): AnimationManager = {
      val __obj = js.Dynamic.literal(animationManager = animationManager.asInstanceOf[js.Any], axisManager = axisManager.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], interruptManager = interruptManager.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationManager] (val x: Self) extends AnyVal {
      
      inline def setAnimationManager(value: typings.egjsAxes.declarationAnimationAnimationManagerMod.AnimationManager): Self = StObject.set(x, "animationManager", value.asInstanceOf[js.Any])
      
      inline def setAxisManager(value: typings.egjsAxes.declarationAxisManagerMod.AxisManager): Self = StObject.set(x, "axisManager", value.asInstanceOf[js.Any])
      
      inline def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
      
      inline def setInterruptManager(value: InterruptManager): Self = StObject.set(x, "interruptManager", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AxesOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait AxisManager extends StObject {
    
    var axisManager: typings.egjsAxes.declarationAxisManagerMod.AxisManager
    
    var eventManager: EventManager
    
    var interruptManager: InterruptManager
    
    var options: AxesOption
  }
  object AxisManager {
    
    inline def apply(
      axisManager: typings.egjsAxes.declarationAxisManagerMod.AxisManager,
      eventManager: EventManager,
      interruptManager: InterruptManager,
      options: AxesOption
    ): AxisManager = {
      val __obj = js.Dynamic.literal(axisManager = axisManager.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], interruptManager = interruptManager.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxisManager] (val x: Self) extends AnyVal {
      
      inline def setAxisManager(value: typings.egjsAxes.declarationAxisManagerMod.AxisManager): Self = StObject.set(x, "axisManager", value.asInstanceOf[js.Any])
      
      inline def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
      
      inline def setInterruptManager(value: InterruptManager): Self = StObject.set(x, "interruptManager", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AxesOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait DestPos extends StObject {
    
    var destPos: Axis
    
    var duration: Double
  }
  object DestPos {
    
    inline def apply(destPos: Axis, duration: Double): DestPos = {
      val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestPos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestPos] (val x: Self) extends AnyVal {
      
      inline def setDestPos(value: Axis): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
  
  trait Passive extends StObject {
    
    var passive: Boolean
  }
  object Passive {
    
    inline def apply(passive: Boolean): Passive = {
      val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Passive] (val x: Self) extends AnyVal {
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
