package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheKey extends StObject {
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[NoteFilter] = js.native
  
  var noteGuid: js.UndefOr[String] = js.native
  
  var plainText: js.UndefOr[String] = js.native
  
  var referenceUri: js.UndefOr[String] = js.native
}
object CacheKey {
  
  @scala.inline
  def apply(): CacheKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKey]
  }
  
  @scala.inline
  implicit class CacheKeyMutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setFilter(value: NoteFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setNoteGuid(value: String): Self = StObject.set(x, "noteGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteGuidUndefined: Self = StObject.set(x, "noteGuid", js.undefined)
    
    @scala.inline
    def setPlainText(value: String): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainTextUndefined: Self = StObject.set(x, "plainText", js.undefined)
    
    @scala.inline
    def setReferenceUri(value: String): Self = StObject.set(x, "referenceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUriUndefined: Self = StObject.set(x, "referenceUri", js.undefined)
  }
}
