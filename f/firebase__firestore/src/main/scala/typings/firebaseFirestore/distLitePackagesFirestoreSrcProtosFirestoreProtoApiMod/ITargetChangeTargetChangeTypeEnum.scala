package typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITargetChangeTargetChangeTypeEnum extends StObject {
  
  var ADD: TargetChangeTargetChangeType
  
  var CURRENT: TargetChangeTargetChangeType
  
  var NO_CHANGE: TargetChangeTargetChangeType
  
  var REMOVE: TargetChangeTargetChangeType
  
  var RESET: TargetChangeTargetChangeType
  
  def values(): js.Array[TargetChangeTargetChangeType]
}
object ITargetChangeTargetChangeTypeEnum {
  
  inline def apply(
    ADD: TargetChangeTargetChangeType,
    CURRENT: TargetChangeTargetChangeType,
    NO_CHANGE: TargetChangeTargetChangeType,
    REMOVE: TargetChangeTargetChangeType,
    RESET: TargetChangeTargetChangeType,
    values: () => js.Array[TargetChangeTargetChangeType]
  ): ITargetChangeTargetChangeTypeEnum = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], CURRENT = CURRENT.asInstanceOf[js.Any], NO_CHANGE = NO_CHANGE.asInstanceOf[js.Any], REMOVE = REMOVE.asInstanceOf[js.Any], RESET = RESET.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ITargetChangeTargetChangeTypeEnum]
  }
  
  extension [Self <: ITargetChangeTargetChangeTypeEnum](x: Self) {
    
    inline def setADD(value: TargetChangeTargetChangeType): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
    
    inline def setCURRENT(value: TargetChangeTargetChangeType): Self = StObject.set(x, "CURRENT", value.asInstanceOf[js.Any])
    
    inline def setNO_CHANGE(value: TargetChangeTargetChangeType): Self = StObject.set(x, "NO_CHANGE", value.asInstanceOf[js.Any])
    
    inline def setREMOVE(value: TargetChangeTargetChangeType): Self = StObject.set(x, "REMOVE", value.asInstanceOf[js.Any])
    
    inline def setRESET(value: TargetChangeTargetChangeType): Self = StObject.set(x, "RESET", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[TargetChangeTargetChangeType]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
