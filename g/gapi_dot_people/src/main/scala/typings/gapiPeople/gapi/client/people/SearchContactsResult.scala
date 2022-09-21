package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchContactsResult extends StObject {
  
  var person: Person
}
object SearchContactsResult {
  
  inline def apply(person: Person): SearchContactsResult = {
    val __obj = js.Dynamic.literal(person = person.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchContactsResult]
  }
  
  extension [Self <: SearchContactsResult](x: Self) {
    
    inline def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
  }
}
