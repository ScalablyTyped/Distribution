package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search Parameter for a resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait SearchParameter extends DomainResource {
  
  /**
    * Contains extended information for property 'base'.
    */
  var _base: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'chain'.
    */
  var _chain: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'comparator'.
    */
  var _comparator: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'derivedFrom'.
    */
  var _derivedFrom: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'modifier'.
    */
  var _modifier: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'xpath'.
    */
  var _xpath: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'xpathUsage'.
    */
  var _xpathUsage: js.UndefOr[Element] = js.native
  
  /**
    * The resource type(s) this search parameter applies to
    */
  var base: js.Array[code] = js.native
  
  /**
    * Chained names supported
    */
  var chain: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Code used in URL
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * eq | ne | gt | lt | ge | le | sa | eb | ap
    */
  var comparator: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * For Composite resources to define the parts
    */
  var component: js.UndefOr[js.Array[SearchParameterComponent]] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Original Definition for the search parameter
    */
  var derivedFrom: js.UndefOr[uri] = js.native
  
  /**
    * Natural language description of the search parameter
    */
  var description: markdown = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * FHIRPath expression that extracts the values
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * Intended jurisdiction for search parameter (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * missing | exact | contains | not | text | in | not-in | below | above | type
    */
  var modifier: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * Name for this search parameter (computer friendly)
    */
  var name: String = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this search parameter is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Types of resource (if a resource reference)
    */
  var target: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var `type`: code = js.native
  
  /**
    * Logical URI to reference this search parameter (globally unique)
    */
  var url: uri = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the search parameter
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * XPath that extracts the values
    */
  var xpath: js.UndefOr[String] = js.native
  
  /**
    * normal | phonetic | nearby | distance | other
    */
  var xpathUsage: js.UndefOr[code] = js.native
}
object SearchParameter {
  
  @scala.inline
  def apply(
    base: js.Array[code],
    code: code,
    description: markdown,
    name: String,
    status: code,
    `type`: code,
    url: uri
  ): SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameter]
  }
  
  @scala.inline
  implicit class SearchParameterMutableBuilder[Self <: SearchParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: js.Array[code]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVarargs(value: code*): Self = StObject.set(x, "base", js.Array(value :_*))
    
    @scala.inline
    def setChain(value: js.Array[String]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    @scala.inline
    def setChainVarargs(value: String*): Self = StObject.set(x, "chain", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparator(value: js.Array[code]): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setComparatorVarargs(value: code*): Self = StObject.set(x, "comparator", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: js.Array[SearchParameterComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setComponentVarargs(value: SearchParameterComponent*): Self = StObject.set(x, "component", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDerivedFrom(value: uri): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setModifier(value: js.Array[code]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setModifierVarargs(value: code*): Self = StObject.set(x, "modifier", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Array[code]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: code*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    @scala.inline
    def setXpathUsage(value: code): Self = StObject.set(x, "xpathUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathUsageUndefined: Self = StObject.set(x, "xpathUsage", js.undefined)
    
    @scala.inline
    def set_base(value: js.Array[Element]): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    @scala.inline
    def set_baseVarargs(value: Element*): Self = StObject.set(x, "_base", js.Array(value :_*))
    
    @scala.inline
    def set_chain(value: js.Array[Element]): Self = StObject.set(x, "_chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_chainUndefined: Self = StObject.set(x, "_chain", js.undefined)
    
    @scala.inline
    def set_chainVarargs(value: Element*): Self = StObject.set(x, "_chain", js.Array(value :_*))
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_comparator(value: js.Array[Element]): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    @scala.inline
    def set_comparatorVarargs(value: Element*): Self = StObject.set(x, "_comparator", js.Array(value :_*))
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_derivedFrom(value: Element): Self = StObject.set(x, "_derivedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_derivedFromUndefined: Self = StObject.set(x, "_derivedFrom", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    @scala.inline
    def set_modifier(value: js.Array[Element]): Self = StObject.set(x, "_modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modifierUndefined: Self = StObject.set(x, "_modifier", js.undefined)
    
    @scala.inline
    def set_modifierVarargs(value: Element*): Self = StObject.set(x, "_modifier", js.Array(value :_*))
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_target(value: js.Array[Element]): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    @scala.inline
    def set_targetVarargs(value: Element*): Self = StObject.set(x, "_target", js.Array(value :_*))
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
    
    @scala.inline
    def set_xpath(value: Element): Self = StObject.set(x, "_xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_xpathUndefined: Self = StObject.set(x, "_xpath", js.undefined)
    
    @scala.inline
    def set_xpathUsage(value: Element): Self = StObject.set(x, "_xpathUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_xpathUsageUndefined: Self = StObject.set(x, "_xpathUsage", js.undefined)
  }
}
