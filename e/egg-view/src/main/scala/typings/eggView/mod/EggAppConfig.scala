package typings.eggView.mod

import typings.eggView.AnonCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppConfig extends js.Object {
  var view: AnonCache
}

object EggAppConfig {
  @scala.inline
  def apply(view: AnonCache): EggAppConfig = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
}

