package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUuidGenerator
  extends StObject
     with IIdGenerator {
  
  /** [Method] Reconfigures this generator given new config properties
    * @param config Object
    */
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.undefined
}
object IUuidGenerator {
  
  inline def apply(): IUuidGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUuidGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUuidGenerator] (val x: Self) extends AnyVal {
    
    inline def setReconfigure(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "reconfigure", js.Any.fromFunction1(value))
    
    inline def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
    
    inline def setSalt(value: Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
