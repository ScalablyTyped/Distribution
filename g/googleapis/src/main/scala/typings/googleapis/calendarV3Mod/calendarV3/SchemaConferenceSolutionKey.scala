package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceSolutionKey extends StObject {
  
  /**
    * The conference solution type. If a client encounters an unfamiliar or
    * empty type, it should still be able to display the entry points. However,
    * it should disallow modifications. The possible values are:   -
    * &quot;eventHangout&quot; for Hangouts for consumers
    * (http://hangouts.google.com) - &quot;eventNamedHangout&quot; for classic
    * Hangouts for G Suite users (http://hangouts.google.com) -
    * &quot;hangoutsMeet&quot; for Hangouts Meet (http://meet.google.com)
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaConferenceSolutionKey {
  
  @scala.inline
  def apply(): SchemaConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceSolutionKey]
  }
  
  @scala.inline
  implicit class SchemaConferenceSolutionKeyMutableBuilder[Self <: SchemaConferenceSolutionKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
