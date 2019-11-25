package typings.dockerode.dockerodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
trait IPAM extends js.Object {
  var Config: js.UndefOr[StringDictionary[String]] = js.undefined
  var Driver: String
  var Options: js.UndefOr[js.Array[StringDictionary[String]]] = js.undefined
}

object IPAM {
  @scala.inline
  def apply(
    Driver: String,
    Config: StringDictionary[String] = null,
    Options: js.Array[StringDictionary[String]] = null
  ): IPAM = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any])
    if (Config != null) __obj.updateDynamic("Config")(Config.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPAM]
  }
}

