package typings.epilogue.epilogueMod

import typings.epilogue.epilogueMod.ErrorsNs.EpilogueError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var attributes: js.Any = js.native
  var criteria: js.Any = js.native
  var instance: Resource = js.native
  var options: js.Any = js.native
  def continue(): Unit = js.native
  def error(status: Double): Unit = js.native
  def error(status: Double, message: String): Unit = js.native
  def error(status: Double, message: String, errorList: js.Array[String]): Unit = js.native
  def error(status: Double, message: String, errorList: js.Array[String], cause: Error): Unit = js.native
  def error(status: EpilogueError): Unit = js.native
  def error(status: EpilogueError, message: String): Unit = js.native
  def error(status: EpilogueError, message: String, errorList: js.Array[String]): Unit = js.native
  def error(status: EpilogueError, message: String, errorList: js.Array[String], cause: Error): Unit = js.native
  def skip(): Unit = js.native
  def stop(): Unit = js.native
}

