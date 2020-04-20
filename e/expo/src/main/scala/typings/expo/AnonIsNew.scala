package typings.expo

import typings.expo.expoBooleans.`false`
import typings.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsNew extends UpdateFetchResult {
  var isNew: `false`
}

object AnonIsNew {
  @scala.inline
  def apply(isNew: `false`): AnonIsNew = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsNew]
  }
}

