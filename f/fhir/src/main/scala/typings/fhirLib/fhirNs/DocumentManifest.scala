package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list that defines a set of documents
  */
trait DocumentManifest extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Who and/or what authored the manifest
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The items included
    */
  var content: js.Array[DocumentManifestContent]
  /**
    * When this document manifest created
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Other identifiers for the manifest
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Unique Identifier for the set of documents
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended to get notified about this set of documents
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Related things
    */
  var related: js.UndefOr[js.Array[DocumentManifestRelated]] = js.undefined
  /**
    * The source system/application/software
    */
  var source: js.UndefOr[uri] = js.undefined
  /**
    * current | superseded | entered-in-error
    */
  var status: code
  /**
    * The subject of the set of documents
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Kind of document set
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

