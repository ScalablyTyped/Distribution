package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Resource in the implementation guide
     */

trait ImplementationGuidePackageResource extends BackboneElement {
  /**
           * Contains extended information for property 'acronym'.
           */
  var _acronym: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'example'.
           */
  var _example: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sourceUri'.
           */
  var _sourceUri: js.UndefOr[Element] = js.undefined
  /**
           * Short code to identify the resource
           */
  var acronym: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Reason why included in guide
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If not an example, has its normal meaning
           */
  var example: scala.Boolean
  /**
           * Resource this is an example of (if applicable)
           */
  var exampleFor: js.UndefOr[Reference] = js.undefined
  /**
           * Human Name for the resource
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Location of the resource
           */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  /**
           * Location of the resource
           */
  var sourceUri: js.UndefOr[uri] = js.undefined
}

