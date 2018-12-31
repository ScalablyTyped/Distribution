package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transaction Related Information
  */
trait BundleEntryRequest extends BackboneElement {
  /**
    * Contains extended information for property 'ifMatch'.
    */
  var _ifMatch: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'ifModifiedSince'.
    */
  var _ifModifiedSince: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'ifNoneExist'.
    */
  var _ifNoneExist: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'ifNoneMatch'.
    */
  var _ifNoneMatch: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'method'.
    */
  var _method: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * For managing update contention
    */
  var ifMatch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For managing update contention
    */
  var ifModifiedSince: js.UndefOr[instant] = js.undefined
  /**
    * For conditional creates
    */
  var ifNoneExist: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For managing cache currency
    */
  var ifNoneMatch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * GET | POST | PUT | DELETE
    */
  var method: code
  /**
    * URL for HTTP equivalent of this entry
    */
  var url: uri
}

