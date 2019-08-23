package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorldAlignment extends js.Object

@JSImport("expo/build/AR", "WorldAlignment")
@js.native
object WorldAlignment extends js.Object {
  /**
    * Aligns the world with the camera’s orientation.
    */
  @js.native
  sealed trait AlignmentCamera extends WorldAlignment
  
  /**
    * Aligns the world with gravity that is defined by vector (0, -1, 0).
    */
  @js.native
  sealed trait Gravity extends WorldAlignment
  
  /**
    * Aligns the world with gravity that is defined by the vector (0, -1, 0) and heading (w.r.t. true
    * north) that is given by the vector (0, 0, -1).
    */
  @js.native
  sealed trait GravityAndHeading extends WorldAlignment
  
  /* "alignmentCamera" */ val AlignmentCamera: typings.expo.buildARMod.WorldAlignment.AlignmentCamera with String = js.native
  /* "gravity" */ val Gravity: typings.expo.buildARMod.WorldAlignment.Gravity with String = js.native
  /* "gravityAndHeading" */ val GravityAndHeading: typings.expo.buildARMod.WorldAlignment.GravityAndHeading with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WorldAlignment with String] = js.native
}

