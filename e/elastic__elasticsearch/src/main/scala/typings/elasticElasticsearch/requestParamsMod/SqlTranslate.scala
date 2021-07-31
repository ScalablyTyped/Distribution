package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlTranslate[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SqlTranslate {
  
  @scala.inline
  def apply[T](body: T): SqlTranslate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlTranslate[T]]
  }
  
  @scala.inline
  implicit class SqlTranslateMutableBuilder[Self <: SqlTranslate[?], T] (val x: Self & SqlTranslate[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
