package typings.expo.buildScreenOrientationScreenOrientationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientationChangeEvent extends js.Object {
  var orientationInfo: OrientationInfo
  var orientationLock: OrientationLock
}

object OrientationChangeEvent {
  @scala.inline
  def apply(orientationInfo: OrientationInfo, orientationLock: OrientationLock): OrientationChangeEvent = {
    val __obj = js.Dynamic.literal(orientationInfo = orientationInfo, orientationLock = orientationLock)
  
    __obj.asInstanceOf[OrientationChangeEvent]
  }
}

