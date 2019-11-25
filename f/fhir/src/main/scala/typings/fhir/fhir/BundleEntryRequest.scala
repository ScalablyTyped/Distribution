package typings.fhir.fhir

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
  var ifMatch: js.UndefOr[String] = js.undefined
  /**
    * For managing update contention
    */
  var ifModifiedSince: js.UndefOr[instant] = js.undefined
  /**
    * For conditional creates
    */
  var ifNoneExist: js.UndefOr[String] = js.undefined
  /**
    * For managing cache currency
    */
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  /**
    * GET | POST | PUT | DELETE
    */
  var method: code
  /**
    * URL for HTTP equivalent of this entry
    */
  var url: uri
}

object BundleEntryRequest {
  @scala.inline
  def apply(
    method: code,
    url: uri,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _ifMatch: Element = null,
    _ifModifiedSince: Element = null,
    _ifNoneExist: Element = null,
    _ifNoneMatch: Element = null,
    _method: Element = null,
    _url: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    ifMatch: String = null,
    ifModifiedSince: instant = null,
    ifNoneExist: String = null,
    ifNoneMatch: String = null,
    modifierExtension: js.Array[Extension] = null
  ): BundleEntryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_ifMatch != null) __obj.updateDynamic("_ifMatch")(_ifMatch.asInstanceOf[js.Any])
    if (_ifModifiedSince != null) __obj.updateDynamic("_ifModifiedSince")(_ifModifiedSince.asInstanceOf[js.Any])
    if (_ifNoneExist != null) __obj.updateDynamic("_ifNoneExist")(_ifNoneExist.asInstanceOf[js.Any])
    if (_ifNoneMatch != null) __obj.updateDynamic("_ifNoneMatch")(_ifNoneMatch.asInstanceOf[js.Any])
    if (_method != null) __obj.updateDynamic("_method")(_method.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ifMatch != null) __obj.updateDynamic("ifMatch")(ifMatch.asInstanceOf[js.Any])
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince.asInstanceOf[js.Any])
    if (ifNoneExist != null) __obj.updateDynamic("ifNoneExist")(ifNoneExist.asInstanceOf[js.Any])
    if (ifNoneMatch != null) __obj.updateDynamic("ifNoneMatch")(ifNoneMatch.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryRequest]
  }
}

