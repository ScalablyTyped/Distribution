package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropGridProperty
  extends StObject
     with IModel {
  
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IPropGridProperty: js.UndefOr[IMixedCollection] = js.undefined
}
object IPropGridProperty {
  
  inline def apply(): IPropGridProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropGridProperty]
  }
  
  extension [Self <: IPropGridProperty](x: Self) {
    
    inline def setFields(value: IMixedCollection): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
