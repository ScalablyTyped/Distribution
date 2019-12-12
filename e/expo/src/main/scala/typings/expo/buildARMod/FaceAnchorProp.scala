package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import typings.expo.buildARMod.FaceAnchorProp.BlendShapes
import typings.expo.buildARMod.FaceAnchorProp.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FaceAnchorProp extends js.Object

@JSImport("expo/build/AR", "FaceAnchorProp")
@js.native
object FaceAnchorProp extends js.Object {
  @js.native
  sealed trait BlendShapes extends FaceAnchorProp
  
  @js.native
  sealed trait Geometry extends FaceAnchorProp
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FaceAnchorProp with String] = js.native
  /* "blendShapes" */ @js.native
  object BlendShapes extends TopLevel[BlendShapes with String]
  
  /* "geometry" */ @js.native
  object Geometry extends TopLevel[Geometry with String]
  
}

