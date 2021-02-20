package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the binary payload of an APK.
  */
@js.native
trait SchemaApkBinary extends StObject {
  
  /**
    * A sha1 hash of the APK payload, encoded as a hex string and matching the
    * output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  
  /**
    * A sha256 hash of the APK payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
}
object SchemaApkBinary {
  
  @scala.inline
  def apply(): SchemaApkBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkBinary]
  }
  
  @scala.inline
  implicit class SchemaApkBinaryMutableBuilder[Self <: SchemaApkBinary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
