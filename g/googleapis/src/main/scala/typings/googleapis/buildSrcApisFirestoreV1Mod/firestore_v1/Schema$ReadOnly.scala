package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a transaction that can only be used to read documents.
  */
@js.native
trait Schema$ReadOnly extends js.Object {
  /**
    * Reads documents at the given time. This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
}

object Schema$ReadOnly {
  @scala.inline
  def apply(readTime: String = null): Schema$ReadOnly = {
    val __obj = js.Dynamic.literal()
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReadOnly]
  }
}

