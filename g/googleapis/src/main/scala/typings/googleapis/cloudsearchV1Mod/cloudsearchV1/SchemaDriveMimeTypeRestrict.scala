package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive mime-type search restricts (e.g. &quot;type:pdf&quot;).
  */
trait SchemaDriveMimeTypeRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDriveMimeTypeRestrict {
  
  @scala.inline
  def apply(): SchemaDriveMimeTypeRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveMimeTypeRestrict]
  }
  
  @scala.inline
  implicit class SchemaDriveMimeTypeRestrictMutableBuilder[Self <: SchemaDriveMimeTypeRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
