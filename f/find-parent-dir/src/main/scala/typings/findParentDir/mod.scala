package typings.findParentDir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("find-parent-dir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    currentFullPath: String,
    clue: String,
    cb: js.Function2[/* err */ js.Any, /* dir */ String | Null, Unit]
  ): Unit = js.native
  
  def sync(currentFullPath: String, clue: String): String | Null = js.native
}
