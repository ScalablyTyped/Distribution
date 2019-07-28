package typings.geetest.geetestMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geetest extends js.Object {
  def register(): js.Promise[Data] = js.native
  def register(callback: js.Function2[/* error */ Error, /* data */ Data, Unit]): Unit = js.native
  def validate(result: Result): js.Promise[Success] = js.native
  def validate(result: Result, callback: js.Function2[/* error */ Error, /* success */ Success, Unit]): Unit = js.native
}

