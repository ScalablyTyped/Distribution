package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait calendarsSettings extends js.Object {
  var standard: standardSettings
}

object calendarsSettings {
  @scala.inline
  def apply(standard: standardSettings): calendarsSettings = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[calendarsSettings]
  }
}

