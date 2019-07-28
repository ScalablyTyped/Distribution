package typings.gapiDotUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
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

object Anon_Fields {
  @scala.inline
  def apply(shortUrl: String, fields: String = null, projection: String = null): Anon_Fields = {
    val __obj = js.Dynamic.literal(shortUrl = shortUrl)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[Anon_Fields]
  }
}

