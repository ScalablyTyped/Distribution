package typings.fireo.mod

import typings.fireo.anon.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fireo", "Collection")
@js.native
open class Collection () extends BaseManager {
  
  def cursor(queryCursor: String): Any = js.native
  
  def delete(by: DeleteCollectionOptions): js.Promise[Unit] = js.native
  
  def fetch(): js.Promise[Cursor] = js.native
  def fetch(limit: Double): js.Promise[Cursor] = js.native
  
  def get(by: GetCollectionOptions): js.Promise[Any] = js.native
  
  def limit(number: Double): Any = js.native
  
  def limitToLast(number: Double): Any = js.native
  
  def offset(number: Double): Any = js.native
  
  def orderBy(field: String): Any = js.native
  
  def parent(key: String): Any = js.native
  
  def transaction(t: Any): Any = js.native
  
  def where(field: String, operator: String, value: String): Any = js.native
}
