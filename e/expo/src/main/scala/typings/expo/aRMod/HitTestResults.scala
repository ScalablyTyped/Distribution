package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTestResults extends js.Object {
  var hitTest: js.Array[HitTest]
}

object HitTestResults {
  @scala.inline
  def apply(hitTest: js.Array[HitTest]): HitTestResults = {
    val __obj = js.Dynamic.literal(hitTest = hitTest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HitTestResults]
  }
}

