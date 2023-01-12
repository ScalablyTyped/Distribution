package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  var bucket: js.UndefOr[js.Function1[/* parentSchemas */ js.UndefOr[Any], Add]] = js.undefined
  
  var compilersFactory: js.UndefOr[BuildSerializer] = js.undefined
}
object Bucket {
  
  inline def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: /* parentSchemas */ js.UndefOr[Any] => Add): Self = StObject.set(x, "bucket", js.Any.fromFunction1(value))
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setCompilersFactory(value: BuildSerializer): Self = StObject.set(x, "compilersFactory", value.asInstanceOf[js.Any])
    
    inline def setCompilersFactoryUndefined: Self = StObject.set(x, "compilersFactory", js.undefined)
  }
}
