package typings.getFolderSize

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(folder: String, callback: js.Function2[/* err */ Error | Null, /* size */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(folder.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    folder: String,
    regexIgnorePattern: RegExp,
    callback: js.Function2[/* err */ Error | Null, /* size */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(folder.asInstanceOf[js.Any], regexIgnorePattern.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("get-folder-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
