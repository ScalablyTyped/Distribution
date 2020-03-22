package typings.divaJs.mod

import typings.divaJs.PartialOptionsobjectDatas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js", "default")
@js.native
class default protected () extends Diva {
   // HashParamState;
  /**
    * @param element - The ID of an HTMLElement to attach an instance of Diva to.
    * @param options - Options to be set by the user for the instance of Diva.
    */
  def this(element: String, options: PartialOptionsobjectDatas) = this()
}

/* static members */
@JSImport("diva.js", "default")
@js.native
object default extends js.Object {
  var Events: DivaEvent = js.native
}

