package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DataLoadingError event.
  */
trait ASPxClientDashboardDataLoadingErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Allows you to obtain the displayed error message.
    */
  def GetError(): String
  /**
    * Allows you to determine whether or not the error message will be shown.
    */
  def IsErrorMessageShown(): Boolean
  /**
    * Allows you to specify the displayed error message.
    * @param value A string value that specifies the displayed error message.
    */
  def SetError(value: String): Unit
  /**
    * Allows you to specify whether to show the error message.
    * @param value true, to show the error message; otherwise, false.
    */
  def ShowErrorMessage(value: Boolean): Unit
}

object ASPxClientDashboardDataLoadingErrorEventArgs {
  @scala.inline
  def apply(
    GetError: () => String,
    IsErrorMessageShown: () => Boolean,
    SetError: String => Unit,
    ShowErrorMessage: Boolean => Unit
  ): ASPxClientDashboardDataLoadingErrorEventArgs = {
    val __obj = js.Dynamic.literal(GetError = js.Any.fromFunction0(GetError), IsErrorMessageShown = js.Any.fromFunction0(IsErrorMessageShown), SetError = js.Any.fromFunction1(SetError), ShowErrorMessage = js.Any.fromFunction1(ShowErrorMessage))
  
    __obj.asInstanceOf[ASPxClientDashboardDataLoadingErrorEventArgs]
  }
}

