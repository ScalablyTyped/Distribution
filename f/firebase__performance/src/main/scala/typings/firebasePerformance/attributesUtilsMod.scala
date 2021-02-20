package typings.firebasePerformance

import typings.firebasePerformance.firebasePerformanceNumbers.`0`
import typings.firebasePerformance.firebasePerformanceNumbers.`1`
import typings.firebasePerformance.firebasePerformanceNumbers.`2`
import typings.firebasePerformance.firebasePerformanceNumbers.`3`
import typings.firebasePerformance.firebasePerformanceNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesUtilsMod {
  
  @js.native
  sealed trait VisibilityState extends StObject
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "VisibilityState")
  @js.native
  object VisibilityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VisibilityState with Double] = js.native
    
    @js.native
    sealed trait HIDDEN extends VisibilityState
    /* 2 */ val HIDDEN: typings.firebasePerformance.attributesUtilsMod.VisibilityState.HIDDEN with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends VisibilityState
    /* 0 */ val UNKNOWN: typings.firebasePerformance.attributesUtilsMod.VisibilityState.UNKNOWN with Double = js.native
    
    @js.native
    sealed trait VISIBLE extends VisibilityState
    /* 1 */ val VISIBLE: typings.firebasePerformance.attributesUtilsMod.VisibilityState.VISIBLE with Double = js.native
  }
  
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "getEffectiveConnectionType")
  @js.native
  def getEffectiveConnectionType(): EffectiveConnectionType = js.native
  
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "getServiceWorkerStatus")
  @js.native
  def getServiceWorkerStatus(): ServiceWorkerStatus = js.native
  
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "getVisibilityState")
  @js.native
  def getVisibilityState(): VisibilityState = js.native
  
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "isValidCustomAttributeName")
  @js.native
  def isValidCustomAttributeName(name: String): Boolean = js.native
  
  @JSImport("@firebase/performance/dist/src/utils/attributes_utils", "isValidCustomAttributeValue")
  @js.native
  def isValidCustomAttributeValue(value: String): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceNumbers.`0`
    - typings.firebasePerformance.firebasePerformanceNumbers.`1`
    - typings.firebasePerformance.firebasePerformanceNumbers.`2`
    - typings.firebasePerformance.firebasePerformanceNumbers.`3`
    - typings.firebasePerformance.firebasePerformanceNumbers.`4`
  */
  trait EffectiveConnectionType extends StObject
  object EffectiveConnectionType {
    
    @scala.inline
    def CONNECTION_2G: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def CONNECTION_3G: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def CONNECTION_4G: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def CONNECTION_SLOW_2G: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def UNKNOWN: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceNumbers.`0`
    - typings.firebasePerformance.firebasePerformanceNumbers.`1`
    - typings.firebasePerformance.firebasePerformanceNumbers.`2`
    - typings.firebasePerformance.firebasePerformanceNumbers.`3`
  */
  trait ServiceWorkerStatus extends StObject
  object ServiceWorkerStatus {
    
    @scala.inline
    def CONTROLLED: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def UNCONTROLLED: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def UNKNOWN: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def UNSUPPORTED: `1` = 1.asInstanceOf[`1`]
  }
}
