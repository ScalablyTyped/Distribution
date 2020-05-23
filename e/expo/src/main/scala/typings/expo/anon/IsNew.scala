package typings.expo.anon

import typings.expo.expoBooleans.`false`
import typings.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNew extends UpdateFetchResult {
  var isNew: `false`
}

object IsNew {
  @scala.inline
  def apply(isNew: `false`): IsNew = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNew]
  }
}

