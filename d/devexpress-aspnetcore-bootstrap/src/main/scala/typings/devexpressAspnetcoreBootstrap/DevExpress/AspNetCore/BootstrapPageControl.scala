package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapPageControl
  extends StObject
     with BootstrapTabControl {
  
  def getTabContentHTML(tab: BootstrapTab): String = js.native
  
  def performCallback(data: js.Any): js.Promise[Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[Unit]): Unit = js.native
  
  def setTabContentHTML(tab: BootstrapTab, html: String): Unit = js.native
}
