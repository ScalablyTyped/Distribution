package typings.fileSelector

import typings.fileSelector.fileMod.FileWithPath
import typings.std.DataTransferItem
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSelectorMod {
  
  @JSImport("file-selector/dist/file-selector", "fromEvent")
  @js.native
  def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}
