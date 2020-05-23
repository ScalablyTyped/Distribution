package typings.eggView.mod

import typings.eggView.anon.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppConfig extends js.Object {
  var view: Cache
}

object EggAppConfig {
  @scala.inline
  def apply(view: Cache): EggAppConfig = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
}

