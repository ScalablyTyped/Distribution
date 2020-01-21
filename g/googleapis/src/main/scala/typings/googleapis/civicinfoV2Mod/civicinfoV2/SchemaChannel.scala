package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A social media or web channel for a candidate.
  */
@js.native
trait SchemaChannel extends js.Object {
  /**
    * The unique public identifier for the candidate&#39;s channel.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of channel. The following is a list of types of channels, but is
    * not exhaustive. More channel types may be added at a later time. One of:
    * GooglePlus, YouTube, Facebook, Twitter
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaChannel {
  @scala.inline
  def apply(id: String = null, `type`: String = null): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannel]
  }
}

