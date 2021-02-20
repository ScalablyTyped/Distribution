package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderSearchTemplate[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object RenderSearchTemplate {
  
  @scala.inline
  def apply[T](): RenderSearchTemplate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSearchTemplate[T]]
  }
  
  @scala.inline
  implicit class RenderSearchTemplateMutableBuilder[Self <: RenderSearchTemplate[_], T] (val x: Self with RenderSearchTemplate[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
