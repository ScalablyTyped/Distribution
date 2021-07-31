package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlClearCursor[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SqlClearCursor {
  
  @scala.inline
  def apply[T](body: T): SqlClearCursor[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlClearCursor[T]]
  }
  
  @scala.inline
  implicit class SqlClearCursorMutableBuilder[Self <: SqlClearCursor[?], T] (val x: Self & SqlClearCursor[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
