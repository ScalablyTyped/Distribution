package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single resource related to a threat hit.
  */
@js.native
trait Schema$ThreatSource extends js.Object {
  /**
    * Referrer of the resource. Only set if the referrer is available.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * The remote IP of the resource in ASCII format. Either IPv4 or IPv6.
    */
  var remoteIp: js.UndefOr[String] = js.native
  /**
    * The type of source reported.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The URL of the resource.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$ThreatSource {
  @scala.inline
  def apply(referrer: String = null, remoteIp: String = null, `type`: String = null, url: String = null): Schema$ThreatSource = {
    val __obj = js.Dynamic.literal()
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (remoteIp != null) __obj.updateDynamic("remoteIp")(remoteIp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThreatSource]
  }
}

