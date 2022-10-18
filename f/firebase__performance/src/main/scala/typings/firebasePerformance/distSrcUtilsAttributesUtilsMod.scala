package typings.firebasePerformance

import typings.firebasePerformance.firebasePerformanceInts.`0`
import typings.firebasePerformance.firebasePerformanceInts.`1`
import typings.firebasePerformance.firebasePerformanceInts.`2`
import typings.firebasePerformance.firebasePerformanceInts.`3`
import typings.firebasePerformance.firebasePerformanceInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsAttributesUtilsMod {
  
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait VisibilityState extends StObject
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "VisibilityState")
  @js.native
  object VisibilityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VisibilityState & Double] = js.native
    
    @js.native
    sealed trait HIDDEN
      extends StObject
         with VisibilityState
    /* 2 */ val HIDDEN: typings.firebasePerformance.distSrcUtilsAttributesUtilsMod.VisibilityState.HIDDEN & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with VisibilityState
    /* 0 */ val UNKNOWN: typings.firebasePerformance.distSrcUtilsAttributesUtilsMod.VisibilityState.UNKNOWN & Double = js.native
    
    @js.native
    sealed trait VISIBLE
      extends StObject
         with VisibilityState
    /* 1 */ val VISIBLE: typings.firebasePerformance.distSrcUtilsAttributesUtilsMod.VisibilityState.VISIBLE & Double = js.native
  }
  
  inline def getEffectiveConnectionType(): EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveConnectionType")().asInstanceOf[EffectiveConnectionType]
  
  inline def getServiceWorkerStatus(): ServiceWorkerStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceWorkerStatus")().asInstanceOf[ServiceWorkerStatus]
  
  inline def getVisibilityState(): VisibilityState = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibilityState")().asInstanceOf[VisibilityState]
  
  inline def isValidCustomAttributeName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCustomAttributeName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidCustomAttributeValue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCustomAttributeValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceInts.`0`
    - typings.firebasePerformance.firebasePerformanceInts.`1`
    - typings.firebasePerformance.firebasePerformanceInts.`2`
    - typings.firebasePerformance.firebasePerformanceInts.`3`
    - typings.firebasePerformance.firebasePerformanceInts.`4`
  */
  trait EffectiveConnectionType extends StObject
  object EffectiveConnectionType {
    
    inline def CONNECTION_2G: `2` = 2.asInstanceOf[`2`]
    
    inline def CONNECTION_3G: `3` = 3.asInstanceOf[`3`]
    
    inline def CONNECTION_4G: `4` = 4.asInstanceOf[`4`]
    
    inline def CONNECTION_SLOW_2G: `1` = 1.asInstanceOf[`1`]
    
    inline def UNKNOWN: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceInts.`0`
    - typings.firebasePerformance.firebasePerformanceInts.`1`
    - typings.firebasePerformance.firebasePerformanceInts.`2`
    - typings.firebasePerformance.firebasePerformanceInts.`3`
  */
  trait ServiceWorkerStatus extends StObject
  object ServiceWorkerStatus {
    
    inline def CONTROLLED: `2` = 2.asInstanceOf[`2`]
    
    inline def UNCONTROLLED: `3` = 3.asInstanceOf[`3`]
    
    inline def UNKNOWN: `0` = 0.asInstanceOf[`0`]
    
    inline def UNSUPPORTED: `1` = 1.asInstanceOf[`1`]
  }
}
