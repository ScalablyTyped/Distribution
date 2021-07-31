package typings.googleAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracker extends StObject {
  
  def _getAccount(): String = js.native
  
  def _getName(): String = js.native
  
  def _getVersion(): String = js.native
  
  def _getVisitorCustomVar(index: Double): String = js.native
  
  def _setAccount(): String = js.native
  
  def _setCustomVar(index: Double, name: String, value: String): Boolean = js.native
  def _setCustomVar(index: Double, name: String, value: String, opt_scope: Double): Boolean = js.native
  
  def _setSampleRate(newRate: String): Unit = js.native
  
  def _setSessionCookieTimeout(cookieTimeoutMillis: Double): Unit = js.native
  
  def _setSiteSpeedSampleRate(sampleRate: Double): Unit = js.native
  
  def _setVisitorCookieTimeout(milliseconds: Double): Unit = js.native
  
  def _trackPageLoadTime(): Unit = js.native
  
  def _trackPageview(): Unit = js.native
}
