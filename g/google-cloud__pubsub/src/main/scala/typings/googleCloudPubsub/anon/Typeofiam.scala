package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofiam extends StObject {
  
  /** Namespace v1. */
  val v1: Typeofv1
}
object Typeofiam {
  
  inline def apply(v1: Typeofv1): Typeofiam = {
    val __obj = js.Dynamic.literal(v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofiam]
  }
  
  extension [Self <: Typeofiam](x: Self) {
    
    inline def setV1(value: Typeofv1): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
