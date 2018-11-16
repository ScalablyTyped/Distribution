package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A description of decision support service functionality
     */

trait ServiceDefinition extends DomainResource {
  /**
           * Contains extended information for property 'approvalDate'.
           */
  var _approvalDate: js.UndefOr[Element] = js.undefined
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
           * Contains extended information for property 'lastReviewDate'.
           */
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
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
           * Contains extended information for property 'usage'.
           */
  var _usage: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'version'.
           */
  var _version: js.UndefOr[Element] = js.undefined
  /**
           * When the service definition was approved by publisher
           */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
           * Contact details for the publisher
           */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
           * A content contributor
           */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.undefined
  /**
           * Use and/or publishing restrictions
           */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
           * What data is used by the module
           */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  /**
           * Date this was last changed
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Natural language description of the service definition
           */
  var description: js.UndefOr[markdown] = js.undefined
  /**
           * When the service definition is expected to be used
           */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
           * For testing purposes, not real usage
           */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Additional identifier for the service definition
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Intended jurisdiction for service definition (if applicable)
           */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * When the service definition was last reviewed
           */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
           * Name for this service definition (computer friendly)
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Operation to invoke
           */
  var operationDefinition: js.UndefOr[Reference] = js.undefined
  /**
           * Name of the publisher (organization or individual)
           */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Why this service definition is defined
           */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
           * Additional documentation, citations, etc
           */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
           * draft | active | retired | unknown
           */
  var status: code
  /**
           * Name for this service definition (human friendly)
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
           * E.g. Education, Treatment, Assessment, etc
           */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * "when" the module should be invoked
           */
  var trigger: js.UndefOr[js.Array[TriggerDefinition]] = js.undefined
  /**
           * Logical URI to reference this service definition (globally unique)
           */
  var url: js.UndefOr[uri] = js.undefined
  /**
           * Describes the clinical usage of the module
           */
  var usage: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Context the content is intended to support
           */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
           * Business version of the service definition
           */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

