package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLinked extends StObject {
  
  /**
    * Indicates whether the channel data identifies a user that is already linked to either a YouTube username or a Google+ account. A user that has one of these links already has a public YouTube identity, which is a prerequisite for several actions, such as uploading videos.
    */
  var isLinked: Boolean
  
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: String
}
object IsLinked {
  
  inline def apply(isLinked: Boolean, privacyStatus: String): IsLinked = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLinked]
  }
  
  extension [Self <: IsLinked](x: Self) {
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
  }
}
