package typings.emberTestHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settledMod {
  
  @JSImport("@ember/test-helpers/settled", JSImport.Default)
  @js.native
  def default(): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers/settled", "getSettledState")
  @js.native
  def getSettledState(): SettledState = js.native
  
  @JSImport("@ember/test-helpers/settled", "isSettled")
  @js.native
  def isSettled(): Boolean = js.native
  
  @js.native
  trait SettledState extends StObject {
    
    var hasPendingRequests: Boolean = js.native
    
    var hasPendingTimers: Boolean = js.native
    
    var hasPendingTransitions: Boolean | Null = js.native
    
    var hasPendingWaiters: Boolean = js.native
    
    var hasRunLoop: Boolean = js.native
    
    var pendingRequestCount: Double = js.native
  }
  object SettledState {
    
    @scala.inline
    def apply(
      hasPendingRequests: Boolean,
      hasPendingTimers: Boolean,
      hasPendingWaiters: Boolean,
      hasRunLoop: Boolean,
      pendingRequestCount: Double
    ): SettledState = {
      val __obj = js.Dynamic.literal(hasPendingRequests = hasPendingRequests.asInstanceOf[js.Any], hasPendingTimers = hasPendingTimers.asInstanceOf[js.Any], hasPendingWaiters = hasPendingWaiters.asInstanceOf[js.Any], hasRunLoop = hasRunLoop.asInstanceOf[js.Any], pendingRequestCount = pendingRequestCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettledState]
    }
    
    @scala.inline
    implicit class SettledStateMutableBuilder[Self <: SettledState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasPendingRequests(value: Boolean): Self = StObject.set(x, "hasPendingRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPendingTimers(value: Boolean): Self = StObject.set(x, "hasPendingTimers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPendingTransitions(value: Boolean): Self = StObject.set(x, "hasPendingTransitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPendingTransitionsNull: Self = StObject.set(x, "hasPendingTransitions", null)
      
      @scala.inline
      def setHasPendingWaiters(value: Boolean): Self = StObject.set(x, "hasPendingWaiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasRunLoop(value: Boolean): Self = StObject.set(x, "hasRunLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingRequestCount(value: Double): Self = StObject.set(x, "pendingRequestCount", value.asInstanceOf[js.Any])
    }
  }
}
