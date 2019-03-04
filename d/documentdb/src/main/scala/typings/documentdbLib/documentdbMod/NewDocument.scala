package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewDocument
  extends UniqueId
     with /** Custom properties */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** The time to live in seconds of the document. */
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object NewDocument {
  @scala.inline
  def apply(
    id: java.lang.String,
    StringDictionary: /** Custom properties */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ttl: scala.Int | scala.Double = null
  ): NewDocument = {
    val __obj = js.Dynamic.literal(id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDocument]
  }
}

