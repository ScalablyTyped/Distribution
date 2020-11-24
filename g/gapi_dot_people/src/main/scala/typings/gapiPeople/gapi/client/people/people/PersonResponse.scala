package typings.gapiPeople.gapi.client.people.people

import typings.gapiPeople.gapi.client.people.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonResponse extends js.Object {
  
  var httpStatusCode: Double = js.native
  
  var person: Person = js.native
  
  var requestedResourceName: String = js.native
}
object PersonResponse {
  
  @scala.inline
  def apply(httpStatusCode: Double, person: Person, requestedResourceName: String): PersonResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any], requestedResourceName = requestedResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonResponse]
  }
  
  @scala.inline
  implicit class PersonResponseOps[Self <: PersonResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerson(value: Person): Self = this.set("person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = this.set("requestedResourceName", value.asInstanceOf[js.Any])
  }
}
