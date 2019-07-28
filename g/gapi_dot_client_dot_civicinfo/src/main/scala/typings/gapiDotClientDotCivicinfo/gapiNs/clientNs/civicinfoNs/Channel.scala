package typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /** The unique public identifier for the candidate's channel. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The type of channel. The following is a list of types of channels, but is not exhaustive. More channel types may be added at a later time. One of:
    * GooglePlus, YouTube, Facebook, Twitter
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Channel {
  @scala.inline
  def apply(id: String = null, `type`: String = null): Channel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Channel]
  }
}

