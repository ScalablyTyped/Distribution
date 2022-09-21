package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  /**
    * Add an animation Step.
    *
    * @param to keys are channel numbers, values the values to set that channel to
    * @param duration duration in ms
    */
  def add(to: ChannelMap, duration: Double): this.type = js.native
  def add(to: ChannelMap, duration: Double, options: AnimationStepOptions): this.type = js.native
  
  /**
    * Delay the next animation step for duration.
    *
    * @param duration duration in ms
    */
  def delay(duration: Double): this.type = js.native
  
  /**
    * Run the Animation on the specified universe.
    *
    * @param universe reference to the universe driver
    * @param onFinish called when the animation is done
    */
  def run(universe: Universe): Unit = js.native
  def run(universe: Universe, onFinish: js.Function0[Unit]): Unit = js.native
  
  /**
    * Runs an animation constantly until `animation.stop()` is called.
    *
    * @param universe reference to the universe driver
    * @param onFinish called when the animation is done
    * @param loops max number of times this animation sequence will loop
    *
    * @example
    * // The example below shows a value being animated for 5 seconds.
    * const animation = new DMX.Animation()
    *   .add({ 1: 255 }, 100)
    *   .add({ 1: 0 }, 100)
    *   .runLoop(universe);
    *
    * setTimeout(() => {
    *   animation.stop()
    * }, 5000)
    */
  def runLoop(universe: Universe): this.type = js.native
  def runLoop(universe: Universe, onFinish: js.Function0[Unit]): this.type = js.native
  def runLoop(universe: Universe, onFinish: js.Function0[Unit], /** @default Infinity */
  loops: Double): this.type = js.native
  def runLoop(universe: Universe, onFinish: Unit, /** @default Infinity */
  loops: Double): this.type = js.native
  
  /**
    * Stop a running animation.
    */
  def stop(): Unit = js.native
}
object Animation {
  
  /* static member */
  inline def apply: AnimationStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("Animation").asInstanceOf[AnimationStatic]
}
