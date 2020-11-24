package typings.fhir.fhir

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
  implicit class SearchParameterOps[Self <: SearchParameter] (val x: Self) extends AnyVal {
    
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
    def setBaseVarargs(value: code*): Self = this.set("base", js.Array(value :_*))
    
    @scala.inline
    def setBase(value: js.Array[code]): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_baseVarargs(value: Element*): Self = this.set("_base", js.Array(value :_*))
    
    @scala.inline
    def set_base(value: js.Array[Element]): Self = this.set("_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_base: Self = this.set("_base", js.undefined)
    
    @scala.inline
    def set_chainVarargs(value: Element*): Self = this.set("_chain", js.Array(value :_*))
    
    @scala.inline
    def set_chain(value: js.Array[Element]): Self = this.set("_chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_chain: Self = this.set("_chain", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_comparatorVarargs(value: Element*): Self = this.set("_comparator", js.Array(value :_*))
    
    @scala.inline
    def set_comparator(value: js.Array[Element]): Self = this.set("_comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comparator: Self = this.set("_comparator", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_derivedFrom(value: Element): Self = this.set("_derivedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_derivedFrom: Self = this.set("_derivedFrom", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    
    @scala.inline
    def set_modifierVarargs(value: Element*): Self = this.set("_modifier", js.Array(value :_*))
    
    @scala.inline
    def set_modifier(value: js.Array[Element]): Self = this.set("_modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_modifier: Self = this.set("_modifier", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_targetVarargs(value: Element*): Self = this.set("_target", js.Array(value :_*))
    
    @scala.inline
    def set_target(value: js.Array[Element]): Self = this.set("_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_target: Self = this.set("_target", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def set_xpath(value: Element): Self = this.set("_xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_xpath: Self = this.set("_xpath", js.undefined)
    
    @scala.inline
    def set_xpathUsage(value: Element): Self = this.set("_xpathUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_xpathUsage: Self = this.set("_xpathUsage", js.undefined)
    
    @scala.inline
    def setChainVarargs(value: String*): Self = this.set("chain", js.Array(value :_*))
    
    @scala.inline
    def setChain(value: js.Array[String]): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    
    @scala.inline
    def setComparatorVarargs(value: code*): Self = this.set("comparator", js.Array(value :_*))
    
    @scala.inline
    def setComparator(value: js.Array[code]): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setComponentVarargs(value: SearchParameterComponent*): Self = this.set("component", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: js.Array[SearchParameterComponent]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDerivedFrom(value: uri): Self = this.set("derivedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDerivedFrom: Self = this.set("derivedFrom", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setModifierVarargs(value: code*): Self = this.set("modifier", js.Array(value :_*))
    
    @scala.inline
    def setModifier(value: js.Array[code]): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: code*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[code]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setXpath(value: String): Self = this.set("xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpath: Self = this.set("xpath", js.undefined)
    
    @scala.inline
    def setXpathUsage(value: code): Self = this.set("xpathUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpathUsage: Self = this.set("xpathUsage", js.undefined)
  }
}
