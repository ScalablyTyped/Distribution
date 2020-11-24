package typings.globStream.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glob-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(glob: String): ReadableStream = js.native
  def apply(glob: String, options: Options): ReadableStream = js.native
  def apply(glob: js.Array[String]): ReadableStream = js.native
  def apply(glob: js.Array[String], options: Options): ReadableStream = js.native
}
