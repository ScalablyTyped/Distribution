package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnchorType extends js.Object

@JSImport("expo/build/AR", "AnchorType")
@js.native
object AnchorType extends js.Object {
  @js.native
  sealed trait Anchor extends AnchorType
  
  @js.native
  sealed trait Face extends AnchorType
  
  @js.native
  sealed trait Image extends AnchorType
  
  @js.native
  sealed trait Plane extends AnchorType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnchorType with String] = js.native
  /* "ARAnchor" */ @js.native
  object Anchor
    extends TopLevel[typings.expo.buildARMod.AnchorType.Anchor with String]
  
  /* "ARFaceAnchor" */ @js.native
  object Face extends TopLevel[Face with String]
  
  /* "ARImageAnchor" */ @js.native
  object Image extends TopLevel[Image with String]
  
  /* "ARPlaneAnchor" */ @js.native
  object Plane extends TopLevel[Plane with String]
  
}

