package typings.findParentDir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-parent-dir", JSImport.Namespace)
  @js.native
  def apply(
    currentFullPath: String,
    clue: String,
    cb: js.Function2[/* err */ js.Any, /* dir */ String | Null, Unit]
  ): Unit = js.native
  
  @JSImport("find-parent-dir", "sync")
  @js.native
  def sync(currentFullPath: String, clue: String): String | Null = js.native
}
