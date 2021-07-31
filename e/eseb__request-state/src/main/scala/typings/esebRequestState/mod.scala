package typings.esebRequestState

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@eseb/request-state", JSImport.Default)
  @js.native
  class default[T] ()
    extends StObject
       with RequestState[T] {
    def this(state: State) = this()
    def this(state: Unit, attachment: T) = this()
    def this(state: State, attachment: T) = this()
    
    /** Does request have "FAILED" state? */
    /* CompleteClass */
    override def isFailed(): Boolean = js.native
    
    /** Does request have "IN_PROGESS" state? */
    /* CompleteClass */
    override def isInProgress(): Boolean = js.native
    
    /** Does request have "NOT_REQUESTED" state? */
    /* CompleteClass */
    override def isNotRequested(): Boolean = js.native
    
    /** Does request have "SUCCEEDED" state? */
    /* CompleteClass */
    override def isSucceeded(): Boolean = js.native
    
    /** Does the request have "NOT_REQUESTED" or "FAILED" state? */
    /* CompleteClass */
    override def shouldBeRequested(): Boolean = js.native
    
    /** Does the request have "NOT_REQUESTED" or "IN_PROGESS" state? */
    /* CompleteClass */
    override def shouldShowAsLoading(): Boolean = js.native
    
    /* CompleteClass */
    override val state: State = js.native
    
    /** Create a new `RequestState` instance with the same state and the passed attachment. */
    /* CompleteClass */
    override def withAttachment[A](attachment: A): RequestState[A] = js.native
  }
  
  @JSImport("@eseb/request-state", "FAILED")
  @js.native
  val FAILED: RequestState[scala.Nothing] = js.native
  
  @JSImport("@eseb/request-state", "IN_PROGRESS")
  @js.native
  val IN_PROGRESS: RequestState[scala.Nothing] = js.native
  
  @JSImport("@eseb/request-state", "NOT_REQUESTED")
  @js.native
  val NOT_REQUESTED: RequestState[scala.Nothing] = js.native
  
  @JSImport("@eseb/request-state", "SUCCEEDED")
  @js.native
  val SUCCEEDED: RequestState[scala.Nothing] = js.native
  
  trait RequestState[T] extends StObject {
    
    val attachment: js.UndefOr[T] = js.undefined
    
    /** Does request have "FAILED" state? */
    def isFailed(): Boolean
    
    /** Does request have "IN_PROGESS" state? */
    def isInProgress(): Boolean
    
    /** Does request have "NOT_REQUESTED" state? */
    def isNotRequested(): Boolean
    
    /** Does request have "SUCCEEDED" state? */
    def isSucceeded(): Boolean
    
    /** Does the request have "NOT_REQUESTED" or "FAILED" state? */
    def shouldBeRequested(): Boolean
    
    /** Does the request have "NOT_REQUESTED" or "IN_PROGESS" state? */
    def shouldShowAsLoading(): Boolean
    
    val state: State
    
    /** Create a new `RequestState` instance with the same state and the passed attachment. */
    def withAttachment[A](attachment: A): RequestState[A]
  }
  object RequestState {
    
    @scala.inline
    def apply[T](
      isFailed: () => Boolean,
      isInProgress: () => Boolean,
      isNotRequested: () => Boolean,
      isSucceeded: () => Boolean,
      shouldBeRequested: () => Boolean,
      shouldShowAsLoading: () => Boolean,
      state: State,
      withAttachment: js.Any => RequestState[js.Any]
    ): RequestState[T] = {
      val __obj = js.Dynamic.literal(isFailed = js.Any.fromFunction0(isFailed), isInProgress = js.Any.fromFunction0(isInProgress), isNotRequested = js.Any.fromFunction0(isNotRequested), isSucceeded = js.Any.fromFunction0(isSucceeded), shouldBeRequested = js.Any.fromFunction0(shouldBeRequested), shouldShowAsLoading = js.Any.fromFunction0(shouldShowAsLoading), state = state.asInstanceOf[js.Any], withAttachment = js.Any.fromFunction1(withAttachment))
      __obj.asInstanceOf[RequestState[T]]
    }
    
    @scala.inline
    implicit class RequestStateMutableBuilder[Self <: RequestState[?], T] (val x: Self & RequestState[T]) extends AnyVal {
      
      @scala.inline
      def setAttachment(value: T): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      @scala.inline
      def setIsFailed(value: () => Boolean): Self = StObject.set(x, "isFailed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsInProgress(value: () => Boolean): Self = StObject.set(x, "isInProgress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNotRequested(value: () => Boolean): Self = StObject.set(x, "isNotRequested", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSucceeded(value: () => Boolean): Self = StObject.set(x, "isSucceeded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldBeRequested(value: () => Boolean): Self = StObject.set(x, "shouldBeRequested", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldShowAsLoading(value: () => Boolean): Self = StObject.set(x, "shouldShowAsLoading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithAttachment(value: js.Any => RequestState[js.Any]): Self = StObject.set(x, "withAttachment", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.esebRequestState.esebRequestStateStrings.FAILED
    - typings.esebRequestState.esebRequestStateStrings.IN_PROGRESS
    - typings.esebRequestState.esebRequestStateStrings.NOT_REQUESTED
    - typings.esebRequestState.esebRequestStateStrings.SUCCEEDED
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def FAILED: typings.esebRequestState.esebRequestStateStrings.FAILED = "FAILED".asInstanceOf[typings.esebRequestState.esebRequestStateStrings.FAILED]
    
    @scala.inline
    def IN_PROGRESS: typings.esebRequestState.esebRequestStateStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typings.esebRequestState.esebRequestStateStrings.IN_PROGRESS]
    
    @scala.inline
    def NOT_REQUESTED: typings.esebRequestState.esebRequestStateStrings.NOT_REQUESTED = "NOT_REQUESTED".asInstanceOf[typings.esebRequestState.esebRequestStateStrings.NOT_REQUESTED]
    
    @scala.inline
    def SUCCEEDED: typings.esebRequestState.esebRequestStateStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.esebRequestState.esebRequestStateStrings.SUCCEEDED]
  }
}
