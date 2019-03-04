package typings
package fastifyDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Secret extends js.Object {
  var secret: jsonwebtokenLib.jsonwebtokenMod.Secret
}

object Anon_Secret {
  @scala.inline
  def apply(secret: jsonwebtokenLib.jsonwebtokenMod.Secret): Anon_Secret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Secret]
  }
}

