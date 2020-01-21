package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aRMod {
  type Anchor = typings.expo.aRMod.BaseAnchor | typings.expo.aRMod.PlaneAnchor | typings.expo.aRMod.ImageAnchor | typings.expo.aRMod.FaceAnchor
  type FaceAnchor = typings.expo.aRMod.BaseAnchor with typings.expo.AnonBlendShapes
  type FrameDidUpdateEvent = js.Object
  type ImageAnchor = typings.expo.aRMod.BaseAnchor with typings.expo.AnonImage
  type Matrix = js.Array[scala.Double]
  type PlaneAnchor = typings.expo.aRMod.BaseAnchor with typings.expo.AnonCenter
  type ReactNativeNodeHandle = scala.Double
  type SessionInterruptionEndedEvent = js.Object
  type SessionWasInterruptedEvent = js.Object
}
