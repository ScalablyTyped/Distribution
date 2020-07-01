package typings.gapiClientDiscovery.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scopes extends js.Object {
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: {  description? :string}}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.Scopes with TopLevel[js.Any]
  ] = js.undefined
}

object Scopes {
  @scala.inline
  def apply(
    scopes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: {  description? :string}}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.Scopes with TopLevel[js.Any] = null
  ): Scopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
}

