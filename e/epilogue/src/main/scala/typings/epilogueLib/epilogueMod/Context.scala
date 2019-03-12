package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var attributes: js.Any = js.native
  var criteria: js.Any = js.native
  var instance: Resource = js.native
  var options: js.Any = js.native
  def continue(): scala.Unit = js.native
  def error(status: epilogueLib.epilogueMod.ErrorsNs.EpilogueError): scala.Unit = js.native
  def error(status: epilogueLib.epilogueMod.ErrorsNs.EpilogueError, message: java.lang.String): scala.Unit = js.native
  def error(
    status: epilogueLib.epilogueMod.ErrorsNs.EpilogueError,
    message: java.lang.String,
    errorList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def error(
    status: epilogueLib.epilogueMod.ErrorsNs.EpilogueError,
    message: java.lang.String,
    errorList: js.Array[java.lang.String],
    cause: stdLib.Error
  ): scala.Unit = js.native
  def error(status: scala.Double): scala.Unit = js.native
  def error(status: scala.Double, message: java.lang.String): scala.Unit = js.native
  def error(status: scala.Double, message: java.lang.String, errorList: js.Array[java.lang.String]): scala.Unit = js.native
  def error(
    status: scala.Double,
    message: java.lang.String,
    errorList: js.Array[java.lang.String],
    cause: stdLib.Error
  ): scala.Unit = js.native
  def skip(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

