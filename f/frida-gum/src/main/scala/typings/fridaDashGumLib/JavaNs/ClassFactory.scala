package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassFactory extends js.Object {
  /**
    * Path to cache directory currently being used. Typically updated by
    * the first call to `Java.perform()`.
    */
  var cacheDir: java.lang.String
  /**
    * Class loader currently being used. Typically updated by the
    * first call to `Java.perform()`.
    *
    * You may assign a different `java.lang.ClassLoader` to make
    * `Java.use()` look for classes on a specific loader instead of
    * the default loader used by the app.
    */
  var loader: Wrapper | scala.Null
  /**
    * Naming convention to use for temporary files.
    *
    * Defaults to `{ prefix: "frida", suffix: "dat" }`.
    */
  var tempFileNaming: TempFileNaming
}

object ClassFactory {
  @scala.inline
  def apply(cacheDir: java.lang.String, tempFileNaming: TempFileNaming, loader: Wrapper = null): ClassFactory = {
    val __obj = js.Dynamic.literal(cacheDir = cacheDir, tempFileNaming = tempFileNaming)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    __obj.asInstanceOf[ClassFactory]
  }
}

