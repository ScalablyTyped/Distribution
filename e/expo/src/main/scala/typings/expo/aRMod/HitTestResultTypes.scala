package typings.expo.aRMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HitTestResultTypes extends js.Object

@JSImport("expo/build/AR", "HitTestResultTypes")
@js.native
object HitTestResultTypes extends js.Object {
  /**
    * Result type from intersecting with an existing plane anchor.
    */
  @js.native
  sealed trait ExistingPlane extends HitTestResultTypes
  
  /**
    * Result type from intersecting with an existing plane anchor, taking into account the plane’s
    * extent.
    */
  @js.native
  sealed trait ExistingPlaneUsingExtent extends HitTestResultTypes
  
  /**
    * Result type from intersecting with an existing plane anchor, taking into account the plane’s
    * geometry.
    */
  @js.native
  sealed trait ExistingPlaneUsingGeometry extends HitTestResultTypes
  
  /**
    * Result type from intersecting the nearest feature point.
    */
  @js.native
  sealed trait FeaturePoint extends HitTestResultTypes
  
  /**
    * Result type from intersecting a horizontal plane estimate, determined for the current frame.
    */
  @js.native
  sealed trait HorizontalPlane extends HitTestResultTypes
  
  /**
    * Result type from intersecting a vertical plane estimate, determined for the current frame.
    */
  @js.native
  sealed trait VerticalPlane extends HitTestResultTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HitTestResultTypes with String] = js.native
  /* "existingPlane" */ @js.native
  object ExistingPlane extends TopLevel[ExistingPlane with String]
  
  /* "existingPlaneUsingExtent" */ @js.native
  object ExistingPlaneUsingExtent extends TopLevel[ExistingPlaneUsingExtent with String]
  
  /* "existingPlaneUsingGeometry" */ @js.native
  object ExistingPlaneUsingGeometry extends TopLevel[ExistingPlaneUsingGeometry with String]
  
  /* "featurePoint" */ @js.native
  object FeaturePoint extends TopLevel[FeaturePoint with String]
  
  /* "horizontalPlane" */ @js.native
  object HorizontalPlane extends TopLevel[HorizontalPlane with String]
  
  /* "verticalPlane" */ @js.native
  object VerticalPlane extends TopLevel[VerticalPlane with String]
  
}

