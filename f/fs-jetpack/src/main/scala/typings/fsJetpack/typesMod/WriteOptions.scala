package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteOptions extends StObject {
  
  var atomic: js.UndefOr[Boolean] = js.undefined
  
  var jsonIndent: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String | Double] = js.undefined
}
object WriteOptions {
  
  inline def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
    inline def setAtomic(value: Boolean): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
    
    inline def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
    
    inline def setJsonIndent(value: Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
    
    inline def setJsonIndentUndefined: Self = StObject.set(x, "jsonIndent", js.undefined)
    
    inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
