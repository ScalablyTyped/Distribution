package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveComponent
  extends StObject
     with Component {
  
  /**
    * Calculates a movement value based on the passed offset and currently active index.
    */
  def make(): Unit = js.native
  def make(offset: Double): Unit = js.native
  
  @JSName("mount")
  def mount_MMoveComponent(): Unit = js.native
  
  /**
    * Holds an offset value used to modify current translate value.
    */
  var offset: Double = js.native
  
  /**
    * Holds a raw movement value calculated based on the current index.
    */
  val translate: Double = js.native
  
  /**
    * Holds an actual movement value corrected by an offset.
    */
  val value: Double = js.native
}
