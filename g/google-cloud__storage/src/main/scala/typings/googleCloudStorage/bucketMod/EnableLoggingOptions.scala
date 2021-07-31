package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableLoggingOptions extends StObject {
  
  var bucket: js.UndefOr[String | Bucket] = js.undefined
  
  var prefix: String
}
object EnableLoggingOptions {
  
  @scala.inline
  def apply(prefix: String): EnableLoggingOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingOptions]
  }
  
  @scala.inline
  implicit class EnableLoggingOptionsMutableBuilder[Self <: EnableLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String | Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
