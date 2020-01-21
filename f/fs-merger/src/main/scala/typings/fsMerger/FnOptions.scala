package typings.fsMerger

import typings.node.AnonEncodingFlag
import typings.node.AnonEncodingFlagNull
import typings.node.AnonEncodingFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptions extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: String): String = js.native
  def apply(path: Double, options: AnonEncodingFlag): Buffer = js.native
  def apply(path: Double, options: AnonEncodingFlagNull): String | Buffer = js.native
  def apply(path: Double, options: AnonEncodingFlagString): String = js.native
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String = js.native
  def apply(path: PathLike, options: AnonEncodingFlag): Buffer = js.native
  def apply(path: PathLike, options: AnonEncodingFlagNull): String | Buffer = js.native
  def apply(path: PathLike, options: AnonEncodingFlagString): String = js.native
}

