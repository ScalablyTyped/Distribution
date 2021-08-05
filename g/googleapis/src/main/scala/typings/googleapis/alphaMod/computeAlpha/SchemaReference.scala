package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a reference to a resource.
  */
trait SchemaReference extends StObject {
  
  /**
    * [Output Only] Type of the resource. Always compute#reference for
    * references.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the reference type with no implied semantics. Possible
    * values include:   - MEMBER_OF
    */
  var referenceType: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the resource which refers to the target.
    */
  var referrer: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the resource to which this reference points.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SchemaReference {
  
  inline def apply(): SchemaReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReference]
  }
  
  extension [Self <: SchemaReference](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
    
    inline def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
