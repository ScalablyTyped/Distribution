package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternativePlaceId extends js.Object {
  /**
    * The most likely reason for a place to have an alternative place ID is if your application adds a place and receives
    * an application-scoped place ID, then later receives a Google-scoped place ID after passing the moderation process.
    */
  var place_id: java.lang.String
  /**
    * The scope of an alternative place ID will always be `APP`,
    * indicating that the alternative place ID is recognised by your application only.
    */
  var scope: atGoogleMapsLib.atGoogleMapsLibStrings.APP
}

