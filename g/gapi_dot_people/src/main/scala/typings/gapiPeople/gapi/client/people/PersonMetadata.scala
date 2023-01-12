package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonMetadata extends StObject {
  
  var deleted: Boolean
  
  var linkedPeopleResourceNames: js.Array[String]
  
  var objectType: ObjectType
  
  var previousResourceNames: js.Array[String]
  
  var sources: js.Array[Source]
}
object PersonMetadata {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PersonMetadata] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setLinkedPeopleResourceNames(value: js.Array[String]): Self = StObject.set(x, "linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    
    inline def setLinkedPeopleResourceNamesVarargs(value: String*): Self = StObject.set(x, "linkedPeopleResourceNames", js.Array(value*))
    
    inline def setObjectType(value: ObjectType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setPreviousResourceNames(value: js.Array[String]): Self = StObject.set(x, "previousResourceNames", value.asInstanceOf[js.Any])
    
    inline def setPreviousResourceNamesVarargs(value: String*): Self = StObject.set(x, "previousResourceNames", js.Array(value*))
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
