package typings.fastGlob.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob", "stream")
@js.native
object stream extends js.Object {
  def apply(source: js.Array[typings.fastGlob.typesMod.Pattern]): ReadableStream = js.native
  def apply(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): ReadableStream = js.native
  def apply(source: typings.fastGlob.typesMod.Pattern): ReadableStream = js.native
  def apply(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): ReadableStream = js.native
}

