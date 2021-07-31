package typings.domClipboardApi

import typings.std.DataTransfer
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clipboard
  extends StObject
     with EventTarget {
  
  def read(): js.Promise[DataTransfer] = js.native
  
  def readText(): js.Promise[String] = js.native
  
  def write(data: DataTransfer): js.Promise[Unit] = js.native
  
  def writeText(data: String): js.Promise[Unit] = js.native
}
