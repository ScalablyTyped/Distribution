package typings.atFluentReact.atFluentReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactLocalizationNotification extends js.Object {
  def relocalize(): Unit
}

object ReactLocalizationNotification {
  @scala.inline
  def apply(relocalize: () => Unit): ReactLocalizationNotification = {
    val __obj = js.Dynamic.literal(relocalize = js.Any.fromFunction0(relocalize))
  
    __obj.asInstanceOf[ReactLocalizationNotification]
  }
}

