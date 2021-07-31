package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail Intelligent restricts (i.e. smartlabels, important).
  */
trait SchemaGmailIntelligentRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGmailIntelligentRestrict {
  
  @scala.inline
  def apply(): SchemaGmailIntelligentRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailIntelligentRestrict]
  }
  
  @scala.inline
  implicit class SchemaGmailIntelligentRestrictMutableBuilder[Self <: SchemaGmailIntelligentRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
