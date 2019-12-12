package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
import typings.expo.buildARMod.TrackingConfiguration.Face
import typings.expo.buildARMod.TrackingConfiguration.Orientation
import typings.expo.buildARMod.TrackingConfiguration.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackingConfiguration extends js.Object

@JSImport("expo/build/AR", "TrackingConfiguration")
@js.native
object TrackingConfiguration extends js.Object {
  /**
    * Provides AR experiences that use the front-facing camera and track the movement and expressions
    * of the user's face.
    */
  @js.native
  sealed trait Face extends TrackingConfiguration
  
  /**
    * Provides basic AR experiences that use the rear-facing camera and track only a device's
    * orientation.
    */
  @js.native
  sealed trait Orientation extends TrackingConfiguration
  
  /**
    * Provides high-quality AR experiences that use the rear-facing camera precisely track a device's
    * position and orientation and allow plane detection and hit testing.
    */
  @js.native
  sealed trait World extends TrackingConfiguration
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackingConfiguration with String] = js.native
  /* "ARFaceTrackingConfiguration" */ @js.native
  object Face extends TopLevel[Face with String]
  
  /* "AROrientationTrackingConfiguration" */ @js.native
  object Orientation extends TopLevel[Orientation with String]
  
  /* "ARWorldTrackingConfiguration" */ @js.native
  object World extends TopLevel[World with String]
  
}

