package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.Callback
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.PassThrough
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilMod {
  
  @JSImport("@google-cloud/storage/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/storage/build/src/util", "PassThroughShim")
  @js.native
  open class PassThroughShim () extends PassThrough {
    def this(opts: TransformOptions) = this()
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _write(
      chunk: scala.Nothing,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    /* private */ var shouldEmitReading: Any = js.native
    
    /* private */ var shouldEmitWriting: Any = js.native
  }
  
  inline def convertObjKeysToSnakeCase(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("convertObjKeysToSnakeCase")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def encodeURI(uri: String, encodeSlash: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURI")(uri.asInstanceOf[js.Any], encodeSlash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fixedEncodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedEncodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatAsUTCISO(dateTimeToFormat: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Boolean, dateDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any], dateDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Boolean, dateDelimiter: String, timeDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any], dateDelimiter.asInstanceOf[js.Any], timeDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Boolean, dateDelimiter: Unit, timeDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any], dateDelimiter.asInstanceOf[js.Any], timeDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Unit, dateDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any], dateDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Unit, dateDelimiter: String, timeDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any], dateDelimiter.asInstanceOf[js.Any], timeDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAsUTCISO(dateTimeToFormat: js.Date, includeTime: Unit, dateDelimiter: Unit, timeDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAsUTCISO")(dateTimeToFormat.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any], dateDelimiter.asInstanceOf[js.Any], timeDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalize[T, U](): Callback[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[Callback[T, U]]
  inline def normalize[T, U](optionsOrCallback: T | U): Callback[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(optionsOrCallback.asInstanceOf[js.Any]).asInstanceOf[Callback[T, U]]
  inline def normalize[T, U](optionsOrCallback: T | U, cb: U): Callback[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(optionsOrCallback.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Callback[T, U]]
  inline def normalize[T, U](optionsOrCallback: Unit, cb: U): Callback[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(optionsOrCallback.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Callback[T, U]]
  
  inline def objectEntries[T](obj: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectEntries")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, T]]]
  
  inline def objectKeyToLowercase[T](`object`: StringDictionary[T]): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectKeyToLowercase")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[T]]
  
  inline def qsStringify(
    qs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify querystring.ParsedUrlQueryInput */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("qsStringify")(qs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unicodeJSONStringify(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodeJSONStringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
