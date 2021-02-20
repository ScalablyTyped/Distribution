package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadFileOptions extends StObject {
  
  /**
    * Passed to `url.format()`.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * Passed to `url.format()`.
    */
  var query: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * Passed to `url.format()`.
    */
  var search: js.UndefOr[String] = js.native
}
object LoadFileOptions {
  
  @scala.inline
  def apply(): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFileOptions]
  }
  
  @scala.inline
  implicit class LoadFileOptionsMutableBuilder[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setQuery(value: Record[String, String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
