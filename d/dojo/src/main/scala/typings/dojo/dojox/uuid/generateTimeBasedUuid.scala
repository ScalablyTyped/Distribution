package typings.dojo.dojox.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.uuid.generateTimeBasedUuid")
@js.native
object generateTimeBasedUuid extends js.Object {
  /**
    * Returns the 'node' value that will be included in generated UUIDs.
    *
    */
  type getNode = js.Function0[Unit]
  /**
    *
    * @param node               Optional
    */
  type isValidNode = js.Function1[/* node */ String, Unit]
  /**
    * Sets the 'node' value that will be included in generated UUIDs.
    *
    * @param node               Optional
    */
  type setNode = js.Function1[/* node */ String, Unit]
}

