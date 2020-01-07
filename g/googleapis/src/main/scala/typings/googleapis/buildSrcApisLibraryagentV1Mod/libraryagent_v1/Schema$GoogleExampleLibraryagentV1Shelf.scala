package typings.googleapis.buildSrcApisLibraryagentV1Mod.libraryagent_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shelf contains a collection of books with a theme.
  */
@js.native
trait Schema$GoogleExampleLibraryagentV1Shelf extends js.Object {
  /**
    * Output only. The resource name of the shelf. Shelf names have the form
    * `shelves/{shelf_id}`. The name is ignored when creating a shelf.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The theme of the shelf
    */
  var theme: js.UndefOr[String] = js.native
}

object Schema$GoogleExampleLibraryagentV1Shelf {
  @scala.inline
  def apply(name: String = null, theme: String = null): Schema$GoogleExampleLibraryagentV1Shelf = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleExampleLibraryagentV1Shelf]
  }
}

