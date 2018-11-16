package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Broadcast[Theme] extends js.Object {
  def publish(nextState: Theme): scala.Unit
  def subscribe(listener: BroadcastListener[Theme]): scala.Double
  def unsubscribe(unsubID: scala.Double): scala.Unit
}

