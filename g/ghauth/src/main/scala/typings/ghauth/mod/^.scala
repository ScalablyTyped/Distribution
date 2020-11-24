package typings.ghauth.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ghauth", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(authOptions: AuthOptions, callback: js.Function2[/* err */ Error, /* tokenData */ TokenData, Unit]): Unit = js.native
}
