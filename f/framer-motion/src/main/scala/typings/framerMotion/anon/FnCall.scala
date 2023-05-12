package typings.framerMotion.anon

import typings.framerMotion.distDomEntryMod.AnimationPlaybackControls
import typings.framerMotion.distDomEntryMod.AnimationSequence
import typings.framerMotion.distDomEntryMod.DOMKeyframesDefinition
import typings.framerMotion.distDomEntryMod.DynamicAnimationOptions
import typings.framerMotion.distDomEntryMod.ElementOrSelector
import typings.framerMotion.distDomEntryMod.GenericKeyframesTarget
import typings.framerMotion.distDomEntryMod.MotionValue_
import typings.framerMotion.distDomEntryMod.SequenceOptions
import typings.framerMotion.distDomEntryMod.ValueAnimationTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
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
