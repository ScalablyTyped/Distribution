package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnly extends js.Object {
  /**
    * Reads documents at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.undefined
}

object ReadOnly {
  @scala.inline
  def apply(readTime: String = null): ReadOnly = {
    val __obj = js.Dynamic.literal()
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnly]
  }
}

