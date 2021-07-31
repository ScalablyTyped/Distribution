package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A guest attributes entry.
  */
trait SchemaGuestAttributes extends StObject {
  
  /**
    * [Output Only] Type of the resource. Always compute#guestAttributes for
    * guest attributes entry.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The path to be queried. This can be the default namespace (&#39;/&#39;)
    * or a nested namespace (&#39;//&#39;) or a specified key (&#39;//&#39;)
    */
  var queryPath: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The value of the requested queried path.
    */
  var queryValue: js.UndefOr[SchemaGuestAttributesValue] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The key to search for.
    */
  var variableKey: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The value found for the requested key.
    */
  var variableValue: js.UndefOr[String] = js.undefined
}
object SchemaGuestAttributes {
  
  @scala.inline
  def apply(): SchemaGuestAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributes]
  }
  
  @scala.inline
  implicit class SchemaGuestAttributesMutableBuilder[Self <: SchemaGuestAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setQueryPath(value: String): Self = StObject.set(x, "queryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPathUndefined: Self = StObject.set(x, "queryPath", js.undefined)
    
    @scala.inline
    def setQueryValue(value: SchemaGuestAttributesValue): Self = StObject.set(x, "queryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryValueUndefined: Self = StObject.set(x, "queryValue", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setVariableKey(value: String): Self = StObject.set(x, "variableKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableKeyUndefined: Self = StObject.set(x, "variableKey", js.undefined)
    
    @scala.inline
    def setVariableValue(value: String): Self = StObject.set(x, "variableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableValueUndefined: Self = StObject.set(x, "variableValue", js.undefined)
  }
}
