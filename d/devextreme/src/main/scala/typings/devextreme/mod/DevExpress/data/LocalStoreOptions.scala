package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStoreOptions
  extends StObject
     with ArrayStoreOptions[LocalStore] {
  
  /**
    * [descr:LocalStore.Options.flushInterval]
    */
  var flushInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:LocalStore.Options.immediate]
    */
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:LocalStore.Options.name]
    */
  var name: js.UndefOr[String] = js.undefined
}
object LocalStoreOptions {
  
  inline def apply(): LocalStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStoreOptions]
  }
  
  extension [Self <: LocalStoreOptions](x: Self) {
    
    inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
