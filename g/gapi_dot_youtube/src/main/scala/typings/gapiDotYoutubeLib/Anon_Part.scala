package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Part extends js.Object {
  /**
               * The hl parameter specifies the language that will be used for text values in the API response.
               */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The id parameter specifies a comma-separated list of the YouTube channel category ID(s) for the resource(s) that are being retrieved. In a guideCategory resource, the id property specifies the YouTube channel category ID.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The part parameter specifies a comma-separated list of one or more guideCategory resource properties that the API response will include. The part names that you can include in the parameter value are id and snippet. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a guideCategory resource, the snippet property contains other properties, such as the category's title. If you set part=snippet, the API response will also contain all of those nested properties.
               */
  var part: java.lang.String
  /**
               * The regionCode parameter instructs the API to return the list of guide categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
               */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
}

