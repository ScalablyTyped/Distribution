package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a set of tests
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait TestScript extends DomainResource {
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the test script
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * An abstract server representing a destination or receiver in a message exchange
    */
  var destination: js.UndefOr[js.Array[TestScriptDestination]] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * Fixture in the test script - by reference (uri)
    */
  var fixture: js.UndefOr[js.Array[TestScriptFixture]] = js.native
  
  /**
    * Additional identifier for the test script
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Intended jurisdiction for test script (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Required capability that is assumed to function correctly on the FHIR server being tested
    */
  var metadata: js.UndefOr[TestScriptMetadata] = js.native
  
  /**
    * Name for this test script (computer friendly)
    */
  var name: String = js.native
  
  /**
    * An abstract server representing a client or sender in a message exchange
    */
  var origin: js.UndefOr[js.Array[TestScriptOrigin]] = js.native
  
  /**
    * Reference of the validation profile
    */
  var profile: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this test script is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * Assert rule used within the test script
    */
  var rule: js.UndefOr[js.Array[TestScriptRule]] = js.native
  
  /**
    * Assert ruleset used within the test script
    */
  var ruleset: js.UndefOr[js.Array[TestScriptRuleset]] = js.native
  
  /**
    * A series of required setup operations before tests are executed
    */
  var setup: js.UndefOr[TestScriptSetup] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * A series of required clean up steps
    */
  var teardown: js.UndefOr[TestScriptTeardown] = js.native
  
  /**
    * A test in this script
    */
  var test: js.UndefOr[js.Array[TestScriptTest]] = js.native
  
  /**
    * Name for this test script (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Logical URI to reference this test script (globally unique)
    */
  var url: uri = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Placeholder for evaluated elements
    */
  var variable: js.UndefOr[js.Array[TestScriptVariable]] = js.native
  
  /**
    * Business version of the test script
    */
  var version: js.UndefOr[String] = js.native
}
object TestScript {
  
  @scala.inline
  def apply(name: String, status: code, url: uri): TestScript = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScript]
  }
  
  @scala.inline
  implicit class TestScriptOps[Self <: TestScript] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    
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
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestinationVarargs(value: TestScriptDestination*): Self = this.set("destination", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: js.Array[TestScriptDestination]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setFixtureVarargs(value: TestScriptFixture*): Self = this.set("fixture", js.Array(value :_*))
    
    @scala.inline
    def setFixture(value: js.Array[TestScriptFixture]): Self = this.set("fixture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixture: Self = this.set("fixture", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setMetadata(value: TestScriptMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: TestScriptOrigin*): Self = this.set("origin", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: js.Array[TestScriptOrigin]): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setProfileVarargs(value: Reference*): Self = this.set("profile", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: js.Array[Reference]): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: TestScriptRule*): Self = this.set("rule", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: js.Array[TestScriptRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    
    @scala.inline
    def setRulesetVarargs(value: TestScriptRuleset*): Self = this.set("ruleset", js.Array(value :_*))
    
    @scala.inline
    def setRuleset(value: js.Array[TestScriptRuleset]): Self = this.set("ruleset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleset: Self = this.set("ruleset", js.undefined)
    
    @scala.inline
    def setSetup(value: TestScriptSetup): Self = this.set("setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setTeardown(value: TestScriptTeardown): Self = this.set("teardown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: TestScriptTest*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: js.Array[TestScriptTest]): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: TestScriptVariable*): Self = this.set("variable", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[TestScriptVariable]): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
