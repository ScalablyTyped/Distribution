package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationState extends StObject {
  
  def animateChanges(): js.Promise[Any] = js.native
  def animateChanges(options: Unit, `type`: AnimationType): js.Promise[Any] = js.native
  def animateChanges(options: VisualElementAnimationOptions): js.Promise[Any] = js.native
  def animateChanges(options: VisualElementAnimationOptions, `type`: AnimationType): js.Promise[Any] = js.native
  
  def getState(): StringDictionary[AnimationTypeState] = js.native
  
  def setActive(`type`: AnimationType, isActive: Boolean): js.Promise[Any] = js.native
  def setActive(`type`: AnimationType, isActive: Boolean, options: VisualElementAnimationOptions): js.Promise[Any] = js.native
  
  def setAnimateFunction(fn: Any): Unit = js.native
}
