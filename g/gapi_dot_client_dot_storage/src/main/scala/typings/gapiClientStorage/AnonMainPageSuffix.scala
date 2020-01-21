package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMainPageSuffix extends js.Object {
  /**
    * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting
    * object. This allows the creation of index.html objects to represent directory pages.
    */
  var mainPageSuffix: js.UndefOr[String] = js.undefined
  /**
    * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this
    * bucket as the content for a 404 Not Found result.
    */
  var notFoundPage: js.UndefOr[String] = js.undefined
}

object AnonMainPageSuffix {
  @scala.inline
  def apply(mainPageSuffix: String = null, notFoundPage: String = null): AnonMainPageSuffix = {
    val __obj = js.Dynamic.literal()
    if (mainPageSuffix != null) __obj.updateDynamic("mainPageSuffix")(mainPageSuffix.asInstanceOf[js.Any])
    if (notFoundPage != null) __obj.updateDynamic("notFoundPage")(notFoundPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMainPageSuffix]
  }
}

