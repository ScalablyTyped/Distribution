package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base Resource
  */
trait ResourceBase extends js.Object {
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.undefined
  /**
    * Logical id of this artifact
    */
  var id: js.UndefOr[id] = js.undefined
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.undefined
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.undefined
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.undefined
}

