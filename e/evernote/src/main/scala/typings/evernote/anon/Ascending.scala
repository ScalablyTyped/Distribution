package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ascending extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var emphasized: js.UndefOr[String] = js.undefined
  
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  var notebookGuid: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Double] = js.undefined
  
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var words: js.UndefOr[String] = js.undefined
}
object Ascending {
  
  inline def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ascending] (val x: Self) extends AnyVal {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setEmphasized(value: String): Self = StObject.set(x, "emphasized", value.asInstanceOf[js.Any])
    
    inline def setEmphasizedUndefined: Self = StObject.set(x, "emphasized", js.undefined)
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setNotebookGuid(value: String): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    inline def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setTagGuids(value: js.Array[String]): Self = StObject.set(x, "tagGuids", value.asInstanceOf[js.Any])
    
    inline def setTagGuidsUndefined: Self = StObject.set(x, "tagGuids", js.undefined)
    
    inline def setTagGuidsVarargs(value: String*): Self = StObject.set(x, "tagGuids", js.Array(value*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
  }
}
