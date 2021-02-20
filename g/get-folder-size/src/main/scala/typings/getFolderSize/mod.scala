package typings.getFolderSize

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-folder-size", JSImport.Namespace)
  @js.native
  def apply(folder: String, callback: js.Function2[/* err */ Error | Null, /* size */ Double, Unit]): Unit = js.native
  @JSImport("get-folder-size", JSImport.Namespace)
  @js.native
  def apply(
    folder: String,
    regexIgnorePattern: RegExp,
    callback: js.Function2[/* err */ Error | Null, /* size */ Double, Unit]
  ): Unit = js.native
}
