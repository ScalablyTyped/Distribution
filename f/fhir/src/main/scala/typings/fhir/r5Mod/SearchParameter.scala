package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`code-text`
import typings.fhir.fhirStrings.`not-in`
import typings.fhir.fhirStrings.`of-type`
import typings.fhir.fhirStrings.`text-advanced`
import typings.fhir.fhirStrings.`type`
import typings.fhir.fhirStrings.above
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.ap
import typings.fhir.fhirStrings.below
import typings.fhir.fhirStrings.composite
import typings.fhir.fhirStrings.contains
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.eb
import typings.fhir.fhirStrings.eq
import typings.fhir.fhirStrings.exact
import typings.fhir.fhirStrings.ge
import typings.fhir.fhirStrings.gt
import typings.fhir.fhirStrings.identifier
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.iterate
import typings.fhir.fhirStrings.le
import typings.fhir.fhirStrings.lt
import typings.fhir.fhirStrings.missing
import typings.fhir.fhirStrings.ne
import typings.fhir.fhirStrings.normal
import typings.fhir.fhirStrings.not
import typings.fhir.fhirStrings.number
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.phonetic
import typings.fhir.fhirStrings.quantity_
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.sa
import typings.fhir.fhirStrings.special
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.text
import typings.fhir.fhirStrings.token
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParameter
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _base: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _chain: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _comparator: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _constraint: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _copyrightLabel: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _derivedFrom: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _modifier: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _multipleAnd: js.UndefOr[Element] = js.undefined
  
  var _multipleOr: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _processingMode: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  var _versionAlgorithmString: js.UndefOr[Element] = js.undefined
  
  /**
    * A search parameter must always apply to at least one resource type. When search parameters apply to more than one resource type, they can be used against any of the listed resource types, or in a cross-type search (see [Cross Resource Search](http.html#xres-search)).
    */
  var base: js.Array[String]
  
  /**
    * Notes:
    * * Not all systems will declare chain values.  If no chain values are specified at all, then no presumptions can be made about the degree of chaining support available
    * * A server may use a single chain value of '*' to mean that all reference search types supported can be chained rather than enumerating all chain values
    * *  If a particular reference search parameter is supported, but not subsequent chaining, then just list that search parameter name - e.g. for Patient.practitioner, the chain value would be ```practitioner```
    * * If a particular reference search parameter is supported with unlimited chaining beneath it, then follow the search parameter name with '.'.  E.g. ```practitioner.```
    * * If there are specific (not unlimited) chaining paths allowed they can be explicitly enumerated.  E.g. ```practitioner.organization```
    */
  var chain: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For maximum compatibility, use only lowercase ASCII characters. Note that HL7 will never define multiple search parameters with the same code.
    */
  var code: String
  
  /**
    * If no comparators are listed, clients should not expect servers to support any comparators.
    */
  var comparator: js.UndefOr[js.Array[eq | ne | gt | lt | ge | le | sa | eb | ap]] = js.undefined
  
  /**
    * Used to define the parts of a composite search parameter.
    */
  var component: js.UndefOr[js.Array[SearchParameterComponent]] = js.undefined
  
  /**
    * FHIRPath expression that defines/sets a complex constraint for when this SearchParameter is applicable.
    */
  var constraint: js.UndefOr[String] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * ...
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The (c) symbol should NOT be included in this string. It will be added by software when rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in the more general 'copyright' element.
    */
  var copyrightLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The date is often not tracked until the resource is published, but may be present on draft content. Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the search parameter. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The intent of this is that a server can designate that it provides support for a search parameter defined in the specification itself (e.g.  [`value-quantity`](http://hl7.org/fhir/SearchParameter/Observation-value-quantity), but detail how it is supported by the server.
    */
  var derivedFrom: js.UndefOr[String] = js.undefined
  
  /**
    * This description can be used to capture details such as comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the search parameter as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the search parameter is presumed to be the predominant language in the place the search parameter was created).
    */
  var description: String
  
  /**
    * Allows filtering of search parameters that are appropriate for use versus not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Note that the elements returned by the expression are sometimes complex elements where logic is required to determine quite how to handle them; e.g. CodeableConcepts may contain text and/or multiple codings, where the codings themselves contain a code and a system. For composite search parameters, the outcome of the expression must a collection of base elements from which the composites are derived.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * A formal identifier that is used to identify this search parameter when it is represented in other formats, or referenced in a specification, model, design or an instance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * It may be possible for the search parameter to be used in jurisdictions other than those for which it was originally designed or intended.
    * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new 'jurisdiction' code in the useContext element.  (I.e. useContext.code indicating http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and useContext.valueCodeableConcept indicating the jurisdiction.)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A modifier supported for the search parameter.
    */
  var modifier: js.UndefOr[
    js.Array[
      missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate
    ]
  ] = js.undefined
  
  /**
    * Whether multiple parameters are allowed - e.g. more than one parameter with the same name. The search matches if all the parameters match.
    */
  var multipleAnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether multiple values are allowed for each time the parameter exists. Values are separated by commas, and the parameter matches if any of the values match.
    */
  var multipleOr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: String
  
  /**
    * How the search parameter relates to the set of elements returned by evaluating the expression query.
    */
  var processingMode: js.UndefOr[normal | phonetic | other] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the search parameter is the organization or individual primarily responsible for the maintenance and upkeep of the search parameter. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the search parameter. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the search parameter. Instead, it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is.  This may be used to point to source materials or specifications that drove the structure of this search parameter.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SearchParameter: typings.fhir.fhirStrings.SearchParameter
  
  /**
    * Allows filtering of search parameters that are appropriate for use versus not.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var status: draft | active | retired | unknown
  
  /**
    * In some cases, targets may exist for a search parameter that do not exist for the specified FHIRPath for all of the resources identified in SearchParameter.base.  For example, the core clinical-encounter search parameter allows both Encounter and EpisodeOfCare as targets, even though not all of the base resources have EpisodeOfCare as a valid target.
    * However, the list of targets SHOULD cover all targets that might appear that are permitted by the specified FHIRPath.
    */
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of value that a search parameter may contain, and how the content is interpreted.
    */
  var `type`: number | date | string | token | reference | composite | quantity_ | uri | special
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred.  Multiple instances may share the same URL if they have a distinct version.
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author.  Considerations for making this decision are found in [Technical and Business Versions](resource.html#versions).
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the [meta.source](resource.html#meta) element to indicate where the current master source of the resource can be found.
    */
  var url: String
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different search parameter instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the search parameter with the format [url]|[version]. The version SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * If set as a string, this is a FHIRPath expression that has two additional context variables passed in - %version1 and %version2 and will return a negative number if version1 is newer, a positive number if version2 and a 0 if the version ordering can't be successfully be determined.
    */
  var versionAlgorithmCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * If set as a string, this is a FHIRPath expression that has two additional context variables passed in - %version1 and %version2 and will return a negative number if version1 is newer, a positive number if version2 and a 0 if the version ordering can't be successfully be determined.
    */
  var versionAlgorithmString: js.UndefOr[String] = js.undefined
}
object SearchParameter {
  
  inline def apply(
    base: js.Array[String],
    code: String,
    description: String,
    name: String,
    status: draft | active | retired | unknown,
    `type`: number | date | string | token | reference | composite | quantity_ | uri | special,
    url: String
  ): SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "SearchParameter", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchParameter] (val x: Self) extends AnyVal {
    
    inline def setBase(value: js.Array[String]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseVarargs(value: String*): Self = StObject.set(x, "base", js.Array(value*))
    
    inline def setChain(value: js.Array[String]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setChainVarargs(value: String*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComparator(value: js.Array[eq | ne | gt | lt | ge | le | sa | eb | ap]): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setComparatorVarargs(value: (eq | ne | gt | lt | ge | le | sa | eb | ap)*): Self = StObject.set(x, "comparator", js.Array(value*))
    
    inline def setComponent(value: js.Array[SearchParameterComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: SearchParameterComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightLabel(value: String): Self = StObject.set(x, "copyrightLabel", value.asInstanceOf[js.Any])
    
    inline def setCopyrightLabelUndefined: Self = StObject.set(x, "copyrightLabel", js.undefined)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDerivedFrom(value: String): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setModifier(
      value: js.Array[
          missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate
        ]
    ): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(
      value: (missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate)*
    ): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setMultipleAnd(value: Boolean): Self = StObject.set(x, "multipleAnd", value.asInstanceOf[js.Any])
    
    inline def setMultipleAndUndefined: Self = StObject.set(x, "multipleAnd", js.undefined)
    
    inline def setMultipleOr(value: Boolean): Self = StObject.set(x, "multipleOr", value.asInstanceOf[js.Any])
    
    inline def setMultipleOrUndefined: Self = StObject.set(x, "multipleOr", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProcessingMode(value: normal | phonetic | other): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
    
    inline def setProcessingModeUndefined: Self = StObject.set(x, "processingMode", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SearchParameter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: number | date | string | token | reference | composite | quantity_ | uri | special): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmCoding(value: Coding): Self = StObject.set(x, "versionAlgorithmCoding", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmCodingUndefined: Self = StObject.set(x, "versionAlgorithmCoding", js.undefined)
    
    inline def setVersionAlgorithmString(value: String): Self = StObject.set(x, "versionAlgorithmString", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmStringUndefined: Self = StObject.set(x, "versionAlgorithmString", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_base(value: js.Array[Element]): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    inline def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    inline def set_baseVarargs(value: Element*): Self = StObject.set(x, "_base", js.Array(value*))
    
    inline def set_chain(value: js.Array[Element]): Self = StObject.set(x, "_chain", value.asInstanceOf[js.Any])
    
    inline def set_chainUndefined: Self = StObject.set(x, "_chain", js.undefined)
    
    inline def set_chainVarargs(value: Element*): Self = StObject.set(x, "_chain", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comparator(value: js.Array[Element]): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_comparatorVarargs(value: Element*): Self = StObject.set(x, "_comparator", js.Array(value*))
    
    inline def set_constraint(value: Element): Self = StObject.set(x, "_constraint", value.asInstanceOf[js.Any])
    
    inline def set_constraintUndefined: Self = StObject.set(x, "_constraint", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightLabel(value: Element): Self = StObject.set(x, "_copyrightLabel", value.asInstanceOf[js.Any])
    
    inline def set_copyrightLabelUndefined: Self = StObject.set(x, "_copyrightLabel", js.undefined)
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_derivedFrom(value: Element): Self = StObject.set(x, "_derivedFrom", value.asInstanceOf[js.Any])
    
    inline def set_derivedFromUndefined: Self = StObject.set(x, "_derivedFrom", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_modifier(value: js.Array[Element]): Self = StObject.set(x, "_modifier", value.asInstanceOf[js.Any])
    
    inline def set_modifierUndefined: Self = StObject.set(x, "_modifier", js.undefined)
    
    inline def set_modifierVarargs(value: Element*): Self = StObject.set(x, "_modifier", js.Array(value*))
    
    inline def set_multipleAnd(value: Element): Self = StObject.set(x, "_multipleAnd", value.asInstanceOf[js.Any])
    
    inline def set_multipleAndUndefined: Self = StObject.set(x, "_multipleAnd", js.undefined)
    
    inline def set_multipleOr(value: Element): Self = StObject.set(x, "_multipleOr", value.asInstanceOf[js.Any])
    
    inline def set_multipleOrUndefined: Self = StObject.set(x, "_multipleOr", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_processingMode(value: Element): Self = StObject.set(x, "_processingMode", value.asInstanceOf[js.Any])
    
    inline def set_processingModeUndefined: Self = StObject.set(x, "_processingMode", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_target(value: js.Array[Element]): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    inline def set_targetVarargs(value: Element*): Self = StObject.set(x, "_target", js.Array(value*))
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionAlgorithmString(value: Element): Self = StObject.set(x, "_versionAlgorithmString", value.asInstanceOf[js.Any])
    
    inline def set_versionAlgorithmStringUndefined: Self = StObject.set(x, "_versionAlgorithmString", js.undefined)
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
