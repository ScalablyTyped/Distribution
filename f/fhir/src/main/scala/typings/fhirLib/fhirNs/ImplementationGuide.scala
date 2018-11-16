package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A set of rules about how FHIR is used
     */

trait ImplementationGuide extends DomainResource {
  /**
           * Contains extended information for property 'binary'.
           */
  var _binary: js.UndefOr[js.Array[Element]] = js.undefined
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
           * Contains extended information for property 'fhirVersion'.
           */
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'publisher'.
           */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'version'.
           */
  var _version: js.UndefOr[Element] = js.undefined
  /**
           * Image, css, script, etc.
           */
  var binary: js.UndefOr[js.Array[uri]] = js.undefined
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
           * Another Implementation guide this depends on
           */
  var dependency: js.UndefOr[js.Array[ImplementationGuideDependency]] = js.undefined
  /**
           * Natural language description of the implementation guide
           */
  var description: js.UndefOr[markdown] = js.undefined
  /**
           * For testing purposes, not real usage
           */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * FHIR Version this Implementation Guide targets
           */
  var fhirVersion: js.UndefOr[id] = js.undefined
  /**
           * Profiles that apply globally
           */
  var global: js.UndefOr[js.Array[ImplementationGuideGlobal]] = js.undefined
  /**
           * Intended jurisdiction for implementation guide (if applicable)
           */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Name for this implementation guide (computer friendly)
           */
  var name: java.lang.String
  /**
           * Group of resources as used in .page.package
           */
  var `package`: js.UndefOr[js.Array[ImplementationGuidePackage]] = js.undefined
  /**
           * Page/Section in the Guide
           */
  var page: js.UndefOr[ImplementationGuidePage] = js.undefined
  /**
           * Name of the publisher (organization or individual)
           */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
           * draft | active | retired | unknown
           */
  var status: code
  /**
           * Logical URI to reference this implementation guide (globally unique)
           */
  var url: uri
  /**
           * Context the content is intended to support
           */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
           * Business version of the implementation guide
           */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

