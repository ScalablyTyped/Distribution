package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.fullcalendarCommonStrings.body
import typings.fullcalendarCommon.fullcalendarCommonStrings.footer
import typings.fullcalendarCommon.fullcalendarCommonStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleScrollGridSection
  extends StObject
     with SectionConfig {
  
  var chunk: js.UndefOr[ChunkConfig] = js.undefined
  
  var key: String
}
object SimpleScrollGridSection {
  
  inline def apply(key: String, `type`: body | header | footer): SimpleScrollGridSection = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleScrollGridSection]
  }
  
  extension [Self <: SimpleScrollGridSection](x: Self) {
    
    inline def setChunk(value: ChunkConfig): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
