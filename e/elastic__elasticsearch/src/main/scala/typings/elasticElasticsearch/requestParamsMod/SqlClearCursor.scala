package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlClearCursor[T] extends Generic {
  
  var body: T = js.native
}
object SqlClearCursor {
  
  @scala.inline
  def apply[T](body: T): SqlClearCursor[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlClearCursor[T]]
  }
  
  @scala.inline
  implicit class SqlClearCursorMutableBuilder[Self <: SqlClearCursor[_], T] (val x: Self with SqlClearCursor[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
