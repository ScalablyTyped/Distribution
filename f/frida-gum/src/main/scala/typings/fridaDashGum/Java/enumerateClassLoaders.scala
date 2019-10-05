package typings.fridaDashGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.enumerateClassLoaders")
@js.native
object enumerateClassLoaders extends js.Object {
  /**
    * Enumerates class loaders.
    *
    * You may assign such a loader to `Java.classFactory.loader` to make
    * `Java.use()` look for classes on a specific loader instead of the default
    * loader used by the app.
    *
    * @param callbacks Object with callbacks.
    */
  def apply(callbacks: EnumerateClassLoadersCallbacks): Unit = js.native
}

