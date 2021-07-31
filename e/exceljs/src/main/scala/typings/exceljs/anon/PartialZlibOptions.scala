package typings.exceljs.anon

import typings.exceljs.mod.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.ArrayBuffer
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ZlibOptions> */
trait PartialZlibOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var dictionary: js.UndefOr[Buffer | TypedArray | DataView | ArrayBuffer] = js.undefined
  
  var finishFlush: js.UndefOr[Double] = js.undefined
  
  var flush: js.UndefOr[Double] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var memLevel: js.UndefOr[Double] = js.undefined
  
  var strategy: js.UndefOr[Double] = js.undefined
  
  var windowBits: js.UndefOr[Double] = js.undefined
}
object PartialZlibOptions {
  
  @scala.inline
  def apply(): PartialZlibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialZlibOptions]
  }
  
  @scala.inline
  implicit class PartialZlibOptionsMutableBuilder[Self <: PartialZlibOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setDictionary(value: Buffer | TypedArray | DataView | ArrayBuffer): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
    
    @scala.inline
    def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
    
    @scala.inline
    def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
