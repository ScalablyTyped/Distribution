package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProtoElement extends IBase {
  
  /** [Method] Adds class to the element
    * @param cls String One or more classnames separated with spaces.
    * @returns Ext.util.ProtoElement this
    */
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.native
  
  /** [Property] (String) */
  var clsProp: js.UndefOr[String] = js.native
  
  /** [Method] Indicates that the current state of the object has been flushed to the DOM so we need to track any subsequent changes */
  var flush: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] True if the element has given class
    * @param cls String
    * @returns Boolean
    */
  var hasCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Method] Removes class from the element
    * @param cls String One or more classnames separated with spaces.
    * @returns Ext.util.ProtoElement this
    */
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.native
  
  /** [Property] (String) */
  var removedProp: js.UndefOr[String] = js.native
  
  /** [Method] Adds styles to the element
    * @param prop String/Object The style property to be set, or an object of multiple styles.
    * @param value String The value to apply to the given property.
    * @returns Ext.util.ProtoElement this
    */
  var setStyle: js.UndefOr[
    js.Function2[/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.native
  
  /** [Property] (Boolean) */
  var styleIsText: js.UndefOr[Boolean] = js.native
  
  /** [Property] (String) */
  var styleProp: js.UndefOr[String] = js.native
  
  /** [Method] Writes style and class properties to given object
    * @param to Object
    * @returns Object to
    */
  var writeTo: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], _]] = js.native
}
object IProtoElement {
  
  @scala.inline
  def apply(): IProtoElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProtoElement]
  }
  
  @scala.inline
  implicit class IProtoElementOps[Self <: IProtoElement] (val x: Self) extends AnyVal {
    
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
    def setAddCls(value: /* cls */ js.UndefOr[String] => IProtoElement): Self = this.set("addCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    
    @scala.inline
    def setClsProp(value: String): Self = this.set("clsProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClsProp: Self = this.set("clsProp", js.undefined)
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setHasCls(value: /* cls */ js.UndefOr[String] => Boolean): Self = this.set("hasCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasCls: Self = this.set("hasCls", js.undefined)
    
    @scala.inline
    def setRemoveCls(value: /* cls */ js.UndefOr[String] => IProtoElement): Self = this.set("removeCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    
    @scala.inline
    def setRemovedProp(value: String): Self = this.set("removedProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedProp: Self = this.set("removedProp", js.undefined)
    
    @scala.inline
    def setSetStyle(value: (/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IProtoElement): Self = this.set("setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    
    @scala.inline
    def setStyleIsText(value: Boolean): Self = this.set("styleIsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleIsText: Self = this.set("styleIsText", js.undefined)
    
    @scala.inline
    def setStyleProp(value: String): Self = this.set("styleProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleProp: Self = this.set("styleProp", js.undefined)
    
    @scala.inline
    def setWriteTo(value: /* to */ js.UndefOr[js.Any] => _): Self = this.set("writeTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWriteTo: Self = this.set("writeTo", js.undefined)
  }
}
