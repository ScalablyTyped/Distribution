package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamNamesOptions extends StObject {
  
  /**
    * Name of the parameter passed with a chunked request that specifies the size in bytes of the associated chunk
    *
    * @default `'qqchunksize'`
    */
  var chunkSize: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the parameter passed with a chunked request that specifies the starting byte of the associated chunk
    *
    * @default `'qqpartbyteoffset'`
    */
  var partByteOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the parameter passed with a chunked request that specifies the index of the associated partition
    *
    * @default `'qqpartindex'`
    */
  var partIndex: js.UndefOr[String] = js.undefined
  
  /**
    * Sent with the first request of the resume with a value of `true`
    *
    * @default `'qqresume'`
    */
  var resuming: js.UndefOr[String] = js.undefined
  
  /**
    * totalFileSize
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSize: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the parameter passed with a chunked request that specifies the total number of chunks associated with the `File` or `Blob`
    *
    * @default `'qqtotalparts'`
    */
  var totalParts: js.UndefOr[String] = js.undefined
}
object ParamNamesOptions {
  
  @scala.inline
  def apply(): ParamNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamNamesOptions]
  }
  
  @scala.inline
  implicit class ParamNamesOptionsMutableBuilder[Self <: ParamNamesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: String): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setPartByteOffset(value: String): Self = StObject.set(x, "partByteOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartByteOffsetUndefined: Self = StObject.set(x, "partByteOffset", js.undefined)
    
    @scala.inline
    def setPartIndex(value: String): Self = StObject.set(x, "partIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartIndexUndefined: Self = StObject.set(x, "partIndex", js.undefined)
    
    @scala.inline
    def setResuming(value: String): Self = StObject.set(x, "resuming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumingUndefined: Self = StObject.set(x, "resuming", js.undefined)
    
    @scala.inline
    def setTotalFileSize(value: String): Self = StObject.set(x, "totalFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFileSizeUndefined: Self = StObject.set(x, "totalFileSize", js.undefined)
    
    @scala.inline
    def setTotalParts(value: String): Self = StObject.set(x, "totalParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPartsUndefined: Self = StObject.set(x, "totalParts", js.undefined)
  }
}
