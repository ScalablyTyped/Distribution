package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.node.querystringMod.ParsedUrlQueryInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/storage/build/src/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def encodeURI(uri: String, encodeSlash: Boolean): String = js.native
  def fixedEncodeURIComponent(str: String): String = js.native
  def normalize[T, U](): AnonCallback[T, U] = js.native
  def normalize[T, U](optionsOrCallback: T | U): AnonCallback[T, U] = js.native
  def normalize[T, U](optionsOrCallback: T | U, cb: U): AnonCallback[T, U] = js.native
  def objectEntries[T](obj: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def qsStringify(qs: ParsedUrlQueryInput): String = js.native
}

