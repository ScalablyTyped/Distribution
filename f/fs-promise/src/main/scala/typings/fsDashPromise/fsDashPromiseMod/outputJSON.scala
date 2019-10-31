package typings.fsDashPromise.fsDashPromiseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "outputJSON")
@js.native
object outputJSON extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: typings.fsDashExtra.fsDashExtraMod.WriteOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: typings.fsDashExtra.fsDashExtraMod.WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteJsonOptions): js.Promise[Unit] = js.native
}

@JSImport("fs-promise", "outputJson")
@js.native
object outputJson extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: typings.fsDashExtra.fsDashExtraMod.WriteOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: typings.fsDashExtra.fsDashExtraMod.WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteJsonOptions): js.Promise[Unit] = js.native
}

