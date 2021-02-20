package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGrantApiKey[T] extends Generic {
  
  var body: T = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
}
object SecurityGrantApiKey {
  
  @scala.inline
  def apply[T](body: T): SecurityGrantApiKey[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGrantApiKey[T]]
  }
  
  @scala.inline
  implicit class SecurityGrantApiKeyMutableBuilder[Self <: SecurityGrantApiKey[_], T] (val x: Self with SecurityGrantApiKey[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
