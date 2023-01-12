package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableLoggingOptions
  extends StObject
     with PreconditionOptions {
  
  var bucket: js.UndefOr[String | Bucket] = js.undefined
  
  var prefix: String
}
object EnableLoggingOptions {
  
  inline def apply(prefix: String): EnableLoggingOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableLoggingOptions] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String | Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
