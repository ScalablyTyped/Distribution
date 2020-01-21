package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precondition extends js.Object {
  /**
    * When set to `true`, the target document must exist.
    * When set to `false`, the target document must not exist.
    */
  var exists: js.UndefOr[Boolean] = js.undefined
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}

object Precondition {
  @scala.inline
  def apply(exists: js.UndefOr[Boolean] = js.undefined, updateTime: String = null): Precondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precondition]
  }
}

