package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.Callback
import typings.node.querystringMod.ParsedUrlQueryInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@google-cloud/storage/build/src/util", "encodeURI")
  @js.native
  def encodeURI(uri: String, encodeSlash: Boolean): String = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "fixedEncodeURIComponent")
  @js.native
  def fixedEncodeURIComponent(str: String): String = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "normalize")
  @js.native
  def normalize[T, U](): Callback[T, U] = js.native
  @JSImport("@google-cloud/storage/build/src/util", "normalize")
  @js.native
  def normalize[T, U](optionsOrCallback: T | U): Callback[T, U] = js.native
  @JSImport("@google-cloud/storage/build/src/util", "normalize")
  @js.native
  def normalize[T, U](optionsOrCallback: js.UndefOr[T | U], cb: U): Callback[T, U] = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "objectEntries")
  @js.native
  def objectEntries[T](obj: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "objectKeyToLowercase")
  @js.native
  def objectKeyToLowercase[T](`object`: StringDictionary[T]): StringDictionary[T] = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "qsStringify")
  @js.native
  def qsStringify(qs: ParsedUrlQueryInput): String = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "unicodeJSONStringify")
  @js.native
  def unicodeJSONStringify(obj: js.Object): String = js.native
}
