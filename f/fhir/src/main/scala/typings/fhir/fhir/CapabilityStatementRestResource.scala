package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource served on the REST interface
  */
@js.native
trait CapabilityStatementRestResource extends BackboneElement {
  /**
    * Contains extended information for property 'conditionalCreate'.
    */
  var _conditionalCreate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'conditionalDelete'.
    */
  var _conditionalDelete: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'conditionalRead'.
    */
  var _conditionalRead: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'conditionalUpdate'.
    */
  var _conditionalUpdate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'readHistory'.
    */
  var _readHistory: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'referencePolicy'.
    */
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'searchInclude'.
    */
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'searchRevInclude'.
    */
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'updateCreate'.
    */
  var _updateCreate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.native
  /**
    * If allows/uses conditional create
    */
  var conditionalCreate: js.UndefOr[Boolean] = js.native
  /**
    * not-supported | single | multiple - how conditional delete is supported
    */
  var conditionalDelete: js.UndefOr[code] = js.native
  /**
    * not-supported | modified-since | not-match | full-support
    */
  var conditionalRead: js.UndefOr[code] = js.native
  /**
    * If allows/uses conditional update
    */
  var conditionalUpdate: js.UndefOr[Boolean] = js.native
  /**
    * Additional information about the use of the resource type
    */
  var documentation: js.UndefOr[markdown] = js.native
  /**
    * What operations are supported?
    */
  var interaction: js.Array[CapabilityStatementRestResourceInteraction] = js.native
  /**
    * Base System profile for all uses of resource
    */
  var profile: js.UndefOr[Reference] = js.native
  /**
    * Whether vRead can return past versions
    */
  var readHistory: js.UndefOr[Boolean] = js.native
  /**
    * literal | logical | resolves | enforced | local
    */
  var referencePolicy: js.UndefOr[js.Array[code]] = js.native
  /**
    * _include values supported by the server
    */
  var searchInclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Search parameters supported by implementation
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.native
  /**
    * _revinclude values supported by the server
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * A resource type that is supported
    */
  var `type`: code = js.native
  /**
    * If update can commit to a new identity
    */
  var updateCreate: js.UndefOr[Boolean] = js.native
  /**
    * no-version | versioned | versioned-update
    */
  var versioning: js.UndefOr[code] = js.native
}

object CapabilityStatementRestResource {
  @scala.inline
  def apply(interaction: js.Array[CapabilityStatementRestResourceInteraction], `type`: code): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
  @scala.inline
  implicit class CapabilityStatementRestResourceOps[Self <: CapabilityStatementRestResource] (val x: Self) extends AnyVal {
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
    def setInteractionVarargs(value: CapabilityStatementRestResourceInteraction*): Self = this.set("interaction", js.Array(value :_*))
    @scala.inline
    def setInteraction(value: js.Array[CapabilityStatementRestResourceInteraction]): Self = this.set("interaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_conditionalCreate(value: Element): Self = this.set("_conditionalCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_conditionalCreate: Self = this.set("_conditionalCreate", js.undefined)
    @scala.inline
    def set_conditionalDelete(value: Element): Self = this.set("_conditionalDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_conditionalDelete: Self = this.set("_conditionalDelete", js.undefined)
    @scala.inline
    def set_conditionalRead(value: Element): Self = this.set("_conditionalRead", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_conditionalRead: Self = this.set("_conditionalRead", js.undefined)
    @scala.inline
    def set_conditionalUpdate(value: Element): Self = this.set("_conditionalUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_conditionalUpdate: Self = this.set("_conditionalUpdate", js.undefined)
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_readHistory(value: Element): Self = this.set("_readHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_readHistory: Self = this.set("_readHistory", js.undefined)
    @scala.inline
    def set_referencePolicyVarargs(value: Element*): Self = this.set("_referencePolicy", js.Array(value :_*))
    @scala.inline
    def set_referencePolicy(value: js.Array[Element]): Self = this.set("_referencePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_referencePolicy: Self = this.set("_referencePolicy", js.undefined)
    @scala.inline
    def set_searchIncludeVarargs(value: Element*): Self = this.set("_searchInclude", js.Array(value :_*))
    @scala.inline
    def set_searchInclude(value: js.Array[Element]): Self = this.set("_searchInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_searchInclude: Self = this.set("_searchInclude", js.undefined)
    @scala.inline
    def set_searchRevIncludeVarargs(value: Element*): Self = this.set("_searchRevInclude", js.Array(value :_*))
    @scala.inline
    def set_searchRevInclude(value: js.Array[Element]): Self = this.set("_searchRevInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_searchRevInclude: Self = this.set("_searchRevInclude", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_updateCreate(value: Element): Self = this.set("_updateCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_updateCreate: Self = this.set("_updateCreate", js.undefined)
    @scala.inline
    def set_versioning(value: Element): Self = this.set("_versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_versioning: Self = this.set("_versioning", js.undefined)
    @scala.inline
    def setConditionalCreate(value: Boolean): Self = this.set("conditionalCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalCreate: Self = this.set("conditionalCreate", js.undefined)
    @scala.inline
    def setConditionalDelete(value: code): Self = this.set("conditionalDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalDelete: Self = this.set("conditionalDelete", js.undefined)
    @scala.inline
    def setConditionalRead(value: code): Self = this.set("conditionalRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalRead: Self = this.set("conditionalRead", js.undefined)
    @scala.inline
    def setConditionalUpdate(value: Boolean): Self = this.set("conditionalUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalUpdate: Self = this.set("conditionalUpdate", js.undefined)
    @scala.inline
    def setDocumentation(value: markdown): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setProfile(value: Reference): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setReadHistory(value: Boolean): Self = this.set("readHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadHistory: Self = this.set("readHistory", js.undefined)
    @scala.inline
    def setReferencePolicyVarargs(value: code*): Self = this.set("referencePolicy", js.Array(value :_*))
    @scala.inline
    def setReferencePolicy(value: js.Array[code]): Self = this.set("referencePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencePolicy: Self = this.set("referencePolicy", js.undefined)
    @scala.inline
    def setSearchIncludeVarargs(value: String*): Self = this.set("searchInclude", js.Array(value :_*))
    @scala.inline
    def setSearchInclude(value: js.Array[String]): Self = this.set("searchInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchInclude: Self = this.set("searchInclude", js.undefined)
    @scala.inline
    def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = this.set("searchParam", js.Array(value :_*))
    @scala.inline
    def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = this.set("searchParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchParam: Self = this.set("searchParam", js.undefined)
    @scala.inline
    def setSearchRevIncludeVarargs(value: String*): Self = this.set("searchRevInclude", js.Array(value :_*))
    @scala.inline
    def setSearchRevInclude(value: js.Array[String]): Self = this.set("searchRevInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchRevInclude: Self = this.set("searchRevInclude", js.undefined)
    @scala.inline
    def setUpdateCreate(value: Boolean): Self = this.set("updateCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCreate: Self = this.set("updateCreate", js.undefined)
    @scala.inline
    def setVersioning(value: code): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
  }
  
}

