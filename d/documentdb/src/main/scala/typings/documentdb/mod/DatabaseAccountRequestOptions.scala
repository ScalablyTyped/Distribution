package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseAccountRequestOptions
  extends StObject
     with RequestOptions {
  
  /** The endpoint url whose database account needs to be retrieved. If not present, current client's url will be used. */
  var urlConnection: js.UndefOr[String] = js.undefined
}
object DatabaseAccountRequestOptions {
  
  @scala.inline
  def apply(): DatabaseAccountRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseAccountRequestOptions]
  }
  
  @scala.inline
  implicit class DatabaseAccountRequestOptionsMutableBuilder[Self <: DatabaseAccountRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlConnection(value: String): Self = StObject.set(x, "urlConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlConnectionUndefined: Self = StObject.set(x, "urlConnection", js.undefined)
  }
}
