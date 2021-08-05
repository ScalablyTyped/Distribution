package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotations associated with the plain-text body of the message.  Example
  * plain-text message body: ``` Hello @FooBot how are you!&quot; ```  The
  * corresponding annotations metadata: ``` &quot;annotations&quot;:[{
  * &quot;type&quot;:&quot;USER_MENTION&quot;,   &quot;startIndex&quot;:6,
  * &quot;length&quot;:7,   &quot;userMention&quot;: {     &quot;user&quot;: {
  * &quot;name&quot;:&quot;users/107946847022116401880&quot;,
  * &quot;displayName&quot;:&quot;FooBot&quot;,
  * &quot;avatarUrl&quot;:&quot;https://goo.gl/aeDtrS&quot;,
  * &quot;type&quot;:&quot;BOT&quot;     },
  * &quot;type&quot;:&quot;MENTION&quot;    } }] ```
  */
trait SchemaAnnotation extends StObject {
  
  /**
    * Length of the substring in the plain-text message body this annotation
    * corresponds to.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Start index (0-based, inclusive) in the plain-text message body this
    * annotation corresponds to.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of this annotation.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata of user mention.
    */
  var userMention: js.UndefOr[SchemaUserMentionMetadata] = js.undefined
}
object SchemaAnnotation {
  
  inline def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  
  extension [Self <: SchemaAnnotation](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserMention(value: SchemaUserMentionMetadata): Self = StObject.set(x, "userMention", value.asInstanceOf[js.Any])
    
    inline def setUserMentionUndefined: Self = StObject.set(x, "userMention", js.undefined)
  }
}
