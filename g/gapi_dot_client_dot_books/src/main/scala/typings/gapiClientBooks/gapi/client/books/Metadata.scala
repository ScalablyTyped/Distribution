package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.Downloadurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /** A list of offline dictionary metadata. */
  var items: js.UndefOr[js.Array[Downloadurl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(items: js.Array[Downloadurl] = null, kind: String = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

