package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosePointInTime[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
}
object ClosePointInTime {
  
  @scala.inline
  def apply[T](): ClosePointInTime[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosePointInTime[T]]
  }
  
  @scala.inline
  implicit class ClosePointInTimeMutableBuilder[Self <: ClosePointInTime[_], T] (val x: Self with ClosePointInTime[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
