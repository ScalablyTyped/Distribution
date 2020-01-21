package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.enumerateClassLoaders")
@js.native
object enumerateClassLoaders extends js.Object {
  /**
    * Enumerates class loaders.
    *
    * You may pass such a loader to `Java.ClassFactory.get()` to be able to
    * `.use()` classes on the specified class loader.
    *
    * @param callbacks Object with callbacks.
    */
  def apply(callbacks: EnumerateClassLoadersCallbacks): Unit = js.native
}

