package typings.fridaGum.global.Java

import typings.fridaGum.Java.ClassFactory
import typings.fridaGum.anon.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.ClassFactory")
@js.native
class ClassFactory_ () extends ClassFactory

/* static members */
@JSGlobal("Java.ClassFactory")
@js.native
object ClassFactory_ extends js.Object {
  /**
    * Gets the class factory instance for a given class loader.
    *
    * The default class factory used behind the scenes only interacts
    * with the application's main class loader. Other class loaders
    * can be discovered through `Java.enumerateClassLoaders()` and
    * interacted with through this API.
    */
  def get(classLoader: Wrapper): ClassFactory = js.native
}

