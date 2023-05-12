package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.fullcalendarCoreStrings.body
import typings.fullcalendarCore.fullcalendarCoreStrings.footer
import typings.fullcalendarCore.fullcalendarCoreStrings.header
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleScrollGridSection] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: ChunkConfig): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
