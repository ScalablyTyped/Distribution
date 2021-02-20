package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The time span search restrict (e.g. &quot;after:2017-09-11
  * before:2017-09-12&quot;).
  */
@js.native
trait SchemaDriveTimeSpanRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDriveTimeSpanRestrict {
  
  @scala.inline
  def apply(): SchemaDriveTimeSpanRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveTimeSpanRestrict]
  }
  
  @scala.inline
  implicit class SchemaDriveTimeSpanRestrictMutableBuilder[Self <: SchemaDriveTimeSpanRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
