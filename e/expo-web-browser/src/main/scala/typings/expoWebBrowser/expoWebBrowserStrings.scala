package typings.expoWebBrowser

import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoWebBrowserStrings {
  
  @js.native
  sealed trait cancel extends WebBrowserResultType
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait dismiss extends WebBrowserResultType
  @scala.inline
  def dismiss: dismiss = "dismiss".asInstanceOf[dismiss]
  
  @js.native
  sealed trait done extends StObject
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait failed extends StObject
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait locked extends WebBrowserResultType
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait opened extends WebBrowserResultType
  @scala.inline
  def opened: opened = "opened".asInstanceOf[opened]
  
  @js.native
  sealed trait success extends StObject
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}
