package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsResult extends StObject {
  
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV2]] = js.undefined
  
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.undefined
}
object DetailsResult {
  
  @scala.inline
  def apply(): DetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsResult]
  }
  
  @scala.inline
  implicit class DetailsResultMutableBuilder[Self <: DetailsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Array[SchemaPagespeedApiFormatStringV2]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: SchemaPagespeedApiFormatStringV2*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: SchemaPagespeedApiFormatStringV2): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
