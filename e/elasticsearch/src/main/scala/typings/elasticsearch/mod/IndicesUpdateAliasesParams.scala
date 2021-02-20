package typings.elasticsearch.mod

import typings.elasticsearch.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesUpdateAliasesParams extends GenericParams {
  
  @JSName("body")
  var body_IndicesUpdateAliasesParams: Actions = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object IndicesUpdateAliasesParams {
  
  @scala.inline
  def apply(body: Actions): IndicesUpdateAliasesParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpdateAliasesParams]
  }
  
  @scala.inline
  implicit class IndicesUpdateAliasesParamsMutableBuilder[Self <: IndicesUpdateAliasesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Actions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
