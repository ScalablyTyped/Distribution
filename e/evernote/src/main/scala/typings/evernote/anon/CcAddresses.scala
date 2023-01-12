package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcAddresses extends StObject {
  
  var ccAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var guid: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var note: js.UndefOr[typings.evernote.mod.Types.Note] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var toAddresses: js.UndefOr[js.Array[String]] = js.undefined
}
object CcAddresses {
  
  inline def apply(): CcAddresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CcAddresses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcAddresses] (val x: Self) extends AnyVal {
    
    inline def setCcAddresses(value: js.Array[String]): Self = StObject.set(x, "ccAddresses", value.asInstanceOf[js.Any])
    
    inline def setCcAddressesUndefined: Self = StObject.set(x, "ccAddresses", js.undefined)
    
    inline def setCcAddressesVarargs(value: String*): Self = StObject.set(x, "ccAddresses", js.Array(value*))
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNote(value: typings.evernote.mod.Types.Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setToAddresses(value: js.Array[String]): Self = StObject.set(x, "toAddresses", value.asInstanceOf[js.Any])
    
    inline def setToAddressesUndefined: Self = StObject.set(x, "toAddresses", js.undefined)
    
    inline def setToAddressesVarargs(value: String*): Self = StObject.set(x, "toAddresses", js.Array(value*))
  }
}
