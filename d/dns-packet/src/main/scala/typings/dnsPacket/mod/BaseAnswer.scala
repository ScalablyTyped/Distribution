package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAnswer[T, D]
  extends StObject
     with GenericAnswer[T] {
  
  var `class`: js.UndefOr[RecordClass] = js.undefined
  
  var data: D
  
  var flush: js.UndefOr[Boolean] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object BaseAnswer {
  
  inline def apply[T, D](data: D, name: String, `type`: T): BaseAnswer[T, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAnswer[T, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseAnswer[?, ?], T, D] (val x: Self & (BaseAnswer[T, D])) extends AnyVal {
    
    inline def setClass(value: RecordClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
