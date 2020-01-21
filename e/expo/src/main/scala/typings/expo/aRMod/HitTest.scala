package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTest extends js.Object {
  var anchor: Anchor
  var distance: Double
  var localTransform: js.Array[Double]
  var `type`: Double
  var worldTransform: js.Array[Double]
}

object HitTest {
  @scala.inline
  def apply(
    anchor: Anchor,
    distance: Double,
    localTransform: js.Array[Double],
    `type`: Double,
    worldTransform: js.Array[Double]
  ): HitTest = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], localTransform = localTransform.asInstanceOf[js.Any], worldTransform = worldTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTest]
  }
}

