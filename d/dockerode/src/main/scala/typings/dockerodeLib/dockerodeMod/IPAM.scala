package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
trait IPAM extends js.Object {
  var Config: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Driver: java.lang.String
  var Options: js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.undefined
}

object IPAM {
  @scala.inline
  def apply(
    Driver: java.lang.String,
    Config: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Options: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = null
  ): IPAM = {
    val __obj = js.Dynamic.literal(Driver = Driver)
    if (Config != null) __obj.updateDynamic("Config")(Config)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    __obj.asInstanceOf[IPAM]
  }
}

