package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  
  var target: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Target
}
object Labels {
  
  inline def apply(target: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Target): Labels = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: ApiClientObjectMap[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTarget(value: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
