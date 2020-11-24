package typings.fsPromise.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "outputFile")
@js.native
object outputFile extends js.Object {
  
  def apply(file: String, data: String): js.Promise[Unit] = js.native
  def apply(file: String, data: String, options: WriteOptions): js.Promise[Unit] = js.native
  def apply(file: String, data: Buffer): js.Promise[Unit] = js.native
  def apply(file: String, data: Buffer, options: WriteOptions): js.Promise[Unit] = js.native
}
