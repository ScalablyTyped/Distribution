package typings.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Additional information to return. ANALYTICS_CLICKS, ANALYTICS_TOP_STRINGS, FULL
    */
  var projection: js.UndefOr[String] = js.undefined
  /**
    * The short URL, including the protocol.
    */
  var shortUrl: String
}

object AnonFields {
  @scala.inline
  def apply(shortUrl: String, fields: String = null, projection: String = null): AnonFields = {
    val __obj = js.Dynamic.literal(shortUrl = shortUrl.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

