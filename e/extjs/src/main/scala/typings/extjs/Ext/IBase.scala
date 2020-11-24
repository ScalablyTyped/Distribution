package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBase extends IClass {
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], _]] = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  var initConfig: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.native
}
object IBase {
  
  @scala.inline
  def apply(): IBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBase]
  }
  
  @scala.inline
  implicit class IBaseOps[Self <: IBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallOverridden(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callOverridden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallOverridden: Self = this.set("callOverridden", js.undefined)
    
    @scala.inline
    def setCallParent(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallParent: Self = this.set("callParent", js.undefined)
    
    @scala.inline
    def setCallSuper(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callSuper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallSuper: Self = this.set("callSuper", js.undefined)
    
    @scala.inline
    def setGetInitialConfig(value: /* name */ js.UndefOr[java.lang.String] => _): Self = this.set("getInitialConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetInitialConfig: Self = this.set("getInitialConfig", js.undefined)
    
    @scala.inline
    def setInitConfig(value: /* config */ js.UndefOr[js.Any] => IBase): Self = this.set("initConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitConfig: Self = this.set("initConfig", js.undefined)
    
    @scala.inline
    def setSelf(value: IClass): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
}
