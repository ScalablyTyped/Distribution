package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a set of tests
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait TestScript extends DomainResource {
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the test script
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * An abstract server representing a destination or receiver in a message exchange
    */
  var destination: js.UndefOr[js.Array[TestScriptDestination]] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fixture in the test script - by reference (uri)
    */
  var fixture: js.UndefOr[js.Array[TestScriptFixture]] = js.undefined
  /**
    * Additional identifier for the test script
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended jurisdiction for test script (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Required capability that is assumed to function correctly on the FHIR server being tested
    */
  var metadata: js.UndefOr[TestScriptMetadata] = js.undefined
  /**
    * Name for this test script (computer friendly)
    */
  var name: java.lang.String
  /**
    * An abstract server representing a client or sender in a message exchange
    */
  var origin: js.UndefOr[js.Array[TestScriptOrigin]] = js.undefined
  /**
    * Reference of the validation profile
    */
  var profile: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this test script is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Assert rule used within the test script
    */
  var rule: js.UndefOr[js.Array[TestScriptRule]] = js.undefined
  /**
    * Assert ruleset used within the test script
    */
  var ruleset: js.UndefOr[js.Array[TestScriptRuleset]] = js.undefined
  /**
    * A series of required setup operations before tests are executed
    */
  var setup: js.UndefOr[TestScriptSetup] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * A series of required clean up steps
    */
  var teardown: js.UndefOr[TestScriptTeardown] = js.undefined
  /**
    * A test in this script
    */
  var test: js.UndefOr[js.Array[TestScriptTest]] = js.undefined
  /**
    * Name for this test script (human friendly)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logical URI to reference this test script (globally unique)
    */
  var url: uri
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Placeholder for evaluated elements
    */
  var variable: js.UndefOr[js.Array[TestScriptVariable]] = js.undefined
  /**
    * Business version of the test script
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object TestScript {
  @scala.inline
  def apply(
    name: java.lang.String,
    status: code,
    url: uri,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    destination: js.Array[TestScriptDestination] = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fixture: js.Array[TestScriptFixture] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    metadata: TestScriptMetadata = null,
    modifierExtension: js.Array[Extension] = null,
    origin: js.Array[TestScriptOrigin] = null,
    profile: js.Array[Reference] = null,
    publisher: java.lang.String = null,
    purpose: markdown = null,
    resourceType: code = null,
    rule: js.Array[TestScriptRule] = null,
    ruleset: js.Array[TestScriptRuleset] = null,
    setup: TestScriptSetup = null,
    teardown: TestScriptTeardown = null,
    test: js.Array[TestScriptTest] = null,
    text: Narrative = null,
    title: java.lang.String = null,
    useContext: js.Array[UsageContext] = null,
    variable: js.Array[TestScriptVariable] = null,
    version: java.lang.String = null
  ): TestScript = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fixture != null) __obj.updateDynamic("fixture")(fixture)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (ruleset != null) __obj.updateDynamic("ruleset")(ruleset)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (teardown != null) __obj.updateDynamic("teardown")(teardown)
    if (test != null) __obj.updateDynamic("test")(test)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TestScript]
  }
}

