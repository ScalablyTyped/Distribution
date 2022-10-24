package typings.egjsAxes

import typings.egjsAxes.anon.AxisManager
import typings.egjsAxes.anon.DestPos
import typings.egjsAxes.declarationAxesMod.AxesOption
import typings.egjsAxes.declarationAxisManagerMod.Axis
import typings.egjsAxes.declarationEventManagerMod.ChangeEventOption
import typings.egjsAxes.declarationEventManagerMod.EventManager
import typings.egjsAxes.declarationInterruptManagerMod.InterruptManager
import typings.egjsAxes.declarationTypesMod.AnimationParam
import typings.egjsAxes.declarationTypesMod.UpdateAnimationOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationAnimationAnimationManagerMod {
  
  /* note: abstract class */ @JSImport("@egjs/axes/declaration/animation/AnimationManager", "AnimationManager")
  @js.native
  open class AnimationManager protected () extends StObject {
    def this(param0: AxisManager) = this()
    
    /* private */ var _animateLoop: Any = js.native
    
    /* protected */ var _animateParam: AnimationParam = js.native
    
    /* private */ var _createAnimationParam: Any = js.native
    
    /* private */ var _getFinalPos: Any = js.native
    
    /* protected */ def _getNextState(prevState: AnimationState): AnimationState = js.native
    
    /* private */ var _getRoundUnit: Any = js.native
    
    /* protected */ def _initState(info: AnimationParam): AnimationState = js.native
    
    /* protected */ var _options: AxesOption = js.native
    
    /* private */ var _raf: Any = js.native
    
    def animateTo(destPos: Axis, duration: Double): Unit = js.native
    def animateTo(destPos: Axis, duration: Double, option: ChangeEventOption): Unit = js.native
    
    def animationEnd(): Unit = js.native
    
    var axisManager: typings.egjsAxes.declarationAxisManagerMod.AxisManager = js.native
    
    var eventManager: EventManager = js.native
    
    def finish(isTrusted: Boolean): Unit = js.native
    
    def getDisplacement(velocity: js.Array[Double]): js.Array[Double] = js.native
    
    def getDuration(depaPos: Axis, destPos: Axis): Double = js.native
    def getDuration(depaPos: Axis, destPos: Axis, wishDuration: Double): Double = js.native
    
    def getEventInfo(): ChangeEventOption = js.native
    
    def getUserControl(param: AnimationParam): DestPos = js.native
    
    def interpolate(displacement: Double, threshold: Double): Double = js.native
    
    var interruptManager: InterruptManager = js.native
    
    def restore(option: ChangeEventOption): Unit = js.native
    
    def setBy(pos: Axis): this.type = js.native
    def setBy(pos: Axis, duration: Double): this.type = js.native
    
    def setTo(pos: Axis): this.type = js.native
    def setTo(pos: Axis, duration: Double): this.type = js.native
    
    def stopAnimation(): Unit = js.native
    def stopAnimation(option: ChangeEventOption): Unit = js.native
    
    def updateAnimation(options: UpdateAnimationOption): Unit = js.native
  }
  
  trait AnimationState extends StObject {
    
    var easingPer: Double
    
    var finished: Boolean
    
    var pos: Axis
  }
  object AnimationState {
    
    inline def apply(easingPer: Double, finished: Boolean, pos: Axis): AnimationState = {
      val __obj = js.Dynamic.literal(easingPer = easingPer.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationState]
    }
    
    extension [Self <: AnimationState](x: Self) {
      
      inline def setEasingPer(value: Double): Self = StObject.set(x, "easingPer", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Axis): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
