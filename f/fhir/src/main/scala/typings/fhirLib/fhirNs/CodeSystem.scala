package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of codes drawn from one or more code systems
  */
trait CodeSystem extends DomainResource {
  /**
    * Contains extended information for property 'caseSensitive'.
    */
  var _caseSensitive: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'compositional'.
    */
  var _compositional: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'hierarchyMeaning'.
    */
  var _hierarchyMeaning: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'valueSet'.
    */
  var _valueSet: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'versionNeeded'.
    */
  var _versionNeeded: js.UndefOr[Element] = js.undefined
  /**
    * If code comparison is case sensitive
    */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If code system defines a post-composition grammar
    */
  var compositional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Concepts in the code system
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * not-present | example | fragment | complete
    */
  var content: code
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Total concepts in the code system
    */
  var count: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the code system
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Filter that can be used in a value set
    */
  var filter: js.UndefOr[js.Array[CodeSystemFilter]] = js.undefined
  /**
    * grouped-by | is-a | part-of | classified-with
    */
  var hierarchyMeaning: js.UndefOr[code] = js.undefined
  /**
    * Additional identifier for the code system
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended jurisdiction for code system (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Name for this code system (computer friendly)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional information supplied about each concept
    */
  var property: js.UndefOr[js.Array[CodeSystemProperty]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this code system is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Name for this code system (human friendly)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logical URI to reference this code system (globally unique) (Coding.system)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Canonical URL for value set with entire code system
    */
  var valueSet: js.UndefOr[uri] = js.undefined
  /**
    * Business version of the code system (Coding.version)
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If definitions are not stable
    */
  var versionNeeded: js.UndefOr[scala.Boolean] = js.undefined
}

