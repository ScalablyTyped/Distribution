package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlClassification extends js.Object {
  /** Classification flags if the request has been classified and it is first party. */
  var firstParty: UrlClassificationParty
  /**
    * Classification flags if the request has been classified and it or its window hierarchy is third party.
    */
  var thirdParty: UrlClassificationParty
}

object UrlClassification {
  @scala.inline
  def apply(firstParty: UrlClassificationParty, thirdParty: UrlClassificationParty): UrlClassification = {
    val __obj = js.Dynamic.literal(firstParty = firstParty.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlClassification]
  }
}

