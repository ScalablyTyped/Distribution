package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlQuery[T] extends Generic {
  
  var body: T = js.native
  
  var format: js.UndefOr[String] = js.native
}
object SqlQuery {
  
  @scala.inline
  def apply[T](body: T): SqlQuery[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQuery[T]]
  }
  
  @scala.inline
  implicit class SqlQueryMutableBuilder[Self <: SqlQuery[_], T] (val x: Self with SqlQuery[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
