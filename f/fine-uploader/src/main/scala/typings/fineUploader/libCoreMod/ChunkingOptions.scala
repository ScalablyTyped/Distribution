package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkingOptions extends StObject {
  
  /**
    * concurrent Chunking options
    */
  var concurrent: js.UndefOr[ConcurrentOptions] = js.undefined
  
  /**
    * Enable or disable splitting the file separate chunks. Each chunks is sent in a separate requested
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ensure every file is uploaded in chunks, even if the file can only be split up into 1 chunk.
    *
    * Does not apply if chunking is not possible in the current browser
    *
    * @default `false`
    */
  var mandatory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ParamNamesOptions
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.undefined
  
  /**
    * The maximum size of each chunk, in bytes
    * If a function value is provided, the file's ID will be passed when invoking the function (which should only be called once per file)
    *
    * @default `2000000`
    */
  var partSize: js.UndefOr[Double | js.Function] = js.undefined
  
  /**
    * SuccessOptions
    */
  var success: js.UndefOr[SuccessOptions] = js.undefined
}
object ChunkingOptions {
  
  inline def apply(): ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkingOptions] (val x: Self) extends AnyVal {
    
    inline def setConcurrent(value: ConcurrentOptions): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    inline def setParamNames(value: ParamNamesOptions): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
    
    inline def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
    
    inline def setPartSize(value: Double | js.Function): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    
    inline def setSuccess(value: SuccessOptions): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
