package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleApiYouTubeGuideCategoryResource extends js.Object {
  /**
       * The ETag of the guideCategory resource.
       */
  var etag: java.lang.String
  /**
       * The ID that YouTube uses to uniquely identify the guide category.
       */
  var id: java.lang.String
  /**
       * The type of the API resource. For guideCategory resources, the value will be youtube#guideCategory.
       */
  var kind: java.lang.String
  /**
       * The snippet object contains basic details about the category, such as its title.
       */
  var snippet: Anon_Title
}

