package typings.extjs.Ext.data

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
  implicit class IUuidGeneratorOps[Self <: IUuidGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReconfigure(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("reconfigure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReconfigure: Self = this.set("reconfigure", js.undefined)
    
    @scala.inline
    def setSalt(value: js.Any): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
