package typings.fridaDashGum.Java

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassFactory extends js.Object {
  /**
    * Path to cache directory currently being used. Typically updated by
    * the first call to `Java.perform()`.
    */
  var cacheDir: String
  /**
    * Class loader currently being used. Typically updated by the
    * first call to `Java.perform()`.
    *
    * You may assign a different `java.lang.ClassLoader` to make
    * `Java.use()` look for classes on a specific loader instead of
    * the default loader used by the app.
    */
  var loader: Wrapper | Null
  /**
    * Naming convention to use for temporary files.
    *
    * Defaults to `{ prefix: "frida", suffix: "dat" }`.
    */
  var tempFileNaming: TempFileNaming
}

object ClassFactory {
  @scala.inline
  def apply(cacheDir: String, tempFileNaming: TempFileNaming, loader: Wrapper = null): ClassFactory = {
    val __obj = js.Dynamic.literal(cacheDir = cacheDir.asInstanceOf[js.Any], tempFileNaming = tempFileNaming.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassFactory]
  }
}

@JSGlobal("Java.classFactory")
@js.native
object classFactory extends TopLevel[ClassFactory]

