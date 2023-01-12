package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheKey extends StObject {
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[NoteFilter] = js.undefined
  
  var noteGuid: js.UndefOr[String] = js.undefined
  
  var plainText: js.UndefOr[String] = js.undefined
  
  var referenceUri: js.UndefOr[String] = js.undefined
}
object CacheKey {
  
  inline def apply(): CacheKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setFilter(value: NoteFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNoteGuid(value: String): Self = StObject.set(x, "noteGuid", value.asInstanceOf[js.Any])
    
    inline def setNoteGuidUndefined: Self = StObject.set(x, "noteGuid", js.undefined)
    
    inline def setPlainText(value: String): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
    
    inline def setPlainTextUndefined: Self = StObject.set(x, "plainText", js.undefined)
    
    inline def setReferenceUri(value: String): Self = StObject.set(x, "referenceUri", value.asInstanceOf[js.Any])
    
    inline def setReferenceUriUndefined: Self = StObject.set(x, "referenceUri", js.undefined)
  }
}
