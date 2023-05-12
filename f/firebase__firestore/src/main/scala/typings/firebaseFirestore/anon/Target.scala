package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  
  var target: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Target
}
object Target {
  
  inline def apply(target: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Target): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: ApiClientObjectMap[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTarget(value: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
