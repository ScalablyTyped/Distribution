package typings.googleapis.buildSrcApisLibraryagentV1Mod.libraryagent_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single book in the library.
  */
@js.native
trait Schema$GoogleExampleLibraryagentV1Book extends js.Object {
  /**
    * The name of the book author.
    */
  var author: js.UndefOr[String] = js.native
  /**
    * The resource name of the book. Book names have the form
    * `shelves/{shelf_id}/books/{book_id}`. The name is ignored when creating a
    * book.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value indicating whether the book has been read.
    */
  var read: js.UndefOr[Boolean] = js.native
  /**
    * The title of the book.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleExampleLibraryagentV1Book {
  @scala.inline
  def apply(
    author: String = null,
    name: String = null,
    read: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Schema$GoogleExampleLibraryagentV1Book = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleExampleLibraryagentV1Book]
  }
}

