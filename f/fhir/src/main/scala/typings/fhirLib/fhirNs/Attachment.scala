package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content in a format defined elsewhere
  */
trait Attachment extends Element {
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'creation'.
    */
  var _creation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'hash'.
    */
  var _hash: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'size'.
    */
  var _size: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Mime type of the content, with charset etc.
    */
  var contentType: js.UndefOr[code] = js.undefined
  /**
    * Date attachment was first created
    */
  var creation: js.UndefOr[dateTime] = js.undefined
  /**
    * Data inline, base64ed
    */
  var data: js.UndefOr[base64Binary] = js.undefined
  /**
    * Hash of the data (sha-1, base64ed)
    */
  var hash: js.UndefOr[base64Binary] = js.undefined
  /**
    * Human language of the content (BCP-47)
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Number of bytes of content (if url provided)
    */
  var size: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Label to display in place of the data
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Uri where the data can be found
    */
  var url: js.UndefOr[uri] = js.undefined
}

