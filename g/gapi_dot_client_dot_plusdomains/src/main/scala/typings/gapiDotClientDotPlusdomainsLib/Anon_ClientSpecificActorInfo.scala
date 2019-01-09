package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientSpecificActorInfo extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[Anon_YoutubeActorInfo] = js.undefined
  /** The name of the actor, suitable for display. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the actor's Person resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The image representation of the actor. */
  var image: js.UndefOr[Anon_Url] = js.undefined
  /** An object representation of the individual components of name. */
  var name: js.UndefOr[Anon_FamilyName] = js.undefined
  /** The link to the actor's Google profile. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Verification status of actor. */
  var verification: js.UndefOr[Anon_AdHocVerified] = js.undefined
}

