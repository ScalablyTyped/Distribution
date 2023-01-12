package typings.fhir.r4Mod

import typings.fhir.fhirStrings.applicability
import typings.fhir.fhirStrings.start
import typings.fhir.fhirStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestGroupActionCondition
  extends StObject
     with BackboneElement {
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  /**
    * The expression may be inlined, or may be a reference to a named expression within a logic library referenced by the library element.
    */
  var expression: js.UndefOr[Expression] = js.undefined
  
  /**
    * Applicability criteria are used to determine immediate applicability when a plan definition is applied to a given context. Start and stop criteria are carried through application and used to describe enter/exit criteria for an action.
    */
  var kind: applicability | start | stop
}
object RequestGroupActionCondition {
  
  inline def apply(kind: applicability | start | stop): RequestGroupActionCondition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestGroupActionCondition] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setKind(value: applicability | start | stop): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
  }
}
