package typings.expoWebBrowser

import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expoWebBrowserStrings {
  @js.native
  sealed trait cancel extends WebBrowserResultType
  
  @js.native
  sealed trait dismiss extends WebBrowserResultType
  
  @js.native
  sealed trait opened extends WebBrowserResultType
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def dismiss: dismiss = "dismiss".asInstanceOf[dismiss]
  @scala.inline
  def opened: opened = "opened".asInstanceOf[opened]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

