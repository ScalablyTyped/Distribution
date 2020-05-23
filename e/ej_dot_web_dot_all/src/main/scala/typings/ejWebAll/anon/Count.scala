package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var result: js.Any
}

object Count {
  @scala.inline
  def apply(count: Double, result: js.Any): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

