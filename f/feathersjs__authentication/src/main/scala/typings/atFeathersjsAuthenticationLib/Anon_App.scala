package typings
package atFeathersjsAuthenticationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var Service: org.scalablytyped.runtime.Instantiable1[
    /* app */ expressLib.expressMod.eNs.Application, 
    atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.serviceNs.Service[js.Object]
  ]
}

object Anon_App {
  @scala.inline
  def apply(
    Service: org.scalablytyped.runtime.Instantiable1[
      /* app */ expressLib.expressMod.eNs.Application, 
      atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.serviceNs.Service[js.Object]
    ]
  ): Anon_App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Service")(Service)
    __obj.asInstanceOf[Anon_App]
  }
}

