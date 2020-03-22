package typings.evernote.mod.Types

import typings.evernote.AnonOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.Publishing")
@js.native
class Publishing () extends js.Object {
  def this(args: AnonOrder) = this()
  var ascending: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[NoteSortOrder] = js.native
  var publicDescription: js.UndefOr[String] = js.native
  var uri: js.UndefOr[String] = js.native
}

