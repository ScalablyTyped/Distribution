package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.Callback
import typings.node.querystringMod.ParsedUrlQueryInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@google-cloud/storage/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeURI(uri: String, encodeSlash: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURI")(uri.asInstanceOf[js.Any], encodeSlash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fixedEncodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedEncodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalize[T, U](): Callback[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[Callback[T, U]]
  inline def normalize[T, U](optionsOrCallback: T | U): Callback[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(optionsOrCallback.asInstanceOf[js.Any]).asInstanceOf[Callback[T, U]]
  inline def normalize[T, U](optionsOrCallback: T | U, cb: U): Callback[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(optionsOrCallback.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Callback[T, U]]
  inline def normalize[T, U](optionsOrCallback: Unit, cb: U): Callback[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(optionsOrCallback.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Callback[T, U]]
  
  inline def objectEntries[T](obj: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectEntries")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, T]]]
  
  inline def objectKeyToLowercase[T](`object`: StringDictionary[T]): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectKeyToLowercase")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[T]]
  
  inline def qsStringify(qs: ParsedUrlQueryInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("qsStringify")(qs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unicodeJSONStringify(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodeJSONStringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
