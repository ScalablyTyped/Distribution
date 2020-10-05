package typings.expoWebBrowser

import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoWebBrowserStrings {
  @js.native
  sealed trait cancel extends WebBrowserResultType
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait dismiss extends WebBrowserResultType
  
  @js.native
  sealed trait done extends js.Object
  
  @js.native
  sealed trait failed extends js.Object
  
  @js.native
  sealed trait opened extends WebBrowserResultType
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def dismiss: dismiss = "dismiss".asInstanceOf[dismiss]
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def opened: opened = "opened".asInstanceOf[opened]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

