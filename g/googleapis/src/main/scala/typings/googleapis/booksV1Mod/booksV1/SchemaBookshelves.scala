package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBookshelves extends js.Object {
  /**
    * A list of bookshelves.
    */
  var items: js.UndefOr[js.Array[SchemaBookshelf]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBookshelves {
  @scala.inline
  def apply(items: js.Array[SchemaBookshelf] = null, kind: String = null): SchemaBookshelves = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBookshelves]
  }
}

