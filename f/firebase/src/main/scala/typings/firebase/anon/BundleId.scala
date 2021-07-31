package typings.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleId extends StObject {
  
  var bundleId: String
}
object BundleId {
  
  @scala.inline
  def apply(bundleId: String): BundleId = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleId]
  }
  
  @scala.inline
  implicit class BundleIdMutableBuilder[Self <: BundleId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
  }
}
