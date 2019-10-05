package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookshelves extends js.Object {
  /** A list of bookshelves. */
  var items: js.UndefOr[js.Array[Bookshelf]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object Bookshelves {
  @scala.inline
  def apply(items: js.Array[Bookshelf] = null, kind: String = null): Bookshelves = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Bookshelves]
  }
}

