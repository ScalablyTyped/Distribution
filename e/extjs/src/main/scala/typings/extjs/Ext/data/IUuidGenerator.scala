package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUuidGenerator extends IIdGenerator {
  
  /** [Method] Reconfigures this generator given new config properties
    * @param config Object
    */
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.native
}
object IUuidGenerator {
  
  @scala.inline
  def apply(): IUuidGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUuidGenerator]
  }
  
  @scala.inline
  implicit class IUuidGeneratorMutableBuilder[Self <: IUuidGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReconfigure(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "reconfigure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
    
    @scala.inline
    def setSalt(value: js.Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
