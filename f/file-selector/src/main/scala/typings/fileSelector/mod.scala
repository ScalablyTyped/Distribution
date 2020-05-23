package typings.fileSelector

import typings.fileSelector.fileMod.FileWithPath
import typings.std.DataTransferItem
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-selector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}

