package typings.fridaGum.global.Java

import typings.fridaGum.Java.ChooseCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Java.choose")
@js.native
object choose extends js.Object {
  
  /**
    * Enumerates live instances of the `className` class by scanning the Java
    * VM's heap.
    *
    * @param className Name of class to enumerate instances of.
    * @param callbacks Object with callbacks.
    */
  def apply(className: String, callbacks: ChooseCallbacks): Unit = js.native
}
