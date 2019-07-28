package typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Official extends js.Object {
  /** Addresses at which to contact the official. */
  var address: js.UndefOr[js.Array[SimpleAddressType]] = js.undefined
  /** A list of known (social) media channels for this official. */
  var channels: js.UndefOr[js.Array[Channel]] = js.undefined
  /** The direct email addresses for the official. */
  var emails: js.UndefOr[js.Array[String]] = js.undefined
  /** The official's name. */
  var name: js.UndefOr[String] = js.undefined
  /** The full name of the party the official belongs to. */
  var party: js.UndefOr[String] = js.undefined
  /** The official's public contact phone numbers. */
  var phones: js.UndefOr[js.Array[String]] = js.undefined
  /** A URL for a photo of the official. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /** The official's public website URLs. */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object Official {
  @scala.inline
  def apply(
    address: js.Array[SimpleAddressType] = null,
    channels: js.Array[Channel] = null,
    emails: js.Array[String] = null,
    name: String = null,
    party: String = null,
    phones: js.Array[String] = null,
    photoUrl: String = null,
    urls: js.Array[String] = null
  ): Official = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (party != null) __obj.updateDynamic("party")(party)
    if (phones != null) __obj.updateDynamic("phones")(phones)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[Official]
  }
}

