package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ascending extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var emphasized: js.UndefOr[String] = js.native
  
  var inactive: js.UndefOr[Boolean] = js.native
  
  var notebookGuid: js.UndefOr[String] = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var tagGuids: js.UndefOr[js.Array[String]] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var words: js.UndefOr[String] = js.native
}
object Ascending {
  
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit class AscendingMutableBuilder[Self <: Ascending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setEmphasized(value: String): Self = StObject.set(x, "emphasized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmphasizedUndefined: Self = StObject.set(x, "emphasized", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setNotebookGuid(value: String): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setTagGuids(value: js.Array[String]): Self = StObject.set(x, "tagGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagGuidsUndefined: Self = StObject.set(x, "tagGuids", js.undefined)
    
    @scala.inline
    def setTagGuidsVarargs(value: String*): Self = StObject.set(x, "tagGuids", js.Array(value :_*))
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
  }
}
