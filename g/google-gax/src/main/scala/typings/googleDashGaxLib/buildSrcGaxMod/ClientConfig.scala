package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var interfaces: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ServiceConfig]] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(interfaces: org.scalablytyped.runtime.StringDictionary[ServiceConfig] = null): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    __obj.asInstanceOf[ClientConfig]
  }
}

