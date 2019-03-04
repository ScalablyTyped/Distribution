package typings
package gapiDotPlusLib.gapiNs.clientNs.plusNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParameters extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var query: java.lang.String
}

object SearchParameters {
  @scala.inline
  def apply(
    query: java.lang.String,
    language: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null
  ): SearchParameters = {
    val __obj = js.Dynamic.literal(query = query)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[SearchParameters]
  }
}

