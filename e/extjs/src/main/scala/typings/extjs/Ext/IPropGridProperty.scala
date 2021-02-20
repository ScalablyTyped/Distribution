package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropGridProperty extends IModel {
  
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IPropGridProperty: js.UndefOr[IMixedCollection] = js.native
}
object IPropGridProperty {
  
  @scala.inline
  def apply(): IPropGridProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropGridProperty]
  }
  
  @scala.inline
  implicit class IPropGridPropertyMutableBuilder[Self <: IPropGridProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: IMixedCollection): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
