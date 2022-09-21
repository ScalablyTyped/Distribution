package typings.fhir.mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScript
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _multiserver: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[TestScriptContact]] = js.undefined
  
  /**
    * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A free text natural language description of the TestScript and its use.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of TestScripts that are appropriate for use vs. not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
    */
  var fixture: js.UndefOr[js.Array[TestScriptFixture]] = js.undefined
  
  /**
    * Identifier for the TestScript assigned for external purposes outside the context of FHIR.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The required capability must exist and are assumed to function correctly on the FHIR server being tested.
    */
  var metadata: js.UndefOr[TestScriptMetadata] = js.undefined
  
  /**
    * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
    */
  var multiserver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A free text natural language name identifying the TestScript.
    */
  var name: String
  
  /**
    * Reference to the profile to be used for validation.
    */
  var profile: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Helps establish the "authority/credibility" of the Test Script.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Explains why this Test Script is needed and why it's been constrained as it has.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_TestScript: typings.fhir.fhirStrings.TestScript
  
  /**
    * A series of required setup operations before tests are executed.
    */
  var setup: js.UndefOr[TestScriptSetup] = js.undefined
  
  /**
    * Allows filtering of TestScripts that are appropriate for use vs. not.
    */
  var status: draft | active | retired
  
  /**
    * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
    */
  var teardown: js.UndefOr[TestScriptTeardown] = js.undefined
  
  /**
    * A test in this script.
    */
  var test: js.UndefOr[js.Array[TestScriptTest]] = js.undefined
  
  /**
    * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.
    */
  var url: String
  
  /**
    * Assist in searching for appropriate content.
    */
  var useContext: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Variable is set based either on element value in response body or on header field value in the response headers.
    */
  var variable: js.UndefOr[js.Array[TestScriptVariable]] = js.undefined
  
  /**
    * There may be multiple resource versions of the TestScript that have this same identifier. The resource version id will change for technical reasons, whereas the stated version number needs to be under the author's control.
    */
  var version: js.UndefOr[String] = js.undefined
}
object TestScript {
  
  inline def apply(name: String, status: draft | active | retired, url: String): TestScript = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = "TestScript", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScript]
  }
  
  extension [Self <: TestScript](x: Self) {
    
    inline def setContact(value: js.Array[TestScriptContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: TestScriptContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFixture(value: js.Array[TestScriptFixture]): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
    
    inline def setFixtureUndefined: Self = StObject.set(x, "fixture", js.undefined)
    
    inline def setFixtureVarargs(value: TestScriptFixture*): Self = StObject.set(x, "fixture", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMetadata(value: TestScriptMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMultiserver(value: Boolean): Self = StObject.set(x, "multiserver", value.asInstanceOf[js.Any])
    
    inline def setMultiserverUndefined: Self = StObject.set(x, "multiserver", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: js.Array[Reference]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: Reference*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.TestScript): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSetup(value: TestScriptSetup): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTeardown(value: TestScriptTeardown): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
    
    inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    
    inline def setTest(value: js.Array[TestScriptTest]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: TestScriptTest*): Self = StObject.set(x, "test", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[CodeableConcept]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: CodeableConcept*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVariable(value: js.Array[TestScriptVariable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: TestScriptVariable*): Self = StObject.set(x, "variable", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_multiserver(value: Element): Self = StObject.set(x, "_multiserver", value.asInstanceOf[js.Any])
    
    inline def set_multiserverUndefined: Self = StObject.set(x, "_multiserver", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    inline def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
