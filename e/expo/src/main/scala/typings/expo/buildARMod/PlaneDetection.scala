package typings.expo.buildARMod

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
  
  /* "horizontal" */ val Horizontal: typings.expo.buildARMod.PlaneDetection.Horizontal with String = js.native
  /* "none" */ val None: typings.expo.buildARMod.PlaneDetection.None with String = js.native
  /* "vertical" */ val Vertical: typings.expo.buildARMod.PlaneDetection.Vertical with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaneDetection with String] = js.native
}

