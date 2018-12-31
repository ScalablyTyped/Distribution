package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related artifacts for a knowledge resource
  */
trait RelatedArtifact extends Element {
  /**
    * Contains extended information for property 'citation'.
    */
  var _citation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Bibliographic citation for the artifact
    */
  var citation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Brief description of the related artifact
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What document is being referenced
    */
  var document: js.UndefOr[Attachment] = js.undefined
  /**
    * What resource is being referenced
    */
  var resource: js.UndefOr[Reference] = js.undefined
  /**
    * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
    */
  var `type`: code
  /**
    * Where the artifact can be accessed
    */
  var url: js.UndefOr[uri] = js.undefined
}

