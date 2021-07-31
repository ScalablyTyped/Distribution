package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkSize extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
}
object ChunkSize {
  
  @scala.inline
  def apply(): ChunkSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkSize]
  }
  
  @scala.inline
  implicit class ChunkSizeMutableBuilder[Self <: ChunkSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
  }
}
