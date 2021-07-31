package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive follow-up search restricts (e.g. &quot;followup:suggestions&quot;).
  */
trait SchemaDriveFollowUpRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDriveFollowUpRestrict {
  
  @scala.inline
  def apply(): SchemaDriveFollowUpRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveFollowUpRestrict]
  }
  
  @scala.inline
  implicit class SchemaDriveFollowUpRestrictMutableBuilder[Self <: SchemaDriveFollowUpRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
