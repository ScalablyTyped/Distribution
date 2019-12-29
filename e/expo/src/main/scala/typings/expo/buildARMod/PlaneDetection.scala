package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaneDetection extends js.Object

@JSImport("expo/build/AR", "PlaneDetection")
@js.native
object PlaneDetection extends js.Object {
  /**
    * Plane detection determines horizontal planes in the scene
    */
  @js.native
  sealed trait Horizontal extends PlaneDetection
  
  /**
    * No plane detection is run
    */
  @js.native
  sealed trait None extends PlaneDetection
  
  /**
    * Plane detection determines vertical planes in the scene
    */
  @js.native
  sealed trait Vertical extends PlaneDetection
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaneDetection with String] = js.native
  /* "horizontal" */ @js.native
  object Horizontal extends TopLevel[Horizontal with String]
  
  /* "none" */ @js.native
  object None extends TopLevel[None with String]
  
  /* "vertical" */ @js.native
  object Vertical extends TopLevel[Vertical with String]
  
}

