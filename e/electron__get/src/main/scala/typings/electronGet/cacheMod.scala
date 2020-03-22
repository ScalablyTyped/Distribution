package typings.electronGet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@electron/get/dist/cjs/Cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  @js.native
  class Cache () extends js.Object {
    def this(cacheRoot: String) = this()
    var cacheRoot: js.Any = js.native
    var getCachePath: js.Any = js.native
    def getPathForFileInCache(url: String, fileName: String): js.Promise[String | Null] = js.native
    def putFileInCache(url: String, currentPath: String, fileName: String): js.Promise[String] = js.native
  }
  
}

