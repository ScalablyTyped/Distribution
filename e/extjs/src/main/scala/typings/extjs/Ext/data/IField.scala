package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField
  extends StObject
     with IBase {
  
  /** [Config Option] (Function) */
  var convert: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dateReadFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dateWriteFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var serialize: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Function/String) */
  var sortType: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}
object IField {
  
  inline def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: Any): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDateReadFormat(value: String): Self = StObject.set(x, "dateReadFormat", value.asInstanceOf[js.Any])
    
    inline def setDateReadFormatUndefined: Self = StObject.set(x, "dateReadFormat", js.undefined)
    
    inline def setDateWriteFormat(value: String): Self = StObject.set(x, "dateWriteFormat", value.asInstanceOf[js.Any])
    
    inline def setDateWriteFormatUndefined: Self = StObject.set(x, "dateWriteFormat", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setMapping(value: Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setSerialize(value: Any): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    inline def setSortDir(value: String): Self = StObject.set(x, "sortDir", value.asInstanceOf[js.Any])
    
    inline def setSortDirUndefined: Self = StObject.set(x, "sortDir", js.undefined)
    
    inline def setSortType(value: Any): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    inline def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseNull(value: Boolean): Self = StObject.set(x, "useNull", value.asInstanceOf[js.Any])
    
    inline def setUseNullUndefined: Self = StObject.set(x, "useNull", js.undefined)
  }
}
