package typings.framerMotion.anon

import typings.framerMotion.mod.AnimationPlaybackControls
import typings.framerMotion.mod.AnimationSequence
import typings.framerMotion.mod.DOMKeyframesDefinition
import typings.framerMotion.mod.DynamicAnimationOptions
import typings.framerMotion.mod.ElementOrSelector
import typings.framerMotion.mod.GenericKeyframesTarget
import typings.framerMotion.mod.MotionValue_
import typings.framerMotion.mod.SequenceOptions
import typings.framerMotion.mod.ValueAnimationTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFromToOptions extends StObject {
  
  def apply(sequence: AnimationSequence): AnimationPlaybackControls = js.native
  def apply(sequence: AnimationSequence, options: SequenceOptions): AnimationPlaybackControls = js.native
  def apply(value: ElementOrSelector, keyframes: DOMKeyframesDefinition): AnimationPlaybackControls = js.native
  def apply(value: ElementOrSelector, keyframes: DOMKeyframesDefinition, options: DynamicAnimationOptions): AnimationPlaybackControls = js.native
  def apply[V](from: V, to: GenericKeyframesTarget[V] | V): AnimationPlaybackControls = js.native
  def apply[V](from: V, to: GenericKeyframesTarget[V] | V, options: ValueAnimationTransition[V]): AnimationPlaybackControls = js.native
  def apply[V_1](value: MotionValue_[V_1], keyframes: GenericKeyframesTarget[V_1] | V_1): AnimationPlaybackControls = js.native
  def apply[V_1](
    value: MotionValue_[V_1],
    keyframes: GenericKeyframesTarget[V_1] | V_1,
    options: ValueAnimationTransition[V_1]
  ): AnimationPlaybackControls = js.native
}
