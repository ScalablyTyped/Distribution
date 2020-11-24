package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonMetadata extends js.Object {
  
  var deleted: Boolean = js.native
  
  var linkedPeopleResourceNames: js.Array[String] = js.native
  
  var objectType: ObjectType = js.native
  
  var previousResourceNames: js.Array[String] = js.native
  
  var sources: js.Array[Source] = js.native
}
object PersonMetadata {
  
  @scala.inline
  def apply(
    deleted: Boolean,
    linkedPeopleResourceNames: js.Array[String],
    objectType: ObjectType,
    previousResourceNames: js.Array[String],
    sources: js.Array[Source]
  ): PersonMetadata = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], linkedPeopleResourceNames = linkedPeopleResourceNames.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], previousResourceNames = previousResourceNames.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonMetadata]
  }
  
  @scala.inline
  implicit class PersonMetadataOps[Self <: PersonMetadata] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPeopleResourceNamesVarargs(value: String*): Self = this.set("linkedPeopleResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setLinkedPeopleResourceNames(value: js.Array[String]): Self = this.set("linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: ObjectType): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousResourceNamesVarargs(value: String*): Self = this.set("previousResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setPreviousResourceNames(value: js.Array[String]): Self = this.set("previousResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
}
