package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.Callback
import typings.node.querystringMod.ParsedUrlQueryInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def encodeURI(uri: String, encodeSlash: Boolean): String = js.native
  
  def fixedEncodeURIComponent(str: String): String = js.native
  
  def normalize[T, U](): Callback[T, U] = js.native
  def normalize[T, U](optionsOrCallback: T | U): Callback[T, U] = js.native
  def normalize[T, U](optionsOrCallback: js.UndefOr[T | U], cb: U): Callback[T, U] = js.native
  
  def objectEntries[T](obj: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  
  def objectKeyToLowercase[T](`object`: StringDictionary[T]): StringDictionary[T] = js.native
  
  def qsStringify(qs: ParsedUrlQueryInput): String = js.native
  
  def unicodeJSONStringify(obj: js.Object): String = js.native
}
