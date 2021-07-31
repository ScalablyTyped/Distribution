package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail Time restricts (i.e. received today, this week).
  */
trait SchemaGmailTimeRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGmailTimeRestrict {
  
  @scala.inline
  def apply(): SchemaGmailTimeRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailTimeRestrict]
  }
  
  @scala.inline
  implicit class SchemaGmailTimeRestrictMutableBuilder[Self <: SchemaGmailTimeRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
