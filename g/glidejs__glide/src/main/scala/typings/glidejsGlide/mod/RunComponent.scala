package typings.glidejsGlide.mod

import typings.glidejsGlide.glidejsGlideStrings.VerticallineGreaterthansign
import typings.glidejsGlide.glidejsGlideStrings.VerticallineLessthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunComponent
  extends StObject
     with Component {
  
  /**
    * Calculates current index based on the defined move.
    */
  def calculate(): Unit = js.native
  
  /**
    * Checks if we currently are on the last slide.
    */
  def isEnd(): Boolean = js.native
  
  /**
    * Checks if we are making an offset run, from last to first or first to last slide.
    */
  def isOffset(): Boolean = js.native
  def isOffset(direction: VerticallineGreaterthansign | VerticallineLessthansign): Boolean = js.native
  def isOffset(direction: direction): Boolean = js.native
  
  /**
    * Checks if we currently are on the first slide.
    */
  def isStart(): Boolean = js.native
  
  /**
    * Holds a zero-based value of the running distance.
    */
  val length: Double = js.native
  
  /**
    * Makes instance run based on the passed moving schema.
    */
  def make(move: String): Unit = js.native
  
  @JSName("mount")
  def mount_MRunComponent(): Unit = js.native
  
  /**
    * Holds value of the current movement.
    *
    * For example, =1 schema will be represented as:
    * ```
    * {
    *   direction: '=',
    *   steps: '1'
    * }
    * ```
    * @todo setter type is `string`. ts(2380)
    */
  val move: RunCurrentMovementContext = js.native
  
  /**
    * Holds an indication flag about making rewinding movement.
    */
  val offset: Double = js.native
}
