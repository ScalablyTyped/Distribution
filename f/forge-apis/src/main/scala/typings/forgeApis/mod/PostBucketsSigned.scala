package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostBucketsSigned extends StObject {
  
  var minutesExpiration: Double = js.native
}
object PostBucketsSigned {
  
  @scala.inline
  def apply(minutesExpiration: Double): PostBucketsSigned = {
    val __obj = js.Dynamic.literal(minutesExpiration = minutesExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsSigned]
  }
  
  @scala.inline
  implicit class PostBucketsSignedMutableBuilder[Self <: PostBucketsSigned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
  }
}
