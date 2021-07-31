package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatFielddataParams
  extends StObject
     with CatCommonParams {
  
  var bytes: js.UndefOr[CatBytes] = js.undefined
  
  var fields: js.UndefOr[NameList] = js.undefined
}
object CatFielddataParams {
  
  @scala.inline
  def apply(format: String): CatFielddataParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatFielddataParams]
  }
  
  @scala.inline
  implicit class CatFielddataParamsMutableBuilder[Self <: CatFielddataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
