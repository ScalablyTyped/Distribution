package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTarget extends StObject {
  
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  
  var target: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Target
}
object TargetTarget {
  
  inline def apply(target: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Target): TargetTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetTarget] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: ApiClientObjectMap[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTarget(value: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
