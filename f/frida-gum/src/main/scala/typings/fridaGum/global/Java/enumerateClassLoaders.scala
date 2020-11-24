package typings.fridaGum.global.Java

import typings.fridaGum.Java.EnumerateClassLoadersCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
