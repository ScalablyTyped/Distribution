package typings.expo.buildARMod

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
  
  /* "existingPlane" */ val ExistingPlane: typings.expo.buildARMod.HitTestResultTypes.ExistingPlane with String = js.native
  /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typings.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
  /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typings.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
  /* "featurePoint" */ val FeaturePoint: typings.expo.buildARMod.HitTestResultTypes.FeaturePoint with String = js.native
  /* "horizontalPlane" */ val HorizontalPlane: typings.expo.buildARMod.HitTestResultTypes.HorizontalPlane with String = js.native
  /* "verticalPlane" */ val VerticalPlane: typings.expo.buildARMod.HitTestResultTypes.VerticalPlane with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HitTestResultTypes with String] = js.native
}

