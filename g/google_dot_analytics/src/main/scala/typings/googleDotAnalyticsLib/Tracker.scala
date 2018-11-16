package typings
package googleDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker")
@js.native
class Tracker () extends js.Object {
  def _getAccount(): java.lang.String = js.native
  def _getName(): java.lang.String = js.native
  def _getVersion(): java.lang.String = js.native
  def _getVisitorCustomVar(index: scala.Double): java.lang.String = js.native
  def _setAccount(): java.lang.String = js.native
  def _setCustomVar(index: scala.Double, name: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def _setCustomVar(index: scala.Double, name: java.lang.String, value: java.lang.String, opt_scope: scala.Double): scala.Boolean = js.native
  def _setSampleRate(newRate: java.lang.String): scala.Unit = js.native
  def _setSessionCookieTimeout(cookieTimeoutMillis: scala.Double): scala.Unit = js.native
  def _setSiteSpeedSampleRate(sampleRate: scala.Double): scala.Unit = js.native
  def _setVisitorCookieTimeout(milliseconds: scala.Double): scala.Unit = js.native
  def _trackPageLoadTime(): scala.Unit = js.native
  def _trackPageview(): scala.Unit = js.native
}

