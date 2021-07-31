package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProtoElement
  extends StObject
     with IBase {
  
  /** [Method] Adds class to the element
    * @param cls String One or more classnames separated with spaces.
    * @returns Ext.util.ProtoElement this
    */
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.undefined
  
  /** [Property] (String) */
  var clsProp: js.UndefOr[String] = js.undefined
  
  /** [Method] Indicates that the current state of the object has been flushed to the DOM so we need to track any subsequent changes */
  var flush: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] True if the element has given class
    * @param cls String
    * @returns Boolean
    */
  var hasCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Method] Removes class from the element
    * @param cls String One or more classnames separated with spaces.
    * @returns Ext.util.ProtoElement this
    */
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.undefined
  
  /** [Property] (String) */
  var removedProp: js.UndefOr[String] = js.undefined
  
  /** [Method] Adds styles to the element
    * @param prop String/Object The style property to be set, or an object of multiple styles.
    * @param value String The value to apply to the given property.
    * @returns Ext.util.ProtoElement this
    */
  var setStyle: js.UndefOr[
    js.Function2[/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.undefined
  
  /** [Property] (Boolean) */
  var styleIsText: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (String) */
  var styleProp: js.UndefOr[String] = js.undefined
  
  /** [Method] Writes style and class properties to given object
    * @param to Object
    * @returns Object to
    */
  var writeTo: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], js.Any]] = js.undefined
}
object IProtoElement {
  
  @scala.inline
  def apply(): IProtoElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProtoElement]
  }
  
  @scala.inline
  implicit class IProtoElementMutableBuilder[Self <: IProtoElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCls(value: /* cls */ js.UndefOr[String] => IProtoElement): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
    
    @scala.inline
    def setClsProp(value: String): Self = StObject.set(x, "clsProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClsPropUndefined: Self = StObject.set(x, "clsProp", js.undefined)
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setHasCls(value: /* cls */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
    
    @scala.inline
    def setRemoveCls(value: /* cls */ js.UndefOr[String] => IProtoElement): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
    
    @scala.inline
    def setRemovedProp(value: String): Self = StObject.set(x, "removedProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedPropUndefined: Self = StObject.set(x, "removedProp", js.undefined)
    
    @scala.inline
    def setSetStyle(value: (/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IProtoElement): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    
    @scala.inline
    def setStyleIsText(value: Boolean): Self = StObject.set(x, "styleIsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleIsTextUndefined: Self = StObject.set(x, "styleIsText", js.undefined)
    
    @scala.inline
    def setStyleProp(value: String): Self = StObject.set(x, "styleProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylePropUndefined: Self = StObject.set(x, "styleProp", js.undefined)
    
    @scala.inline
    def setWriteTo(value: /* to */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "writeTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteToUndefined: Self = StObject.set(x, "writeTo", js.undefined)
  }
}
