package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkCreateOptions extends js.Object {
  var Attachable: js.UndefOr[Boolean] = js.undefined
  var CheckDuplicate: js.UndefOr[Boolean] = js.undefined
  var Driver: js.UndefOr[String] = js.undefined
  var EnableIPv6: js.UndefOr[Boolean] = js.undefined
  var IPAM: js.UndefOr[typings.dockerode.mod.IPAM] = js.undefined
  var Ingress: js.UndefOr[Boolean] = js.undefined
  var Internal: js.UndefOr[Boolean] = js.undefined
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var Name: String
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
}

object NetworkCreateOptions {
  @scala.inline
  def apply(
    Name: String,
    Attachable: js.UndefOr[Boolean] = js.undefined,
    CheckDuplicate: js.UndefOr[Boolean] = js.undefined,
    Driver: String = null,
    EnableIPv6: js.UndefOr[Boolean] = js.undefined,
    IPAM: IPAM = null,
    Ingress: js.UndefOr[Boolean] = js.undefined,
    Internal: js.UndefOr[Boolean] = js.undefined,
    Labels: StringDictionary[String] = null,
    Options: StringDictionary[String] = null
  ): NetworkCreateOptions = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Attachable)) __obj.updateDynamic("Attachable")(Attachable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CheckDuplicate)) __obj.updateDynamic("CheckDuplicate")(CheckDuplicate.get.asInstanceOf[js.Any])
    if (Driver != null) __obj.updateDynamic("Driver")(Driver.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableIPv6)) __obj.updateDynamic("EnableIPv6")(EnableIPv6.get.asInstanceOf[js.Any])
    if (IPAM != null) __obj.updateDynamic("IPAM")(IPAM.asInstanceOf[js.Any])
    if (!js.isUndefined(Ingress)) __obj.updateDynamic("Ingress")(Ingress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Internal)) __obj.updateDynamic("Internal")(Internal.get.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkCreateOptions]
  }
}

