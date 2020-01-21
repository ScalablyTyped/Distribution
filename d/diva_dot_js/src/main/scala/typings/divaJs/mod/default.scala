package typings.divaJs.mod

import org.scalablytyped.runtime.Instantiable2
import typings.divaJs.AnonObjectData
import typings.divaJs.interfacesMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js", "default")
@js.native
class default protected () extends Diva {
  def this(element: String, options: Partial[Options] with AnonObjectData) = this()
}

@JSImport("diva.js", "default")
@js.native
object default extends Instantiable2[/* element */ String, /* options */ Partial[Options] with AnonObjectData, Diva] {
  var Events: DivaEvent = js.native
}

