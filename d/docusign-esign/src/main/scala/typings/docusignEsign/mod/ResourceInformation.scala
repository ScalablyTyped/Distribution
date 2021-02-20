package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceInformation extends StObject {
  
  var resources: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
}
object ResourceInformation {
  
  @scala.inline
  def apply(): ResourceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInformation]
  }
  
  @scala.inline
  implicit class ResourceInformationMutableBuilder[Self <: ResourceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResources(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
