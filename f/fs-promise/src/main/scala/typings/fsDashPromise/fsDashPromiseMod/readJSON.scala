package typings.fsDashPromise.fsDashPromiseMod

import typings.fsDashExtra.fsDashExtraMod.ReadOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "readJSON")
@js.native
object readJSON extends js.Object {
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
  def apply(file: String, options: ReadJsonOptions): js.Promise[_] = js.native
}

@JSImport("fs-promise", "readJson")
@js.native
object readJson extends js.Object {
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
  def apply(file: String, options: ReadJsonOptions): js.Promise[_] = js.native
}

