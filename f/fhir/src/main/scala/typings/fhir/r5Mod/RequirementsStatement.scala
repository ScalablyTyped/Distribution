package typings.fhir.r5Mod

import typings.fhir.fhirStrings.MAY
import typings.fhir.fhirStrings.SHALL
import typings.fhir.fhirStrings.SHOULD
import typings.fhir.fhirStrings.`SHOULD-NOT`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequirementsStatement
  extends StObject
     with BackboneElement {
  
  var _conditionality: js.UndefOr[Element] = js.undefined
  
  var _conformance: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _derivedFrom: js.UndefOr[Element] = js.undefined
  
  var _key: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _parent: js.UndefOr[Element] = js.undefined
  
  var _reference: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _requirement: js.UndefOr[Element] = js.undefined
  
  var _satisfiedBy: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * There is no intent that the conditional statement by evaluatable
    */
  var conditionality: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The conformance code is extracted from the requirement to make indexing and display easier. The requirement needs to express the conformance verbs directly in the markdown content. It's not unusual to mix verbs in a single sentence (e.g. System SHALL do X and SHOULD do Y)
    */
  var conformance: js.UndefOr[js.Array[SHALL | SHOULD | MAY | `SHOULD-NOT`]] = js.undefined
  
  /**
    * This can be just a key, if there is only one matching statement in the requirements statements referenced in Requirements.derivedFrom. If there is more than one, it should be in the format ```url#key```
    */
  var derivedFrom: js.UndefOr[String] = js.undefined
  
  /**
    * Refer directly to the statement by {url}#{key}
    */
  var key: String
  
  /**
    * The key is intended for computers, while this is intended for humans. In its absence, the key should be convenient for a human to say (e.g. not a UUID)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Follows the same convention as statement.derivedFrom, where a reference is the canonical of the Requirements followed by '#' and the 'key' of the specific requirement.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to another artifact that created this requirement. This could be a Profile, etc., or external regulation, or business requirements expressed elsewhere.
    */
  var reference: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The actual requirement for human consumption.
    */
  var requirement: String
  
  /**
    * This is for use when the requirement is met be a pre-existing artifact e.g. a rule that's met by the base FHIR spec, or a national implementation guide.
    */
  var satisfiedBy: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
}
object RequirementsStatement {
  
  inline def apply(key: String, requirement: String): RequirementsStatement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], requirement = requirement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequirementsStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequirementsStatement] (val x: Self) extends AnyVal {
    
    inline def setConditionality(value: Boolean): Self = StObject.set(x, "conditionality", value.asInstanceOf[js.Any])
    
    inline def setConditionalityUndefined: Self = StObject.set(x, "conditionality", js.undefined)
    
    inline def setConformance(value: js.Array[SHALL | SHOULD | MAY | `SHOULD-NOT`]): Self = StObject.set(x, "conformance", value.asInstanceOf[js.Any])
    
    inline def setConformanceUndefined: Self = StObject.set(x, "conformance", js.undefined)
    
    inline def setConformanceVarargs(value: (SHALL | SHOULD | MAY | `SHOULD-NOT`)*): Self = StObject.set(x, "conformance", js.Array(value*))
    
    inline def setDerivedFrom(value: String): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReference(value: js.Array[String]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setReferenceVarargs(value: String*): Self = StObject.set(x, "reference", js.Array(value*))
    
    inline def setRequirement(value: String): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
    
    inline def setSatisfiedBy(value: js.Array[String]): Self = StObject.set(x, "satisfiedBy", value.asInstanceOf[js.Any])
    
    inline def setSatisfiedByUndefined: Self = StObject.set(x, "satisfiedBy", js.undefined)
    
    inline def setSatisfiedByVarargs(value: String*): Self = StObject.set(x, "satisfiedBy", js.Array(value*))
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def set_conditionality(value: Element): Self = StObject.set(x, "_conditionality", value.asInstanceOf[js.Any])
    
    inline def set_conditionalityUndefined: Self = StObject.set(x, "_conditionality", js.undefined)
    
    inline def set_conformance(value: js.Array[Element]): Self = StObject.set(x, "_conformance", value.asInstanceOf[js.Any])
    
    inline def set_conformanceUndefined: Self = StObject.set(x, "_conformance", js.undefined)
    
    inline def set_conformanceVarargs(value: Element*): Self = StObject.set(x, "_conformance", js.Array(value*))
    
    inline def set_derivedFrom(value: Element): Self = StObject.set(x, "_derivedFrom", value.asInstanceOf[js.Any])
    
    inline def set_derivedFromUndefined: Self = StObject.set(x, "_derivedFrom", js.undefined)
    
    inline def set_key(value: Element): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_parent(value: Element): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
    
    inline def set_reference(value: js.Array[Element]): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_referenceVarargs(value: Element*): Self = StObject.set(x, "_reference", js.Array(value*))
    
    inline def set_requirement(value: Element): Self = StObject.set(x, "_requirement", value.asInstanceOf[js.Any])
    
    inline def set_requirementUndefined: Self = StObject.set(x, "_requirement", js.undefined)
    
    inline def set_satisfiedBy(value: js.Array[Element]): Self = StObject.set(x, "_satisfiedBy", value.asInstanceOf[js.Any])
    
    inline def set_satisfiedByUndefined: Self = StObject.set(x, "_satisfiedBy", js.undefined)
    
    inline def set_satisfiedByVarargs(value: Element*): Self = StObject.set(x, "_satisfiedBy", js.Array(value*))
  }
}
