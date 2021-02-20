package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An admission whitelist pattern exempts images from checks by admission
  * rules.
  */
@js.native
trait SchemaAdmissionWhitelistPattern extends StObject {
  
  /**
    * An image name pattern to whitelist, in the form `registry/path/to/image`.
    * This supports a trailing `*` as a wildcard, but this is allowed only in
    * text after the `registry/` part.
    */
  var namePattern: js.UndefOr[String] = js.native
}
object SchemaAdmissionWhitelistPattern {
  
  @scala.inline
  def apply(): SchemaAdmissionWhitelistPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmissionWhitelistPattern]
  }
  
  @scala.inline
  implicit class SchemaAdmissionWhitelistPatternMutableBuilder[Self <: SchemaAdmissionWhitelistPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamePattern(value: String): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
  }
}
