package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  // The object ID for this page. Object IDs used by
  // Page and PageElement share the same namespace.
  var object_id: java.lang.String
  // The page elements rendered on the page.
  var page_elements: js.Array[PageElement]
  // The properties of the page.
  var page_properties: PageProperties
  // The type of the page.
  var page_type: PagePageType
  // Properties that are specific for each page type. Masters do not require
  // any additional properties.
  var properties: googleDashAppsDashScriptLib.Anon_Layoutproperties
  // The revision ID of the presentation containing this page. Can be used in
  // update requests to assert that the presentation revision hasn't changed
  // since the last read operation. Only populated if the user has edit access
  // to the presentation.
  //
  // The format of the revision ID may change over time, so it should be treated
  // opaquely. A returned revision ID is only guaranteed to be valid for 24
  // hours after it has been returned and cannot be shared across users. If the
  // revision ID is unchanged between calls, then the presentation has not
  // changed. Conversely, a changed ID (for the same presentation and user)
  // usually means the presentation has been updated; however, a changed ID can
  // also be due to internal factors such as ID format changes.
  var revision_id: java.lang.String
}

object Page {
  @scala.inline
  def apply(
    object_id: java.lang.String,
    page_elements: js.Array[PageElement],
    page_properties: PageProperties,
    page_type: PagePageType,
    properties: googleDashAppsDashScriptLib.Anon_Layoutproperties,
    revision_id: java.lang.String
  ): Page = {
    val __obj = js.Dynamic.literal(object_id = object_id, page_elements = page_elements, page_properties = page_properties, page_type = page_type, properties = properties, revision_id = revision_id)
  
    __obj.asInstanceOf[Page]
  }
}

