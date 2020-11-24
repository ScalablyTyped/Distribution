package typings.esebRequestState.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestState[T] extends js.Object {
  
  val attachment: js.UndefOr[T] = js.native
  
  /** Does request have "FAILED" state? */
  def isFailed(): Boolean = js.native
  
  /** Does request have "IN_PROGESS" state? */
  def isInProgress(): Boolean = js.native
  
  /** Does request have "NOT_REQUESTED" state? */
  def isNotRequested(): Boolean = js.native
  
  /** Does request have "SUCCEEDED" state? */
  def isSucceeded(): Boolean = js.native
  
  /** Does the request have "NOT_REQUESTED" or "FAILED" state? */
  def shouldBeRequested(): Boolean = js.native
  
  /** Does the request have "NOT_REQUESTED" or "IN_PROGESS" state? */
  def shouldShowAsLoading(): Boolean = js.native
  
  val state: State = js.native
  
  /** Create a new `RequestState` instance with the same state and the passed attachment. */
  def withAttachment[A](attachment: A): RequestState[A] = js.native
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
  implicit class RequestStateOps[Self <: RequestState[_], T] (val x: Self with RequestState[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsFailed(value: () => Boolean): Self = this.set("isFailed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInProgress(value: () => Boolean): Self = this.set("isInProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotRequested(value: () => Boolean): Self = this.set("isNotRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSucceeded(value: () => Boolean): Self = this.set("isSucceeded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldBeRequested(value: () => Boolean): Self = this.set("shouldBeRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldShowAsLoading(value: () => Boolean): Self = this.set("shouldShowAsLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithAttachment(value: js.Any => RequestState[js.Any]): Self = this.set("withAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachment(value: T): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
  }
}
