package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a set of tests
  */
trait TestScript extends DomainResource {
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

