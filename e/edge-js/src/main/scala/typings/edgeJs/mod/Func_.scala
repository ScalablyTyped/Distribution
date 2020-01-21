package typings.edgeJs.mod

import typings.edgeJs.edgeJsBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Func_[TInput, TOutput] extends js.Object {
  def apply(payload: TInput, callback: js.Function2[/* error */ Error, /* result */ TOutput, Unit]): Unit = js.native
  def apply(payload: TInput, sync: `true`): TOutput = js.native
}

