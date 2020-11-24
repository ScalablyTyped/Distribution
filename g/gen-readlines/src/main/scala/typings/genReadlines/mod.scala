package typings.genReadlines

import typings.node.Buffer
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gen-readlines", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(fd: Double, filesize: Double): IterableIterator[Buffer] = js.native
  def apply(fd: Double, filesize: Double, bufferSize: js.UndefOr[scala.Nothing], position: Double): IterableIterator[Buffer] = js.native
  def apply(fd: Double, filesize: Double, bufferSize: Double): IterableIterator[Buffer] = js.native
  def apply(fd: Double, filesize: Double, bufferSize: Double, position: Double): IterableIterator[Buffer] = js.native
}
