package typings.documentdb.documentdbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewDocument
  extends UniqueId
     with /** Custom properties */
/* key */ StringDictionary[js.Any] {
  /** The time to live in seconds of the document. */
  var ttl: js.UndefOr[Double] = js.undefined
}

object NewDocument {
  @scala.inline
  def apply(
    id: String,
    StringDictionary: /** Custom properties */
  /* key */ StringDictionary[js.Any] = null,
    ttl: Int | Double = null
  ): NewDocument = {
    val __obj = js.Dynamic.literal(id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDocument]
  }
}

