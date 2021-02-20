package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule for automatically choosing a private key and certificate to
  * authenticate the device to a server.
  */
@js.native
trait SchemaChoosePrivateKeyRule extends StObject {
  
  /**
    * The package names for which outgoing requests are subject to this rule.
    * If no package names are specified, then the rule applies to all packages.
    * For each package name listed, the rule applies to that package and all
    * other packages that shared the same Android UID. The SHA256 hash of the
    * signing key signatures of each package_name will be verified against
    * those provided by Play
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The alias of the private key to be used.
    */
  var privateKeyAlias: js.UndefOr[String] = js.native
  
  /**
    * The URL pattern to match against the URL of the outgoing request. The
    * pattern may contain asterisk (*) wildcards. Any URL is matched if
    * unspecified.
    */
  var urlPattern: js.UndefOr[String] = js.native
}
object SchemaChoosePrivateKeyRule {
  
  @scala.inline
  def apply(): SchemaChoosePrivateKeyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChoosePrivateKeyRule]
  }
  
  @scala.inline
  implicit class SchemaChoosePrivateKeyRuleMutableBuilder[Self <: SchemaChoosePrivateKeyRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    @scala.inline
    def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeyAlias(value: String): Self = StObject.set(x, "privateKeyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyAliasUndefined: Self = StObject.set(x, "privateKeyAlias", js.undefined)
    
    @scala.inline
    def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}
