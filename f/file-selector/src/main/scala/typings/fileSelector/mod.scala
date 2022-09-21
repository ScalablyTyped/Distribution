package typings.fileSelector

import typings.fileSelector.fileMod.FileWithPath
import typings.std.DataTransferItem
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEvent(evt: Any): js.Promise[js.Array[FileWithPath | DataTransferItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileWithPath | DataTransferItem]]]
  inline def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileWithPath | DataTransferItem]]]
}
