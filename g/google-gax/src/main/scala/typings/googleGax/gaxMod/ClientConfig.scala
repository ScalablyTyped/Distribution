package typings.googleGax.gaxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var interfaces: js.UndefOr[StringDictionary[ServiceConfig]] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(interfaces: StringDictionary[ServiceConfig] = null): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

