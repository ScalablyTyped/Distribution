package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlan
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _copyrightLabel: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _exitCriteria: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _testTools: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  var _versionAlgorithmString: js.UndefOr[Element] = js.undefined
  
  /**
    * The category of the Test Plan - can be acceptance, unit, performance, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A copyright statement relating to the test plan and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the test plan. The short copyright declaration (e.g. (c) '2015+ xyz organization' should be sent in the copyrightLabel element.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The (c) symbol should NOT be included in this string. It will be added by software when rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in the more general 'copyright' element.
    */
  var copyrightLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The date is often not tracked until the resource is published, but may be present on draft content. Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the test plan. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The required criteria to execute the test plan - e.g. preconditions, previous tests...
    */
  var dependency: js.UndefOr[js.Array[TestPlanDependency]] = js.undefined
  
  /**
    * This description can be used to capture details such as comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the test plan as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the test plan is presumed to be the predominant language in the place the test plan was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The threshold or criteria for the test plan to be considered successfully executed - narrative.
    */
  var exitCriteria: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of test plans that are appropriate for use versus not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, and can then identify this test plan outside of FHIR, where it is not possible to use the logical URI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * It may be possible for the test plan to be used in jurisdictions other than those for which it was originally designed or intended.
    * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new 'jurisdiction' code in the useContext element.  (I.e. useContext.code indicating http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and useContext.valueCodeableConcept indicating the jurisdiction.)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the test plan is the organization or individual primarily responsible for the maintenance and upkeep of the test plan. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the test plan. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the test plan Instead, it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is.  This may be used to point to source materials or specifications that drove the structure of this test plan.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_TestPlan: typings.fhir.fhirStrings.TestPlan
  
  /**
    * What is being tested with this Test Plan - a conformance resource, or narrative criteria, or an external reference...
    */
  var scope: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows filtering of test plans that are appropriate for use versus not.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var status: draft | active | retired | unknown
  
  /**
    * The individual test cases that are part of this plan, when they they are made explicit.
    */
  var testCase: js.UndefOr[js.Array[TestPlanTestCase]] = js.undefined
  
  /**
    * A description of test tools to be used in the test plan.
    */
  var testTools: js.UndefOr[String] = js.undefined
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred.  Multiple instances may share the same URL if they have a distinct version.
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author.  Considerations for making this decision are found in [Technical and Business Versions](resource.html#versions).
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the [meta.source](resource.html#meta) element to indicate where the current master source of the resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different test plan instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the test plan with the format [url]|[version]. The version SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
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
object TestPlan {
  
  inline def apply(status: draft | active | retired | unknown): TestPlan = {
    val __obj = js.Dynamic.literal(resourceType = "TestPlan", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlan] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightLabel(value: String): Self = StObject.set(x, "copyrightLabel", value.asInstanceOf[js.Any])
    
    inline def setCopyrightLabelUndefined: Self = StObject.set(x, "copyrightLabel", js.undefined)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDependency(value: js.Array[TestPlanDependency]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependencyVarargs(value: TestPlanDependency*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExitCriteria(value: String): Self = StObject.set(x, "exitCriteria", value.asInstanceOf[js.Any])
    
    inline def setExitCriteriaUndefined: Self = StObject.set(x, "exitCriteria", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.TestPlan): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScope(value: js.Array[Reference]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: Reference*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTestCase(value: js.Array[TestPlanTestCase]): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    inline def setTestCaseVarargs(value: TestPlanTestCase*): Self = StObject.set(x, "testCase", js.Array(value*))
    
    inline def setTestTools(value: String): Self = StObject.set(x, "testTools", value.asInstanceOf[js.Any])
    
    inline def setTestToolsUndefined: Self = StObject.set(x, "testTools", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmCoding(value: Coding): Self = StObject.set(x, "versionAlgorithmCoding", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmCodingUndefined: Self = StObject.set(x, "versionAlgorithmCoding", js.undefined)
    
    inline def setVersionAlgorithmString(value: String): Self = StObject.set(x, "versionAlgorithmString", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmStringUndefined: Self = StObject.set(x, "versionAlgorithmString", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightLabel(value: Element): Self = StObject.set(x, "_copyrightLabel", value.asInstanceOf[js.Any])
    
    inline def set_copyrightLabelUndefined: Self = StObject.set(x, "_copyrightLabel", js.undefined)
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_exitCriteria(value: Element): Self = StObject.set(x, "_exitCriteria", value.asInstanceOf[js.Any])
    
    inline def set_exitCriteriaUndefined: Self = StObject.set(x, "_exitCriteria", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_testTools(value: Element): Self = StObject.set(x, "_testTools", value.asInstanceOf[js.Any])
    
    inline def set_testToolsUndefined: Self = StObject.set(x, "_testTools", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionAlgorithmString(value: Element): Self = StObject.set(x, "_versionAlgorithmString", value.asInstanceOf[js.Any])
    
    inline def set_versionAlgorithmStringUndefined: Self = StObject.set(x, "_versionAlgorithmString", js.undefined)
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
