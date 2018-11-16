package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * External repository which contains detailed report related with observedSeq in this resource
     */

trait SequenceRepository extends BackboneElement {
  /**
           * Contains extended information for property 'datasetId'.
           */
  var _datasetId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'readsetId'.
           */
  var _readsetId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'variantsetId'.
           */
  var _variantsetId: js.UndefOr[Element] = js.undefined
  /**
           * Id of the dataset that used to call for dataset in repository
           */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Repository's name
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Id of the read
           */
  var readsetId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * directlink | openapi | login | oauth | other
           */
  var `type`: code
  /**
           * URI of the repository
           */
  var url: js.UndefOr[uri] = js.undefined
  /**
           * Id of the variantset that used to call for variantset in repository
           */
  var variantsetId: js.UndefOr[java.lang.String] = js.undefined
}

