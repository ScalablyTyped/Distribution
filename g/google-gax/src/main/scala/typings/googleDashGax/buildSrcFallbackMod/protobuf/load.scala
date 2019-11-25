package typings.googleDashGax.buildSrcFallbackMod.protobuf

import typings.protobufjs.protobufjsMod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "protobuf.load")
@js.native
object load extends js.Object {
  def apply(filename: String): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typings.protobufjs.protobufjsMod.Root): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: String, root: typings.protobufjs.protobufjsMod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typings.protobufjs.protobufjsMod.Root): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: js.Array[String], root: typings.protobufjs.protobufjsMod.Root, callback: LoadCallback): Unit = js.native
}

