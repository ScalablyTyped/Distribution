package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField
  extends StObject
     with IBase {
  
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dateReadFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dateWriteFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var serialize: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Function/String) */
  var sortType: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}
object IField {
  
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit class IFieldMutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: js.Any): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDateReadFormat(value: String): Self = StObject.set(x, "dateReadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateReadFormatUndefined: Self = StObject.set(x, "dateReadFormat", js.undefined)
    
    @scala.inline
    def setDateWriteFormat(value: String): Self = StObject.set(x, "dateWriteFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateWriteFormatUndefined: Self = StObject.set(x, "dateWriteFormat", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setSerialize(value: js.Any): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    @scala.inline
    def setSortDir(value: String): Self = StObject.set(x, "sortDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirUndefined: Self = StObject.set(x, "sortDir", js.undefined)
    
    @scala.inline
    def setSortType(value: js.Any): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseNull(value: Boolean): Self = StObject.set(x, "useNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNullUndefined: Self = StObject.set(x, "useNull", js.undefined)
  }
}
