package typings
package geetestLib.geetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geetest extends js.Object {
  def register(): stdLib.Promise[Data] = js.native
  def register(callback: js.Function2[/* error */ stdLib.Error, /* data */ Data, scala.Unit]): scala.Unit = js.native
  def validate(result: Result): stdLib.Promise[geetestLib.Success] = js.native
  def validate(
    result: Result,
    callback: js.Function2[/* error */ stdLib.Error, /* success */ geetestLib.Success, scala.Unit]
  ): scala.Unit = js.native
}

