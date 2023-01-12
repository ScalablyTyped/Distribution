package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeAccount extends StObject {
  
  var includeAccount: js.UndefOr[Boolean] = js.undefined
  
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
}
object IncludeAccount {
  
  inline def apply(): IncludeAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeAccount] (val x: Self) extends AnyVal {
    
    inline def setIncludeAccount(value: Boolean): Self = StObject.set(x, "includeAccount", value.asInstanceOf[js.Any])
    
    inline def setIncludeAccountUndefined: Self = StObject.set(x, "includeAccount", js.undefined)
    
    inline def setIncludeBusinessLinkedNotebooks(value: Boolean): Self = StObject.set(x, "includeBusinessLinkedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setIncludeBusinessLinkedNotebooksUndefined: Self = StObject.set(x, "includeBusinessLinkedNotebooks", js.undefined)
    
    inline def setIncludePersonalLinkedNotebooks(value: Boolean): Self = StObject.set(x, "includePersonalLinkedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setIncludePersonalLinkedNotebooksUndefined: Self = StObject.set(x, "includePersonalLinkedNotebooks", js.undefined)
  }
}
